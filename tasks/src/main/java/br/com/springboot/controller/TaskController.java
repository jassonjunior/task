package br.com.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.domain.Task;
import br.com.springboot.service.TaskService;

@RestController
@RequestMapping(value="/api/tasks")
public class TaskController {
	
	private TaskService taskService;
	
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}


	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value={"", "/"})
	public Iterable<Task> list(){
		Iterable<Task> list = taskService.list();
		return taskService.list(); 
	}
	
	@PostMapping(value="/save")
	public Task salvar(@RequestBody Task task){
		return taskService.salvar(task); 
	}
	

}
