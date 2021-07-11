package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements ObservableTask{

    private List<Task> tasks;
    private String studentName;

    public TasksQueue(String studentName) {
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
