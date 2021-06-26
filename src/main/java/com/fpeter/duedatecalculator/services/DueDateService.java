package com.fpeter.duedatecalculator.services;

import java.util.Calendar;

public interface DueDateService {

	Calendar CalculateDueDate(Calendar submitDate, int turnaround) throws DueDateServiceException;
}
