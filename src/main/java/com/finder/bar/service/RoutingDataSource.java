package com.finder.bar.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.stereotype.Service;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 27/30/2019
 */

@Service
public class RoutingDataSource extends AbstractDataSource {
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public Connection getConnection() throws SQLException {
		return determineTargetDataSource().getConnection();
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return determineTargetDataSource().getConnection(username, password);
	}

	private DataSource determineTargetDataSource() {
		return (DataSource) this.applicationContext.getBean("abc", RoutingDataSourceService.class);
	}

}
