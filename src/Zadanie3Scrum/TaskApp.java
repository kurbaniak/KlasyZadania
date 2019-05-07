package Zadanie3Scrum;

public class TaskApp {
    public static void main(String[] args) {

TaskProvider taskProvider = new TaskProvider();

taskProvider.showTasks();

taskProvider.showTaskByUser("Bob");
taskProvider.showAverageTime();
    }
}
