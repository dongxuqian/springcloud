package com.dong.common.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author dong
 */
public class UUIDUtils {
     private static Snowflake snowflake = IdUtil.createSnowflake(1,1);
     public static String getUUID(){
         return IdUtil.randomUUID();
     }
     public static Long flakesUUID(){
         return snowflake.nextId();
     }

}
