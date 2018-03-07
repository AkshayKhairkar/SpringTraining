package com.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // Specifies where all we can put the Annotation
@Retention(RetentionPolicy.RUNTIME) // Specifies at what time it should be made available
public @interface Monitor {

}
