package ru.netology.logs;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private final String INFO = "INFO";
    private final String ERROR = "ERROR";
    private int count = 0;

    @Override
    public void log(String msg) {
        this.count++;
        boolean hasError = msg.toLowerCase().contains(ERROR.toLowerCase());

        System.out.print(hasError ?  ERROR : INFO);
        System.out.println("#" + this.count + " [" + LocalDateTime.now() + "] " + msg);
    }
}
