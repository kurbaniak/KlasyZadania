package Zadanie3Scrum;

import java.text.DecimalFormat;
import java.util.*;

public class TaskProvider {

    private Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public TaskProvider() {
        tasks.put("In progress", Arrays.asList(
                new Task("Deploy to Azure", "Bob", 8),
                new Task("Handle user input", "John", 4)

        ));
        tasks.put("To do", Arrays.asList(
                new Task("Connect DB", "John", 10),
                new Task("Add users", "Jessica", 9),
                new Task("Configure logging", "John", 6)

        ));
        tasks.put("Done", Arrays.asList(
                new Task("Prepare DB", "Bob", 7)
        ));
    }

    public void showTasks() {
        String contetnt;
        String user;
        int time;

        for (Map.Entry<String, List<Task>> entry : tasks.entrySet()) {
            System.out.println(entry.getKey() + "(" + entry.getValue().size() + "):");
            for (int i = 0; i < entry.getValue().size(); i++) {
                contetnt = entry.getValue().get(i).getContent();
                user = entry.getValue().get(i).getUser();
                time = entry.getValue().get(i).getEstimatedTime();

                System.out.println("* " + contetnt + "(" + user + ", " + time + ")");
            }
        }

    }

    public void showTaskByUser(String user) {
        int tasksByUser = 0;
        for (Map.Entry<String, List<Task>> entry : tasks.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getUser().equals(user)) {
                    tasksByUser++;
                }
            }
        }
        System.out.println(user + " was assigned to " + tasksByUser + " tasks in this sprint");
    }

    public void showAverageTime() {
        int sum = 0;
        double average;
        int taskNumber = 0;

        for (Map.Entry<String, List<Task>> entry : tasks.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i).getEstimatedTime();
            }
            taskNumber += entry.getValue().size();
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        System.out.println(taskNumber);
        System.out.println(sum);
        average = (double) sum/taskNumber;

        System.out.println("Mean aproximate time per task is " + df.format(average) + ".");
    }
}

