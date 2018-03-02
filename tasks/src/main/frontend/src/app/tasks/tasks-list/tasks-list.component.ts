import { Component, OnInit } from '@angular/core';

import { Task } from './../task.module';
import { TaskService } from '../task.service';

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit() {
    
    return this.taskService.getTasks()
            .subscribe(
              (tasks: Task[]) => {
                console.log(tasks);
                this.tasks = tasks;
                console.log(this.tasks[0].dataVencimento);
              },
              (error) => console.log(error)
            );
            
  }

  onTaskChance(event, task){
    console.log("Entrou no change");
    
  }

  getDataVencimentoLabel(task: Task){
    return task.finalizado ? 'label-success' : 'label-primary';
  }

}
