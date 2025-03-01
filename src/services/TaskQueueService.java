package services;


import model.Task;
import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueService {
    //construct linkedList queue with Task objects
    private Queue<Task> queue = new LinkedList<>();
    //add task
    public void enqueue(Task task){
        queue.add(task);
    }
    //remove task at the front
    public Task dequeue(){
       return queue.poll();
    }
    //return list of task
    public Queue<Task> listTask(){
        return queue;
    }

}
