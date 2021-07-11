package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {

    @Override
    public String approveTheTask(Task task) {
        return "your task " + task.getName() + "has been accepted";
    }

    @Override
    public String writeAComment(Task task) {
        return "Comment to task " + task.getName();
    }
}
