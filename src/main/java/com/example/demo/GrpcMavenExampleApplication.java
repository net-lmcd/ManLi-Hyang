package com.example.demo;

import com.example.demo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class GrpcMavenExampleApplication {

	TestDao testDao;

	public void TestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(GrpcMavenExampleApplication.class, args);
	}

	@GetMapping("/test")
	public void Test( ) {

		System.out.println("test!!");

		System.out.println("testDao : " + testDao.TestList().toString());

		//TestDto testDto = new TestDto(2, "xowns12", "xowns1234", "https:->");
		//testDao.InsertTest(testDto;
		//testDao.TestList();
	}
}
