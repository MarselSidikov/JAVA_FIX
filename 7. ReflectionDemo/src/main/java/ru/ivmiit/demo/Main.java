package ru.ivmiit.demo;

import java.lang.reflect.Field;

/**
 * 11.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClassAsClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClassAsClass.getField("someField");
        System.out.println(someField.getType());

        Field[] fields = someClassAsClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        System.out.println(someObject.someField);
        someField.set(someObject, 777);
        System.out.println(someObject.someField);

        Field privateField = someClassAsClass.getDeclaredField("somePrivate");
        System.out.println(privateField.getName());
        privateField.setAccessible(true);
        privateField.set(someObject, "Marsel");
        System.out.println(someObject.getSomePrivate());
    }
}
