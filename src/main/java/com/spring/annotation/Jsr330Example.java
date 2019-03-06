package com.spring.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Example {

    private static String PATH_XML = "classpath:spring/app-context-annotation.xml";

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();

        context.load(PATH_XML);
        context.refresh();

        MessageRenderer messageRenderer =
                context.getBean("messageRenderer", MessageRenderer.class);

        messageRenderer.render();/*Визуализируем сообщение(то есть выводим на экран)*/
    }
}
