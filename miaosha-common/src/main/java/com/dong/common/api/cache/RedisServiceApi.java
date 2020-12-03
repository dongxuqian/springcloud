package com.dong.common.api.cache;

import com.dong.common.api.cache.vo.KeyPrefix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author dong
 */
@FeignClient
public interface RedisServiceApi {
    /**
     * redis 的get操作，通过key获取存储在redis中的对象
     *
     * @param prefix key的前缀
     * @param key    业务层传入的key
     * @param clazz  存储在redis中的对象类型（redis中是以字符串存储的）
     * @param <T>    指定对象对应的类型
     * @return 存储于redis中的对象
     */
    <T> T get(KeyPrefix prefix, String key, Class<T> clazz);

    /**
     * redis的set操作
     *
     * @param prefix 键的前缀
     * @param key    键
     * @param value  值
     * @return 操作成功为true，否则为true
     */
    <T> boolean set(KeyPrefix prefix, String key, T value);

    /**
     * 判断key是否存在于redis中
     *
     * @param keyPrefix key的前缀
     * @param key
     * @return
     */
    boolean exists(KeyPrefix keyPrefix, String key);

    /**
     * 自增
     *
     * @param keyPrefix
     * @param key
     * @return
     */
    long incr(KeyPrefix keyPrefix, String key);

    /**
     * 自减
     *
     * @param keyPrefix
     * @param key
     * @return
     */
    long decr(KeyPrefix keyPrefix, String key);


    /**
     * 删除缓存中的用户数据
     *
     * @param prefix
     * @param key
     * @return
     */
    boolean delete(KeyPrefix prefix, String key);
    /**
     * 获取锁
     *
     * @param lockKey     锁
     * @param uniqueValue 能够唯一标识请求的值，以此保证锁的加解锁是同一个客户端
     * @param expireTime  过期时间, 单位：milliseconds
     * @return
     */
    boolean lock(String lockKey, String uniqueValue, int expireTime);

    /**
     * 使用Lua脚本保证解锁的原子性
     *
     * @param lockKey     锁
     * @param uniqueValue 能够唯一标识请求的值，以此保证锁的加解锁是同一个客户端
     * @return
     */
    boolean unlock(String lockKey, String uniqueValue);
}
