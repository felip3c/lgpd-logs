package br.com.cobello.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Pojo da solicitação da Criação de um Cliente
 * @author Felipe
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ClienteRequest 
{
	private String nome;
	private String cpf;
	private float salario;
	private String endereco;
}
