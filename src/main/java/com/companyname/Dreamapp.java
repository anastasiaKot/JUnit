package com.companyname;

public class Dreamapp {
	public Boolean validate(final Integer prime_number)
    {
       for (int i = 2; i < (prime_number / 2); i++)
       {
    
       if (prime_number % i == 0)
    			   {
    		          return false;
    			   }
       }
       
       return true;
    }
  }


