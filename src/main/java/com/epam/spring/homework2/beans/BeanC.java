package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;

@ValidateFields

public class BeanC{
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void cInitMethod() {
        System.out.println(this.getClass().getSimpleName() + " InitMetod");
    }

    private void cDestroyMethod() {
        System.out.println(this.getClass().getSimpleName() + " Destroy method");
    }


}
