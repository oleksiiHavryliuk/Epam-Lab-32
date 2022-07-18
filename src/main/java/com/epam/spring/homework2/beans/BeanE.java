package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ValidateFields

public class BeanE {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " @PostConstruct method");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " @PreDestroy method");
    }


}
