package com.test9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeTest {
	
	public static void createDepartmentNumberEmployeeMap(ArrayList<Emoloyee> al) {
		HashMap<Department, Integer> deptmap = new HashMap<>();

		Iterator<Emoloyee> itr = al.iterator();
		int count;
		while (itr.hasNext()) {
			count = 1;
			Emoloyee e = itr.next();
			if (!deptmap.containsKey(e.getDepartment())) {
				deptmap.put(e.getDepartment(), count);
			} else {
				count = deptmap.get(e.getDepartment());
				deptmap.put(e.getDepartment(), count + 1);
			}

		}

		for (Map.Entry<Department, Integer> en : deptmap.entrySet()) {

			System.out.println(en.getKey().getDname() + " :" + en.getValue());

			System.out.println();
			System.out.println("===========================================================");
		}

	}

	public static void createDepartmentEmployee(ArrayList<Emoloyee> al) {
		HashMap<Department, ArrayList<String>> deptmap = new HashMap<>();

		Iterator<Emoloyee> itr = al.iterator();
		ArrayList<String> emplist;

		while (itr.hasNext()) {
			Emoloyee e = itr.next();
			if (!deptmap.containsKey(e.getDepartment())) {
				emplist = new ArrayList<>();

			} else {
				emplist = deptmap.get(e.getDepartment());
			}
			emplist.add(e.getName());
			deptmap.put(e.getDepartment(), emplist);
		}
		for (Map.Entry<Department, ArrayList<String>> en : deptmap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println("Employee list:");
			emplist = en.getValue();
			for (String s : emplist) {
				System.out.println(s + " ");

			}
			System.out.println();

		}
	}

	public static void main(String args[]) {
		ArrayList<Emoloyee> emp = new ArrayList<>();

		emp.add(new Emoloyee(1,12000f,"rupali",new Department(2,"devlopment")));
		emp.add(new Emoloyee(2,18000f,"shreya",new Department(3,"HR")));
		emp.add(new Emoloyee(3,16000f,"pooja",new Department(4,"Marketing")));
		emp.add(new Emoloyee(4,15000f,"natsha",new Department(11,"Hr")));
		
		createDepartmentNumberEmployeeMap(emp);
		createDepartmentEmployee(emp);

	}
	
	
	
	}


