package com.eladr.data_rest;

import com.eladr.data_rest.entity.Student;
import com.eladr.data_rest.enums.Gender;
import com.eladr.data_rest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataRestApplication implements CommandLineRunner {

	@Autowired
	StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i = 0 ; i < 11 ; i++){
			Student student = Student.builder()
					.firstName("firstName"+i)
					.lastName("lastName"+i)
					.gender(i%2 == 0 ? Gender.FEMALE : Gender.MALE)
					.build();
			studentRepo.save(student);
		}
	}
}
