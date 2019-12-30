package com.finder.bar.service.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.finder.bar.service.PlatformSecurityContext;
import com.finder.bar.service.RoutingDataSource;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 27/50/2019
 */
@Service
public class QuestionReadPlatformServiceJdbcRepository implements QuestionReadPlatformService{
	
	private final JdbcTemplate jdbcTemplate;
	private final PlatformSecurityContext context;
	
	@Autowired
	public QuestionReadPlatformServiceJdbcRepository(final PlatformSecurityContext context, final RoutingDataSource dataSource) {
		this.context = context;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
