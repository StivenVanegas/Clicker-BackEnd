package com.nevits.clicker.controller.websocket;

public class DataDto {
    private String username;
    private Integer clicks;

    public DataDto(String username, Integer clicks) {
        this.username = username;
        this.clicks = clicks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }
    
    
}
