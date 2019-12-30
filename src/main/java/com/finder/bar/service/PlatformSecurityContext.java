package com.finder.bar.service;

import com.finder.bar.domain.user.AppUser;

/**
 * @author jameslwin
 * @Email finderbar.theinlwin@gmail.com
 * @Website www.finderbar.com
 * @createdAt 27/31/2019
 */
public interface PlatformSecurityContext {
	AppUser authenticatedUser();

	AppUser getAuthenticatedUserIfPresent();

	boolean doesPasswordHasToBeRenewed(AppUser currentUser);

}
