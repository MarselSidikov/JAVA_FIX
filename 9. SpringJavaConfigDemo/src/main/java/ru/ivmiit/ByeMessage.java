package ru.ivmiit;

/**
 * 11.04.2018
 * ByeMessage
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ByeMessage implements Message {
    private String text;

    public ByeMessage(String text) {
        this.text = "Bye " + text;
    }


    public String getText() {
        return text;
    }
}
