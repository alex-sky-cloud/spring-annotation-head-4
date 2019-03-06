package com.spring.annotation;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named( "messageRenderer" )
@Singleton /*Указывает, что данный компонент создается в одном экземпляре*/
public class StandardOutMessageRenderer implements MessageRenderer {

    @Inject
    @Named( "messageProvider" )
    private MessageProvider messageProvider = null;

    /*Визуализация*/
    @Override
    public void render() {

        if (this.messageProvider == null){
            throw new RuntimeException(
                    " Вы должны установить свойство 'messageProvider' для класса :"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
      this.messageProvider = provider;
    }


    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
