package com.finder.bar.configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 22/08/2019
 */
@Configuration
@ApplicationPath("/api/v1.0/")
public class JerseyResourceConfiguration extends ResourceConfig {
	@PostConstruct
	public void init() {
		packages("com.finder.bar.api");
	}
}
