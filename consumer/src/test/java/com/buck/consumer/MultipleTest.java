
package com.buck.consumer;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Annotation;

@Testable
public class MultipleTest {

    @Test
    public void xx() {
        Annotation[] annotations = SpringBootApplication.class.getAnnotations();
        for( Annotation e: annotations) {
            System.out.println(e.toString());
        }
    }
}
