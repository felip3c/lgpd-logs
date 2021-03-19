package br.com.cobello.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Testes Unitarios da API de Cliente
 * 
 * @author Felipe
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class APITest {

	@Autowired
	MockMvc mock;

	/**
	 * Testa o registro de clientes
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRegitro() throws Exception {
		mock.perform(post("/client").contentType(MediaType.APPLICATION_JSON)
				.content("{\"cpf\":\"123.456.789-00\",\"nome\":\"Cliente Test 1\",\"salario\":100}"))
				.andExpect(status().isOk());
	}
}
