package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    @Getter
    private static int userCount = 0;
    private int count;

    public void UserJoin(){
       userCount++;
    }
    public static void UserLeave(){userCount--;}
    public void setCount(){
        count = userCount;
    }


}
