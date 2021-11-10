package com.nevits.clicker.controller.websocket;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DataList {
    private final List<DataDto> dataList = new ArrayList();
    
    public void add(DataDto dataDto){
        dataList.add(dataDto);
    }
    
    public List<DataDto> get(){
        return this.dataList;
    }
    
    public void addClick(String username){
        for(DataDto dd:dataList){
            if(dd.getUsername().equals(username)){
                dd.setClicks(dd.getClicks()+1);
                return;
            }
        }
    }
    
}
