package ForkJoinPoolLern;

import java.util.concurrent.ForkJoinPool;

public class MainExampleTask {

    public static void main(String[] args) {
        ExampleTask exampleTask = new ExampleTask();
        exampleTask.fork();
        System.out.println(exampleTask.join());

    }
}
//          ExampleTask exampleTask = new ExampleTask();
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        System.out.println(forkJoinPool.invoke(exampleTask));