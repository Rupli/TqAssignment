package com.Test2;

import java.util.Scanner;

public class SbiAccont {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Account a1=new Account();
		Account ac=new Account(12,9876543,"YPM123",123354,55776.5f);
		
		System.out.println(" id "+ac.id + " panCard "+ac.panCard + " balance "+ ac.balance);
	}

}
