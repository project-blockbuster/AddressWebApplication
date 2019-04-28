package com.demo.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.demo.app.model.Address;

@Component
public class AddressService {

	static Map<String,Address> addressInfo = new HashMap<String,Address>();
	static {
		// Initialize Data
		Address address1 = new Address("10021", "P.O. Box 132 1599 Curabitur Rd", "Bandera","South Dakota","United States","45149");
		Address address2 = new Address("10099", "P.O. Box 597 4156 Tincidunt Ave", "Green Bay","Indiana","United States","19759");
		addressInfo.put("10021", address1);
		addressInfo.put("10099", address2);
	}

	public Address getAddress(String userId) {
		return addressInfo.get(userId);
	}
}