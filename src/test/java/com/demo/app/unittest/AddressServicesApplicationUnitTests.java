package com.demo.app.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.app.model.Address;
import com.demo.app.service.AddressService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServicesApplicationUnitTests {
	
	@Autowired
	private AddressService service;
	
	private String validUserId = "10021";
	private String validStateName = "South Dakota";
	
	 @Before	
	 public void beforeMethod(){
	 }
	  
	@After 
	public void afterMethod() {
	} 
	
	 @Test
	 public void testAddressInfo() {
		 Address address = service.getAddress(validUserId);
		 assertEquals("!Address Retrieve Test Failed",validStateName, address.getState());
	 }
}
