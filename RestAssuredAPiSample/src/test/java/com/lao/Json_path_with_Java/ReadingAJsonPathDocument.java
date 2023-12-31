package com.lao.Json_path_with_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonPathDocument {


	public static void readJson() throws IOException {

		File jsonFile = new File("src/test/resources/Bookstore.json");

		List<Object> pricelist = JsonPath.read(jsonFile, "$..price");

		for (Object price : pricelist) {
			System.out.println(price);
		}

	}

	public static void readAjson() throws IOException {

		FileInputStream jsonfile = new FileInputStream("src/test/resources/Bookstore.json");

		Object parsedjosdoc =Configuration
				.defaultConfiguration()
				.jsonProvider();
		//.parse(jsonfile.readAllByte());

		List<Object> categorylist = JsonPath.read(parsedjosdoc, "$..category");

		for (Object category : categorylist) {
			System.out.println(category);
		}
	}

	public static void fluentAPI() throws IOException {

		File jsonFile = new File("src/test/resources/Bookstore.json");
		DocumentContext context = JsonPath.parse(jsonFile);
		List<Object> categorylist = context.read("$..category");
		for (Object category : categorylist) {
			System.out.println(category);
		}
		Configuration configuration = Configuration.defaultConfiguration();

		List<Object> categorylist1 =JsonPath
				.using(configuration)
				.parse(jsonFile)
				.read("$..category");
		for (Object category : categorylist1) {
			System.out.println(category);
		}

	}

	public static void main(String[] args) throws IOException {

		fluentAPI();

	}
}
