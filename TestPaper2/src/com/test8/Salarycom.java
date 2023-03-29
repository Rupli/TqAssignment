package com.test8;

import java.util.Comparator;

public class Salarycom implements Comparator<Employye> {

	@Override
	public int compare(Employye e1, Employye e2) {

		return (int) (e1.getSalary() - e2.getSalary());
	}

}
