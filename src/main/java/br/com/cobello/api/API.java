package br.com.cobello.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cobello.model.ClienteRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * API
 * @author Felipe
 *
 */
@RestController
@RequestMapping
@Slf4j
public class API 
{
	@PostMapping("client")
	public Object create(@RequestBody ClienteRequest request) throws JsonProcessingException
	{
		log.info("---> Iniciando Cadastro do Cliente");
		log.debug("Request: [{}]", new ObjectMapper().writeValueAsString(request));
		
		final ResponseEntity<String> response = new RestTemplate().exchange("https://postman-echo.com/post", HttpMethod.POST, new HttpEntity<ClienteRequest>(request), String.class);
		
		log.debug("Response: [{}]", response.getBody());
		log.info("<--- Finalizando Cadastro do Cliente");
		
		return response;
	}
}
