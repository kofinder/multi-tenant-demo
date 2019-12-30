package com.finder.bar.service;

import com.finder.bar.domain.user.AppUser;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 27/31/2019
 */
public class FinderSecurityPlatformSecurityContext implements PlatformSecurityContext {

	@Override
	public AppUser authenticatedUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getAuthenticatedUserIfPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesPasswordHasToBeRenewed(AppUser currentUser) {
		// TODO Auto-generated method stub
		return false;
	}

}
