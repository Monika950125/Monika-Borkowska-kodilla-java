package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting task done";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean isExecuted = "Painting task done".equals(executeTask());
        return isExecuted;
    }
}
