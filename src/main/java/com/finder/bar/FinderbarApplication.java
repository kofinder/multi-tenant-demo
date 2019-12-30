package com.finder.bar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.finder.bar.configuration.AbstractApplicationConfiguration;
import com.finder.bar.configuration.DataSourceConfiguration;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 22/01/2019
 */
@SpringBootApplication
public class FinderbarApplication {
	@Import({ DataSourceConfiguration.class })
	private static class Configuration extends AbstractApplicationConfiguration { }

	public static void main(String[] args) {
		SpringApplication.run(FinderbarApplication.class, args);
	}

}
