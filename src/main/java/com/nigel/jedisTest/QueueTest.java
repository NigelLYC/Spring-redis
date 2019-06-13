package com.nigel.jedisTest;

import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Nigel on 2019/5/15 0015.
 */
public class QueueTest {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.setAaa("09");
        if(a.getAaa() == "09"){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    public static void a(int n){
        InputStream inputStream = null;

        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        queue.add(1);
        for(int i=1;i <= n;i++){
            String line = "";
            int pre = 0;
            for(int j=0;j<i;j++){
                int item = (int)queue.remove();
                line += item + "";
                int value = pre + item;
                pre = item;

                queue.add(value);
            }
            queue.add(1);
            System.out.println(line);
        }

    }


}
