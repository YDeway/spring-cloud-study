package com.buck.consumer;

import org.junit.jupiter.api.Test;
import javax.swing.*;


public class MultipleTest {

    @Test
    public void xx() {
        Timer timer = new Timer(3000, System.out::println);
        Timer timerw = new Timer(3000, e -> System.out.println(10000));
        timer.start();
        timerw.start();
    }
}
