package com.bkh.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.bkh.service.AppService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AppController.class)
@ComponentScan(basePackageClasses = { AppService.class })
public class AppControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testSayHello() throws Exception {
		MockHttpServletResponse httpResponse = mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse();
		String response = httpResponse.getContentAsString();
		Assert.assertNotNull(response);
	}

}
