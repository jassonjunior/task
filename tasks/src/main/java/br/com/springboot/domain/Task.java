package br.com.springboot.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {

	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataVencimento;
	
	private Boolean finalizado;

	public Task() {
	}

	public Task(long id, String nome, LocalDate dataVencimento, boolean finalizado) {
		this.id = id;
		this.nome = nome;
		this.dataVencimento = dataVencimento;
		this.finalizado = finalizado;
	}
	
	
	
	
}
