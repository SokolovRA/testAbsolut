package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ActionCounter {
    private Queue<Integer> queue;

    public ActionCounter() {
        queue = new LinkedList<>();
    }

    public void call(int timestamp) {
        queue.add(timestamp);
        while (!queue.isEmpty() && timestamp - queue.peek() >= 300) {
            queue.poll();
        }
    }

    public int getActions(int timestamp) {
        while (!queue.isEmpty() && timestamp - queue.peek() >= 300) {
            queue.poll();
        }
        return queue.size();
    }
}


