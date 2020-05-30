package com.buck.consumer.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e) {
        ModelAndView s = new ModelAndView();
        s.setViewName("error");
        return s;
    }
}
