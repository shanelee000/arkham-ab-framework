package com.arkham.sdk.abframework.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Experiment
 *
 * @author Shane Lee
 * @date 2019/6/28
 * @version 1.0.0
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Experiment {

    String value();
}
