package com.test.mypaypal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MypaypalApplication {

	public static void main(String[] args) { //{ SpringApplication.run(MypaypalApplication.class, args); }

		try {
			PostRequest.postCall();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

