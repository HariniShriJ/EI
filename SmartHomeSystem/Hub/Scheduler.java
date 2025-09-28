package hub;

import java.util.*;

public class Scheduler {
    private static class Task {
        int deviceId;
        String action;
        String time;

        Task(int id, String act, String t) {
            deviceId = id;
            action = act;
            time = t;
        }

        @Override
        public String toString() {
            return "{device:" + deviceId + ", time:" + time + ", action:" + action + "}";
        }
    }

    private List<Task> tasks = new ArrayList<>();

    public void schedule(int deviceId, String time, String action) {
        tasks.add(new Task(deviceId, action, time));
    }

    public void showSchedule() {
        System.out.println("Scheduled Tasks: " + tasks);
    }
}
