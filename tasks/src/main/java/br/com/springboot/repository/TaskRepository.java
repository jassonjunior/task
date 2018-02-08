package br.com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.springboot.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{
	

}
