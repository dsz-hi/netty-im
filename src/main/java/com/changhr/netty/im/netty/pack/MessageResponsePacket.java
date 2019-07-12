package com.changhr.netty.im.netty.pack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author changhr
 * @create 2019-07-12 9:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_RESPONSE;
    }
}
