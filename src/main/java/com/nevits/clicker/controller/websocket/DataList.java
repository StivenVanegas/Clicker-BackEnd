package com.nevits.clicker.controller.websocket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DataList {
    private final Map<String, List<DataDto>> dataMap = new HashMap();
    
    public void add(DataDto dataDto, String codeRoom){
        if(!dataMap.containsKey(codeRoom)){
            List<DataDto> list = new ArrayList();
            dataDto.setRole("admin");
            list.add(dataDto);
            dataMap.put(codeRoom, list);
        } else {
            List<DataDto> list = dataMap.get(codeRoom);
            list.add(dataDto);
            dataMap.put(codeRoom, list);
        }
    }
    
    public List<DataDto> get(String codeRoom){
        return this.dataMap.get(codeRoom);
    }
    
    public void addClick(String username, String codeRoom){
        List<DataDto> dataList = dataMap.get(codeRoom);
        for(DataDto dd:dataList){
            if(dd.getUsername().equals(username)){
                dd.setClicks(dd.getClicks()+1);
                return;
            }
        }
    }
    
}
