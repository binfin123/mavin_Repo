package com.maxapp;

import java.util.ResourceBundle;

public class Maxelement {
	
	public int findLargest (int []arr, int N)
	{
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
	    int fin=Integer.parseInt(rb.getString("max"));
	   
	    for (int i = 1; i < N; i++) 
	    {
	        // Update the largest element
	        if (arr[0] < (arr[i])) 
	        {
	            arr[0] = (arr[i]);
	        }
	    }
	    
	    int val = (arr[0]);
	 
	    // return the largest number
	    
	    
	    if(fin==val)
		{
			return 1; 
		}
		else
		{
			return 0 ;
		}
	    

	}
	 
	
	public static void main(String[] args)
	{
	    int N = 4;
	    
	    int arr[]= {10,15,100,10};
	    
	    
	    Maxelement ob=new Maxelement();
	    int val= ob.findLargest(arr, N);
	     
	    System.out.print(val);
	}

}
