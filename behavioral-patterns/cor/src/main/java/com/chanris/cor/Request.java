package com.chanris.cor;

import java.util.Objects;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/8
 * @description
 */
public class Request {
    /**
     * 请求的类型，由链中的每个项使用，以查看它们是否应该或能够处理此特定请求
     */
    private final RequestType requestType;
    /**
     * 请求的描述
     */
    private final String requestDescription;
    /**
     * 指示是否处理请求。请求只能从未处理状态切换到已处理状态，没有办法“取消处理”请求。
     */
    private boolean handled;

    /**
     * 创建给定类型和附带描述的新请求。
     * @param requestType
     * @param requestDescription
     */
    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public String getRequestDescription() { return requestDescription;}

    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * 标记此请求已被处理
     */
    public void markHandled() {
        this.handled = true;
    }

    public String toString() {
        return getRequestDescription();
    }
}
