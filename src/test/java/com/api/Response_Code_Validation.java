package com.api;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class Response_Code_Validation {
@Test
private void data_Validation() {
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification requestSpecification = RestAssured.given();
	Response response = requestSpecification.get("/api/users/2");
	String response_Body = response.asString();
	System.out.println(response_Body);
	int statusCode = response.getStatusCode();
	System.out.println("Status code:"+statusCode);
	Assert.assertEquals(statusCode, 200);
	ResponseBody body = response.body();
	String sessionId = response.getSessionId();
	String contentType = response.getContentType();
	Headers headers = response.getHeaders();
	long time = response.getTime();
	System.out.println("Data Validation Successfully");
	
}

}
