package com.fpeter.duedatecalculator.dtos;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DueDateDto {

    private Calendar time;

    private int turnaround;

}