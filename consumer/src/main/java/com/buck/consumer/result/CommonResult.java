package com.buck.consumer.result;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonResult <T> {
    private Integer code;
    private String message;
    private T data;
}
