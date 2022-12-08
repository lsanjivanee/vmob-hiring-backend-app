package dev.vmob.hiring.backend;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChuckNorrisFactService {
	private final Faker faker = Faker.instance();
	
	public String getFact() {
		return faker.chuckNorris().fact();
	}
}
