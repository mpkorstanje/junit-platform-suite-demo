package io.cucumber.skeleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Dreamer {

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public void experience(Dream dream) {
        System.out.println(
                Thread.currentThread().getName() +
                        ": Good night!" +
                        " Back in " + dream.duration + " " + dream.timeUnit
        );
        executorService.execute(dream::run);
    }

    public void tryToWake(long timeout, TimeUnit unit) throws InterruptedException {
        executorService.awaitTermination(timeout, unit);
        System.out.println(Thread.currentThread().getName() + ": I'm awake!");
    }

    public void retire() {
        executorService.shutdown();
    }

    public static class Dream {
        public final long duration;
        public final TimeUnit timeUnit;

        public Dream(long duration, TimeUnit timeUnit) {
            this.duration = duration;
            this.timeUnit = timeUnit;
        }

        public void run() {
            try {
                timeUnit.sleep(duration);
            } catch (InterruptedException e) {
                // Time to stop napping
            }
        }
    }
}
