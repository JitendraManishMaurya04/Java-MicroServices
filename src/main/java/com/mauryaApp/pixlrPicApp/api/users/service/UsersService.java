package com.mauryaApp.pixlrPicApp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.mauryaApp.pixlrPicApp.api.users.shared.UsersDto;


public interface UsersService extends UserDetailsService{
	
	public UsersDto createUser(UsersDto userDetails);
	public UsersDto getUserDetailsByEmail(String email);
}
