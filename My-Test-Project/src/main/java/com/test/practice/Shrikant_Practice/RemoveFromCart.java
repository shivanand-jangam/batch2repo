package com.test.practice.Shrikant_Practice;

import org.apache.http.impl.bootstrap.HttpServer;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RemoveFromCart {

	public static void main(String[] args) {
	  RestAssured.baseURI="https://bookcart.azurewebsites.net/api";
	  RequestSpecification request=RestAssured.given();
	  Response response=request.request(Method.DELETE,"/ShoppingCart/14936");
	  int statuscode=response.getStatusCode();
	  System.out.println("statuscode is"+statuscode);
	  Assert.assertEquals(statuscode,200);
	  String statusline=response.statusLine();
	  System.out.println("statusline"+statusline);
	}

}
