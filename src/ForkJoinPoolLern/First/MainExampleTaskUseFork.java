package ForkJoinPoolLern;

import ForkJoinPoolLern.First.ExampleTask;

public class MainExampleTaskUseFork {
    public static void main(String[] args) {
    ExampleTask exampleTask = new ExampleTask();
        exampleTask.fork();
    System.out.println(exampleTask.join());
    }
}
