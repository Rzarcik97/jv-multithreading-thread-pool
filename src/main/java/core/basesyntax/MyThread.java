package core.basesyntax;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private static final Logger log = LogManager.getLogger(MyThread.class);

    @Override
    public String call() throws InterruptedException {
        int value = (new Random().nextInt(5) + 1) * 100;
        Thread.sleep(value);
        log.info("Task duration was " + value + " ms, execution finished at " + LocalDateTime.now());
        return "Task duration was " + value + " ms, execution finished at " + LocalDateTime.now();
    }
}
