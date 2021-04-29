package com.company.level2.homework7and8.chat;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String password);
    void stop();
}
