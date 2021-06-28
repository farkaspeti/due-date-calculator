package com.fpeter.duedatecalculator.services;

import java.util.Calendar;

import org.springframework.http.ResponseEntity;

import com.fpeter.duedatecalculator.dtos.DueDateDto;
import com.fpeter.duedatecalculator.exceptions.DueDateServiceException;

public interface DueDateService {

	public ResponseEntity<DueDateDto> CalculateDueDate(Calendar submitDate, int turnaround) throws DueDateServiceException;
}
