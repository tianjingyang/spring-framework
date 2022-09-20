package com.mashibing.selfEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEditor {
    public static void main(String[] args) {
        //selfEditor.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
        Customer bean = ac.getBean(Customer.class);
        System.out.println(bean);

    }
}
