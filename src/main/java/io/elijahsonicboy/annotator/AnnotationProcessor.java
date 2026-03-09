package io.elijahsonicboy.annotator;

import io.elijahsonicboy.annotator.annotations.ItemAttribute;

import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static void process(Class<?> clazz) {
        System.out.println("Scanning " + clazz.getName());

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(ItemAttribute.class)) {

                ItemAttribute attr = field.getAnnotation(ItemAttribute.class);

                System.out.println(
                        "Found attribute: " +
                                attr.type() +
                                " value=" +
                                attr.value()
                );
            }
        }
    }

}