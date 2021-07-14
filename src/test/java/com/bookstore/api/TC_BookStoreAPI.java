package com.bookstore.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TC_BookStoreAPI {
	@Test
		public void test_getAllBooks()
		{
			given()
			
			.when()
				.get("https://bookstore.toolsqa.com/BookStore/v1/Books")
			.then()
				.statusCode(200);
			
		}

}
