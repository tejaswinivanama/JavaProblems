package com.json.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsing {


	public static ObjectMapper mapper = new ObjectMapper();

	public static JsonNode parse(String jsonSrc) throws JsonMappingException, JsonProcessingException {

		return mapper.readTree(jsonSrc);
	}


	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonSrc = "{\"title\" : \"Tejj\"}";
		JsonNode node = parse(jsonSrc);
		System.out.println(node.get("title"));	
		
		
	}
}
