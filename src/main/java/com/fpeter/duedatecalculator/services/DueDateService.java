package com.fpeter.duedatecalculator.services;

import java.util.Calendar;

import com.fpeter.duedatecalculator.exceptions.DueDateServiceException;

public interface DueDateService {

	Calendar CalculateDueDate(Calendar submitDate, int turnaround) throws DueDateServiceException;
}
