package com.dong.common.api.cache.vo;

/**
 * @author dong
 */
public interface KeyPrefix  {
    /**
     * key 的过期时间
     * @return
     */
    int expireSeconds();

    /**
     * key的前缀
     * @return
     */
    String getPrefix();
}
