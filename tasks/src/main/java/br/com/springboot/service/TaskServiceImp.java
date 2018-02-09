package br.com.springboot.service;

import org.springframework.stereotype.Service;

import br.com.springboot.domain.Task;
import br.com.springboot.repository.TaskRepository;

@Service
public class TaskServiceImp implements TaskService {
	
	private TaskRepository taskrepository;
	

	public TaskServiceImp(TaskRepository taskrepository) {
		this.taskrepository = taskrepository;
	}

	@Override
	public Iterable<Task> list() {
		System.out.println("Teste");
		return taskrepository.findAll();
		
	}

	@Override
	public Task salvar(Task task) {
		return taskrepository.save(task);
	}

}
