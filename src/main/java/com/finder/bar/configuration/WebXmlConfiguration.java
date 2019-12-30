package com.finder.bar.configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.finder.bar.filter.ResponseCorsFilter;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 27/39/2019
 */
@Configuration
public class WebXmlConfiguration {

	@Bean
	public Filter springSecurityFilterChain() {
		return new DelegatingFilterProxy();
	}

	@Bean
	public ServletRegistrationBean<Servlet> jersey() {
		Servlet jerseyServlet = new SpringServlet();
		ServletRegistrationBean<Servlet> servletRegBean = new ServletRegistrationBean<Servlet>();
		servletRegBean.setServlet(jerseyServlet);
		servletRegBean.addUrlMappings("/api/v1/*");
		servletRegBean.setName("jersey-servlet");
		servletRegBean.setLoadOnStartup(1);
		servletRegBean.addInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
		servletRegBean.addInitParameter("com.sun.jersey.spi.container.ContainerResponseFilters",
				ResponseCorsFilter.class.getName());
		servletRegBean.addInitParameter("com.sun.jersey.config.feature.DisableWADL", "true");

		return servletRegBean;
	}

	@Bean
	public FilterRegistrationBean<?> filterRegistrationBean() {
		@SuppressWarnings("rawtypes")
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		// filterRegistrationBean.setFilter(basicAuthenticationProcessingFilter);
		filterRegistrationBean.setEnabled(false);
		return filterRegistrationBean;
	}
}
