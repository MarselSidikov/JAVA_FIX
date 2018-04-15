package ru.ivmiit;

/**
 * 11.04.2018
 * MessageRendererErrorImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessageRendererErrorImpl implements MessageRenderer {

    private Message message;

    public MessageRendererErrorImpl(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.err.println(message.getText());
    }
}
