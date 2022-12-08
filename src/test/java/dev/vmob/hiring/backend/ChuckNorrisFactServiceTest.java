package dev.vmob.hiring.backend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChuckNorrisFactServiceTest {

	@Test
	void testGetFact() {
		// given
		ChuckNorrisFactService sut = new ChuckNorrisFactService();
		
		// when
		String fact = sut.getFact();
		
		// then
		assertThat(fact).isNotEmpty();
	}
}
