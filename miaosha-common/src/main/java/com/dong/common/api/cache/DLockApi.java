package com.dong.common.api.cache;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public interface DLockApi {
    @GetMapping("/")
    boolean lock(String lockKey,String uniqueValue,int expireTime);
    boolean
}
