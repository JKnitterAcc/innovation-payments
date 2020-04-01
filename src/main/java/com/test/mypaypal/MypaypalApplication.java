package com.test.mypaypal;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;

@SpringBootApplication
public class MypaypalApplication {

	public static void main(String[] args) throws JsonProcessingException {

			HashMap<String, String> values = new HashMap<String, String>() {{
				put("name", "John Doe");
				put ("occupation", "gardener");
			}};

			ObjectMapper objectMapper = new ObjectMapper();
			String requestBody = objectMapper
					.writeValueAsString(values);

		System.out.println(requestBody);
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.postForObject("https://httpbin.org/post", requestBody, String.class);

			System.out.println(result);
		}
}