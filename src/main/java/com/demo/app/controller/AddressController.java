package com.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.app.model.Address;
import com.demo.app.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/users/{userId}/address", produces = "application/json")
	public Address retrieveAddress(@PathVariable String userId) {
		return addressService.getAddress(userId);
	}
}