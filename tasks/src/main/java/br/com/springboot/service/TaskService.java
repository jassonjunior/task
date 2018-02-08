package br.com.springboot.service;

import br.com.springboot.domain.Task;

public interface TaskService {

	Iterable<Task> list();
	
	Task salvar(Task task);
	
	
	
}
