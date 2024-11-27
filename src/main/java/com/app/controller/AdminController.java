package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.exceptions.AdminException;
import com.app.model.Admin;
import com.app.service.AdminServiceImpl;


@RestController
public class AdminController {
	
	@Autowired
	private AdminServiceImpl asi;
	
	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException
	{
		 Admin adm = asi.addAdmin(admin);
		 //add some features here to improve the performance!
		//Directed from master branch!

		 return new ResponseEntity<>(adm,HttpStatus.OK);
		//there is no need to add some more features for it !
	}

}
