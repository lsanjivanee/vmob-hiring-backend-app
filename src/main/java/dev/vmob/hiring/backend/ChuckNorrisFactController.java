package dev.vmob.hiring.backend;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChuckNorrisFactController {
	private final ChuckNorrisFactService service;
	
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ChuckNorrisFactDto fact() {
		return ChuckNorrisFactDto.builder().fact(service.getFact()).build();
	}
}
