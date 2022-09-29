package com.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySource("classpath:db.Properties")
@ComponentScan(basePackages="com.demo")
public class WebAppConfig {
	@Autowired
	Environment environment;

	@Bean // creating an bean of datasource interface
	public DataSource getDataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		driverManagerDataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		driverManagerDataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		driverManagerDataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		
		return driverManagerDataSource;
	}

	/** here create one method which return object of properties class **/
	public Properties getProperties() {
		// here we create object properties class
		Properties properties = new Properties();

		// here we put properties of hibernate
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean // creating an bean of LocalSessionFactoryBean class
	public LocalSessionFactoryBean sessionFactoryBean() {
		// here we create object LocalSessionFactoryBean class
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		factoryBean.setDataSource(getDataSource());
		factoryBean.setPackagesToScan(new String[] {"com.demo.model"});
		factoryBean.setHibernateProperties(getProperties());
		return factoryBean;
	}

	@Bean // creating an bean of ViewResolver interface
	public ViewResolver getViewResolver() {
		/**
		 * here we create object InternalResourceViewResolver class which internally
		 * implement ViewResolver
		 * 
		 * using that we set prefix and suffix
		 */
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

}
