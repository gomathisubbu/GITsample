package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends BaseClass {

	@Before

	public void bef() {
		launchBrowser();
		maximize();
	}

	@Before (order=2)

	public void bef2() {
		System.out.println("bef2");
	}

	@Before (order=3)

	public void bef3() {
		System.out.println("bef3");
	}

	@Before (order=1)

	public void bef1() {
		System.out.println("bef1");
	}

	@After  (order=3)
	public void aft3() {
		System.out.println("aft3");
	}

	@After (order=1)
	public void aft1() {
		System.out.println("aft1");
	}

	@After  (order=2)
	public void aft2() {
		System.out.println("aft2");
	}

	@After  (order=4)
	public void aft4() {
		System.out.println("aft4");
	}

	@After
	public void aft() {
		toQuit();
	}
}
