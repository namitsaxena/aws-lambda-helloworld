package com.ns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.namitsaxena.aws.lambda.HelloWorldLambda;

public class HelloTest {

	@Test
	public void test() {
		HelloWorldLambda lambda = new HelloWorldLambda();
		
		System.out.println("Return Val = " + String.valueOf(10));
		System.out.println("Return Val = " + ("V=" + 10));
		//lambda.myHandler(10, context);
		//fail("Not yet implemented");
	}

}
