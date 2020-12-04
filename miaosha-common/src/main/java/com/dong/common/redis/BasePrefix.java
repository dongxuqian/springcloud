package com.dong.common.redis;

/**
 * @author dong
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;

    @Override
    public int expireSeconds() {
        return 0;
    }

    @Override
    public String getPrefix() {
        return null;
    }
    public BasePrefix(String prefix){
        this(0,prefix);
    }
    public BasePrefix(int expireSeconds,String prefix){
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

}
