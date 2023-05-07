package com.test.practice.Shrikant_Practice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetListOfAvalaibleBooks {

	public static void main(String[] args) {

		RestAssured.baseURI="https://bookcart.azurewebsites.net";
		RequestSpecification request=RestAssured.given();
		Response response=request.request(Method.GET,"/api/Book");
		String responseBody=response.getBody().asPrettyString();
		System.out.println(responseBody);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
	}

}
