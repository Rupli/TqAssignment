 package com.test8;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeLst {

	public static void main(String[] args) {

		ArrayList<Employye> lst = new ArrayList<>();

		lst.add(new Employye(1, "rita", 2000f));
		lst.add(new Employye(2, "roshni", 3400f));
		lst.add(new Employye(3, "nachiket", 3000f));
		lst.add(new Employye(5, "natasha", 4000f));
		lst.add(new Employye(7, "awani", 9000f));
		lst.add(new Employye(9, "prem", 5000f));

		for (Employye e1 : lst) {
			System.out.println(e1);
		}
		System.out.println("-----------------------------------------");

		Collections.sort(lst, new Salarycom());
		for (Employye e1 : lst) {
			System.out.println(e1);
		}

	}

}
