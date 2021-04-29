package com.company.level2.homework7.chat;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String password);
    void stop();
}
