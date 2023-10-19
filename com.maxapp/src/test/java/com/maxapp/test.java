package com.maxapp;

import org.testng.Assert;
import org.testng.annotations.Test;


public class test {

	@Test
	public void test1()
	{
		int arr[]= {10,-100,100,5};
		int N=4;
		Maxelement l=new Maxelement();
		Assert.assertEquals(1,l.findLargest(arr, N));
		
	}
	@Test
	public void test2()
	{
		int arr[]= {10,-100,11,5};
		int N=4;
		Maxelement l=new Maxelement();
		Assert.assertEquals(0,l.findLargest(arr, N));
		
		
	}
}
