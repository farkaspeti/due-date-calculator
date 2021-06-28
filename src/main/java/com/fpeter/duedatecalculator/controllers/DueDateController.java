package com.fpeter.duedatecalculator.controllers;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpeter.duedatecalculator.dtos.DueDateDto;
import com.fpeter.duedatecalculator.services.DueDateService;

@RestController
@RequestMapping("value = /duedate")
public class DueDateController {
	
	private final DueDateService dueDateService;
	
	public DueDateController(DueDateService dueDateService) {
		this.dueDateService = dueDateService;
	}
	
	 @GetMapping(value = "/time/turnaround", produces = "application/json")	
	 public ResponseEntity<DueDateDto> getDueDate(@RequestParam ("time") @DateTimeFormat(pattern="MM/dd/yyyy") Calendar time,
	 											  @RequestParam ("turnaround") int turnaround) throws Exception {
	 	return dueDateService.CalculateDueDate(time, turnaround);
	 }
}