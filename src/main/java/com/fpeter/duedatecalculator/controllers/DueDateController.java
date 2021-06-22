package com.fpeter.duedatecalculator.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("value = /duedate")
public class DueDateController {
/*	
	private final DueDateService dueDateService;
	
	public DueDateController(DueDateService dueDateService) {
		this.dueDateService = dueDateService;
	}
	
	 @GetMapping(value = "/time/turnaround", produces = "application/json")	
	 public ResponseEntity<DueDateDto> getDueDate(@RequestParam Calendar time @DateTimeFormat(pattern="MM/dd/yyyy"),
	 											  @RequestParam int turnaround) throws Exception {
	 	return dueDateService.CalculateDueDate(time, turnaround);
	 }
	    */
}