package com.example.zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.UUID;

public class TaskStorage {
    private static TaskStorage taskStorage = new TaskStorage();
    private List<Task> tasks;
    public static TaskStorage getInstance(){return taskStorage;}
    private TaskStorage() {
        tasks = new ArrayList<Task>();
        for(int i = 1; i<=150; i++){
            Task task = new Task();
            task.setName("Zadanie do wykonania nr: " + i);
            task.setDone(i%3 == 0);
            tasks.add(task);
        }
    }

public Task GetTaskById(UUID id) {
        for(Task task : tasks) {
            if(task.getId().equals(id)){ return task; }
        }
        return null;
}
public List<Task> GetListOfTasks() { return tasks;}

}
