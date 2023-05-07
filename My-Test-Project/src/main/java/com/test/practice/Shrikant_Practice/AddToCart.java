package com.test.practice.Shrikant_Practice;

import java.util.List;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddToCart {

	public static void main(String[] args) {
		RestAssured.baseURI="https://bookcart.azurewebsites.net/api";
		RequestSpecification request= RestAssured.given();
		Response response=request.request(Method.POST,"/ShoppingCart/AddToCart/14936/2");
		Response response1=request.request(Method.POST,"/ShoppingCart/AddToCart/14936/3");
		String header=response.header("Content-Type");
		System.out.println("header="+header);
		Assert.assertEquals(false, false);
		Headers headers=response.getHeaders();
		int countOfHeaders=headers.asList().size();
		System.out.println(countOfHeaders);
		
		
		
		
		int statuscode=response.getStatusCode();
		System.out.println("statuscode is"+statuscode);
		Assert.assertEquals(statuscode,200,"status code is not matched");
		String statusline=response.getStatusLine();
		System.out.println("statusline is"+statusline);

	}

}
