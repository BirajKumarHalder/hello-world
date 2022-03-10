package com.bkh.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppServiceTest {

	@InjectMocks
	private AppService appService;

	@Test
	public void testSayHello() {
		String response = appService.sayHello();
		Assert.assertNotNull(response);
	}

}
