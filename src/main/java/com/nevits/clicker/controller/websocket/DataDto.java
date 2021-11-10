package com.nevits.clicker.controller.websocket;

public class DataDto {
    private String username;
    private Integer clicks;
    private String role;

    public DataDto(String username, Integer clicks, String role) {
        this.username = username;
        this.clicks = clicks;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
