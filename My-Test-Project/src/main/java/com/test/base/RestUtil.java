package com.test.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.pojo.CartBookDetails;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestUtil {
	static Map<String, String> header = new HashMap<>();
	static String jsonBody = "";
	static String endpoint = "";
	static Response response;
	static JsonPath responsePath;
	static List<CartBookDetails> bookDetails;
	ObjectMapper objectMapper = new ObjectMapper();

	public void feedBaseURI(String baseUri) {
		RestAssured.baseURI = baseUri;
	}

	public void feedHeaders(String headerkey, String value) {
		header.put(headerkey, value);
	}

	public void feedBody(String body) {
		jsonBody = body;
	}

	public void feedEndpoint(String api) {
		endpoint = api;
	}

	public void hitAPIRequest(String type) {
		if (type.equalsIgnoreCase("POST")) {
			response = RestAssured.given().headers(header).when().post(endpoint);
			System.out.println(response.prettyPrint());
		} else if (type.equalsIgnoreCase("GET")) {
			response = RestAssured.given().headers(header).when().get(endpoint);
			System.out.println(response.prettyPrint());
		} else if (type.equalsIgnoreCase("DELETE")) {
			response = RestAssured.given().headers(header).when().delete(endpoint);
			System.out.println(response.getBody().asPrettyString());
			responsePath = response.jsonPath();
		}
		System.out.println(response.statusCode());
		System.out.println(response.asString());
	}

	public void validateResponseCodeAs(int code) {
		Assert.assertEquals(response.statusCode(), code);
		System.out.println("Verified Response Code as : " + code);
	}

	public void validateBookIdAs(int id) {
		String responseArray = response.asPrettyString();

		try {
			bookDetails = objectMapper.readValue(responseArray, new TypeReference<List<CartBookDetails>>() {
			});
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(bookDetails.get(0).book.bookId, id);
		System.out.println("Verified bookDetails.book.bookId as : " + id);
	}

	public void validateTokenIsGenerated() {
		JsonPath jsonPathEvaluator = response.jsonPath();
		Assert.assertTrue(jsonPathEvaluator.get("token") != "");
		System.out.println("Verified Response Token Is generated as : " + jsonPathEvaluator.get("token"));
	}

	public void dummy() {
		RestAssured.given().headers(header).body(jsonBody).when().post("End point").then().statusCode(200);
	}

//	 public static void main(String[] args) {
//	 RestUtil restUtil = new RestUtil();
//	 restUtil.feedBaseURI("https://bookcart.azurewebsites.net");
//	 restUtil.feedHeaders("Content-Type", "application/json");
//	 restUtil.feedEndpoint("/api/login");
//	 restUtil.feedBody(
//	 "{\"username\":\"Shiva5511\",\"password\":\"Shivajangam@5511\"}");
//	 restUtil.hitAPIRequest("POST");
//	 }
}
