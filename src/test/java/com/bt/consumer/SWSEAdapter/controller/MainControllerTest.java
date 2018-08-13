package com.bt.consumer.SWSEAdapter.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest(value = MainController.class, secure = false)
public class MainControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testWelcome() throws Exception {
		MvcResult result = mockMvc.perform(get("/")).andExpect(status().isOk()).andReturn();
		Assert.assertTrue(result.getResponse().getContentAsString().startsWith("Hurray! server is up and running"));
	}

	@Test
	public void testToggleMode() throws Exception {
		MvcResult result = mockMvc.perform(get("/toggleMode")).andExpect(status().isOk()).andReturn();
		Assert.assertTrue(result.getResponse().getContentAsString().startsWith("Now Running in wsdl mode"));
		result = mockMvc.perform(get("/toggleMode")).andExpect(status().isOk()).andReturn();
		Assert.assertTrue(result.getResponse().getContentAsString().startsWith("Now Running in stub mode"));
	}

}
