package com.methods;

public class Split {

	public static void main(String args[])
    {
       
        String str = "java@program";
        String[] arrOfStr = str.split("@", 2);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }


}
