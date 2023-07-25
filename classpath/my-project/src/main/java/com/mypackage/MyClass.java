package com.mypackage;

import lombok.Data;

import java.util.List;
import java.util.logging.Logger;

@Data
public class MyClass {

    static Logger log = Logger.getLogger(MyClass.class.getName());

    public static void main(String[] args) {
        List<String> strings = List.of(args);
        strings.forEach(s -> log.info(s));
    }
}