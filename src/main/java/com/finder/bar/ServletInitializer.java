package com.finder.bar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 22/01/2019
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FinderbarApplication.class);
	}

}
