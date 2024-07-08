package com.chanris.iterator;

/**
 * @author chenyue7@foxmail.com
 * @date 2024/7/9
 * @description
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
