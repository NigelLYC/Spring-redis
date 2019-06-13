package com.nigeltest.util;

import redis.clients.jedis.Jedis;

/**
 * Created by Nigel on 2019/6/12 0012.
 */
public class JedisUtil {


    public static void set(String key,String value){
        Jedis jedis = new Jedis("172.20.10.5",6379);
        jedis.set(key,value);
    }

    public static String get(String key){
        Jedis jedis = new Jedis("172.20.10.5",6379);
        String value = jedis.get(key);
        return value;
    }

    public static void remove(String key){
        Jedis jedis = new Jedis("172.20.10.5",6379);
        jedis.del(key);
    }

}
