package com.finder.bar.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 28/14/2019
 */
@Service
public class JDBCDriverConfiguration {

	@Value("${jdbc.driver.classname}")
	private String driverClassName;
	
	@Value("${jdbc.driver.protocol}")
	private String protocol;
	
	@Value("${jdbc.driver.subprotocol}")
	private String subProtocol;
	
	@Value("${jdbc.driver.port}")
	private Integer port;

	public String getDriverClassName() {
		return this.driverClassName;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public String getSubProtocol() {
		return this.subProtocol;
	}

	public Integer getPort() {
		return this.port;
	}

	public String getDriverUrl(String schemaServer, String schemaServerPort, String schemaName) {
		return new StringBuilder(protocol).append(":").append(subProtocol).append("://")
				.append(schemaServer).append(':').append(schemaServerPort).append('/').append(schemaName).toString();
	}

}
