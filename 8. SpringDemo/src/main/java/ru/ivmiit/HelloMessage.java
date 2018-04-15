package ru.ivmiit;

/**
 * 11.04.2018
 * HelloMessage
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HelloMessage implements Message {

    private String text;

    public HelloMessage(String text) {
        this.text = "Hello " + text;
    }


    public String getText() {
        return text;
    }
}
