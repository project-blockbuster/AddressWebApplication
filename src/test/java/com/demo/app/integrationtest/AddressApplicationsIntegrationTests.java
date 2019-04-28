package com.demo.app.integrationtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class AddressApplicationsIntegrationTests {
	
	@LocalServerPort
    private int port;
	 @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void checkingChannels() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/users/10099/address",
                String.class)).contains("19759");
    }
}