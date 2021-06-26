package com.fpeter.duedatecalculator.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Smoke test to check the context is creating the service.
 */
@SpringBootTest
public class DueDateServiceTests {

	@Autowired
	private DueDateService service;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(service).isNotNull();
	}
}
