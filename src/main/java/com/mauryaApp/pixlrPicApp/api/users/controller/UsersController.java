package com.mauryaApp.pixlrPicApp.api.users.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauryaApp.pixlrPicApp.api.users.model.CreateUser;
import com.mauryaApp.pixlrPicApp.api.users.model.CreateUserResp;
import com.mauryaApp.pixlrPicApp.api.users.service.UsersService;
import com.mauryaApp.pixlrPicApp.api.users.shared.UsersDto;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	Environment env;
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/status/check")
	public String status() {
		return "Users Service Working on Port: " + env.getProperty("local.server.port");
	}

	@PostMapping
	public ResponseEntity<CreateUserResp> createUser(@Valid @RequestBody CreateUser userDetails) {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UsersDto usersDto = modelMapper.map(userDetails, UsersDto.class);
		
		UsersDto createdUser = usersService.createUser(usersDto);
		
		CreateUserResp returnValue = modelMapper.map(createdUser, CreateUserResp.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
	
}
