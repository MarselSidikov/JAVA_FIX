package ru.ivmiit.classes;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * 11.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class aClass = Class.forName(className);

        Field fields[] = aClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        Class types[] = new Class[fields.length];

        for (int i = 0; i < types.length; i++) {
            types[i] = fields[i].getType();
        }
        // Object object = aClass.newInstance();
        Constructor constructor = aClass.getDeclaredConstructor(types);

        for (Class parameterType : constructor.getParameterTypes()) {
            System.out.print(parameterType.getName() + " ");
        }

        Integer intValue = 0;
        String stingValue = "";
        for (int i = 0; i < types.length; i++) {
            if (types[i].getName().equals("int")) {
                intValue = scanner.nextInt();
            } else if (types[i].getName().equals("java.lang.String")) {
                stingValue = scanner.next();
            }
        }
        Object arguments[] = {intValue, stingValue};
        Object object = constructor.newInstance(arguments);
        System.out.println(object);
    }
}
