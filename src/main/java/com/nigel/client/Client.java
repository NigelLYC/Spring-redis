package com.nigel.client;

import com.nigel.connection.Connection;
import com.nigel.protocol.Protocol;

/**
 * Created by Nigel on 2019/3/24 0024.
 */
public class Client {

    private Connection connection;

    public Client(String host,int port) {
        this.connection = new Connection(host,port);
    }

    public String set(String key,String value){

        connection.sendCommand(Protocol.Command.SET,key.getBytes(),value.getBytes());
        return connection.getCommandStatus();
    }

    public String get(String key){
        connection.sendCommand(Protocol.Command.GET,key.getBytes());
        return connection.getCommandStatus();
    }
}
