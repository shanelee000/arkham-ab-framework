package com.arkham.sdk.abframework.core;

import com.google.common.collect.Maps;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * UpstreamProxy
 *
 * @author Shane Lee
 * @date 2019/6/28
 * @version 1.0.0
 */
public class UpstreamProxy<T> {

    private final static Map<String, Object> PARAMETERS = Maps.newHashMap();

    public UpstreamProxy parameter(String name, Object value) {
        Assert.notNull(name, "Parameter name is required, it must not be null while setting parameter to upstream proxy !");
        PARAMETERS.put(name, value);
        return this;
    }

    public T invoke(String experimentId) {

    }

}
