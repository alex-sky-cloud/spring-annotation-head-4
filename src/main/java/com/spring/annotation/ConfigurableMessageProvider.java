package com.spring.annotation;


import javax.inject.Inject;
import javax.inject.Named;

/*Аннотация для объявления внедряемого компонента (bean),
* То есть это означает, что
 * ConfigurableMessageProvider является внедряемым компонентом (bean)*/
@Named("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message = "Default message";

    public ConfigurableMessageProvider() {
    }

    /*инъекция над конструктором*/
    @Inject
    @Named("message")
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
