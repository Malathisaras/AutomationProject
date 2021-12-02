package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	private void dress() {
		System.out.println("dresses");
	}
	@Test
	private void tshirts() {
	System.out.println("Tshirts");
	}
	@Ignore
	@Test
	private void books() {
		System.out.println("books");

	}
	@Test(enabled=false)
	private void children() {
	System.out.println("children");
	}

}
