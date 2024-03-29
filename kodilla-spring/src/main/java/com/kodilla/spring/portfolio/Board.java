package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String showTheBoard() {
     return "Show the board:\n" + toDoList.getTasksList() + "\n"
                + inProgressList.getTasksList() + "\n" + doneList.getTasksList();
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
