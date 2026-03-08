package io.elijahsonicboy.annotator.annotations;

import io.elijahsonicboy.annotator.AttributeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ItemAttribute {

    AttributeType type();

    double value();

}