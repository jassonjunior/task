import { Task } from './task.module';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import "rxjs/add/operator/map";
import { Observable } from "rxjs/Observable";

@Injectable()
export class TaskService {

  constructor(private http: Http) { }

  getTasks(): Observable<Task[]>{
    return this.http
      .get('/api/tasks')
      .map(res => res.json())
  }

}
