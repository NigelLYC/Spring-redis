package com.nigel.protocol;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by Nigel on 2019/3/24 0024.
 */
public class Protocol {
    public static final String DOLLAR_BYTE = "$";
    public static final String ASTERISK_BYTE = "*";
    public static final String BLANK_STRING = "\r\n";


    public static void sendCommand(OutputStream os,Command command,byte[] ... args){
        StringBuffer sb = new StringBuffer();
        sb.append(ASTERISK_BYTE).append(args.length+1).append(BLANK_STRING);
        sb.append(DOLLAR_BYTE).append(command.name().length()).append(BLANK_STRING);
        sb.append(command.name()).append(BLANK_STRING);
        for (final byte[] arg:args){
            sb.append(DOLLAR_BYTE).append(arg.length).append(BLANK_STRING);
            sb.append(new String(arg)).append(BLANK_STRING);
        }
        //System.out.println(sb.toString());
        try {
            os.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Command {
        GET,SET,KEYS
    }
}
