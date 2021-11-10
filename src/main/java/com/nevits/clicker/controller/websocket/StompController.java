package com.nevits.clicker.controller.websocket;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins="https://nevits-clicker.herokuapp.com")
public class StompController {
    
    @Autowired
    SimpMessagingTemplate msgt;
    
    @Autowired
    DataList dataList;
    
    @MessageMapping("/room.{code}")
    public void handleRoom(String user, @DestinationVariable String code)throws Exception{
        dataList.add(new DataDto(user,0,"gamer"), code);
        Gson gson = new Gson();
        String json = gson.toJson(dataList.get(code));
        msgt.convertAndSend("/topic/room."+code, json);
    }
    
    @MessageMapping("/game.{code}")
    public void handleGame(String user, @DestinationVariable String code)throws Exception{
        dataList.addClick(user, code);
        Gson gson = new Gson();
        String json = gson.toJson(dataList.get(code));
        msgt.convertAndSend("/topic/game."+code, json);
    }
    
    @MessageMapping("/timer.{code}")
    public void handleTimer(String user, @DestinationVariable String code)throws Exception{
        int seg = 30;
        while(seg >= 0){
            msgt.convertAndSend("/topic/timer."+code, seg);
            seg = seg - 1;
            Thread.sleep(1000);   
        }
    }
    
    @MessageMapping("/start.{code}")
    public void handleStart(String user, @DestinationVariable String code)throws Exception{
        msgt.convertAndSend("/topic/start."+code, true);
    }
}

