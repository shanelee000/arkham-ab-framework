package com.arkham.sdk.abframework.annotations;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Upstream
 *
 * @author Shane Lee
 * @date 2019/6/28
 * @version 1.0.0
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Upstream {

    String id();

    Experiment[] experiments() default {};
}
