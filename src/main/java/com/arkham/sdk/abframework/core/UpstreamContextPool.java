package com.arkham.sdk.abframework.core;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.*;

public class UpstreamContextPool {

    private final static Map<String, List<UpstreamContext>> POOL = Maps.newHashMap();

    public static List<UpstreamContext> get(String experimentId) {
        if (Strings.isNullOrEmpty(experimentId)) {
            return Collections.emptyList();
        }
        return POOL.getOrDefault(experimentId, Collections.emptyList());
    }

    public static void put(String experimentId, List<UpstreamContext> contexts) {
        POOL.put(experimentId, contexts);
    }

    public static void add(String experimentId, UpstreamContext context) {
        List<UpstreamContext> contexts = get(experimentId);
        contexts.add(context);
        put(experimentId, contexts);
    }
}
