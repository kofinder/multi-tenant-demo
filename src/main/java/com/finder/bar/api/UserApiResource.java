package com.finder.bar.api;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/user")
@Component
@Scope("singleton")
@Api(value = "user", description = "write about this api process.")
public class UserApiResource  {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@ApiOperation(value = "Retrieve All User", httpMethod = "GET", notes = "put the notes")
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "put the description"),
	    @ApiResponse(code = 404, message = "put the description")
	})
	public String retriveAllUser() {
		logger.info("<============= processing ======>");
		return "hi jameslwin";
	}
	
}


