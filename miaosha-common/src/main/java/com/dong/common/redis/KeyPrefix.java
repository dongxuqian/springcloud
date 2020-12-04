package com.dong.common.redis;

/**
 * @author dong
 */
public interface KeyPrefix {
    /**
     * 时间+ 前缀
     * @return
     */
    public int expireSeconds();
    public String getPrefix();
}
