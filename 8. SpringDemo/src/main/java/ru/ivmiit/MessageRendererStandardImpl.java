package ru.ivmiit;

/**
 * 11.04.2018
 * MessageRendererStandardImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessageRendererStandardImpl implements MessageRenderer {

    private Message message;

    public MessageRendererStandardImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message.getText());
    }
}
