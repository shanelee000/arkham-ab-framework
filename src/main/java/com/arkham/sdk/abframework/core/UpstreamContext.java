package com.arkham.sdk.abframework.core;

/**
 * UpstreamContext
 *
 * @author Shane Lee
 * @date 2019/6/28
 * @version 1.0.0
 */
public class UpstreamContext {

    /**
     * experiment id to determine which experiment to apply
     */
    private String experimentId;

    /**
     * unique upstream id to redirect request
     */
    private String upstreamId;

    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    public String getUpstreamId() {
        return upstreamId;
    }

    public void setUpstreamId(String upstreamId) {
        this.upstreamId = upstreamId;
    }
}
