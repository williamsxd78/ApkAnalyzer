package com.airbnb.paris.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes13.dex */
public @interface ParisConfig {
    String defaultStyleNameFormat() default "";

    boolean namespacedResourcesEnabled() default false;

    Class<?> rClass() default Void.class;
}
