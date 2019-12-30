package com.finder.bar.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 28/04/2019
 */
@Configuration
public class DataSourceConfiguration {
	@Autowired
	private DataSourceProperties properties;

	@Bean
	public DataSource dataSource() {
		return null;
	}
}
