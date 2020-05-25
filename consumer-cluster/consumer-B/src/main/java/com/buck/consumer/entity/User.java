package com.buck.consumer.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User
 * @author 
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private Long id;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;
}