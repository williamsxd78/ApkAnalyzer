package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface Order {
    String[] attributes() default {};

    String[] elements() default {};
}
