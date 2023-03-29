package com.string;

public class DuplicateWords 
{
	public static void main (String[] args)
	{
		String string= "this is java program java duplicate program ";
		
		int count;
		//lower case
		
		string=string.toLowerCase();
		
		String words[]=string.split("\\s");

		for(int i=0;i<words.length;i++)
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="visited";
				}
			}
			if(count>1)
				System.out.println(words[i]+":"+count);
			
		}	
	}
          
}
