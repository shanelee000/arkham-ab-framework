package com.arkham.sdk.abframework.core;

import com.arkham.sdk.abframework.annotations.Experiment;
import com.arkham.sdk.abframework.annotations.Upstream;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * UpstreamApplication
 *
 * @author Shane Lee
 * @date 2019/6/28
 * @version 1.0.0
 */
public interface UpstreamApplication extends InitializingBean, BeanPostProcessor {

    @Override
    default void afterPropertiesSet() throws Exception {

    }

    @Override
    default Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        if (clazz.isAnnotationPresent(Upstream.class)) {
            Upstream upstreamAnnotation = clazz.getAnnotation(Upstream.class);
            String id = upstreamAnnotation.id();
            Experiment[] experiments = upstreamAnnotation.experiments();
            if (experiments.length > 0) {
                Arrays.stream(experiments).forEach(experiment -> {
                    UpstreamContext context = new UpstreamContext();
                    context.setExperimentId(experiment.value());
                    context.setUpstreamId(id);
                    UpstreamContextPool.add(experiment.value(), context);
                });
            }
        }
        return bean;
    }
}
