package ru.ivmiit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 11.04.2018
 * IndependentMessageRenderer
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Component
public class IndependentMessageRenderer {

    @Autowired
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();
    }
}
