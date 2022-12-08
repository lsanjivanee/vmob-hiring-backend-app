package dev.vmob.hiring.backend;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = ChuckNorrisFactController.class)
class ChuckNorrisFactControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ChuckNorrisFactService service;

	@Test
	void testFact() throws Exception {
		// given
		when(service.getFact()).thenReturn("Lorem Ipsum");
		
		// when & then
		mockMvc
			.perform(get("/").accept(MediaType.APPLICATION_JSON))
			.andDo(print())
			.andExpectAll(
					status().isOk(), 
					content().json("{\"fact\": \"Lorem Ipsum\"}", true)
			);
	}

}
