package com.nigel.jedisTest;


import com.nigel.client.Client;
import redis.clients.jedis.Jedis;

/**
 * Created by Nigel on 2019/3/24 0024.
 */
public class JedisTest {
    public static void main(String[] args) {
        /*Jedis jedis = new Jedis("172.20.10.5",6379);
        System.out.println(jedis.set("foo","foo3"));
        System.out.println(jedis.get("foo"));*/
        int HASH_BITS = 0x7fffffff;
        System.out.println(Integer.toBinaryString(0x7fffffff));
    }
}
