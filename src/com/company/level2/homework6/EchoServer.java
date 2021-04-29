package com.company.level2.homework6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread {
    public static void main(String[] args){
        try (ServerSocket server= new ServerSocket(8187)) {
            Socket client = server.accept();
            System.out.println("Подключение состоялось. ");

            DataOutputStream out = new DataOutputStream(client.getOutputStream()); // запись в сокет
            DataInputStream in = new DataInputStream(client.getInputStream()); //чтение из сокета
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while(!client.isClosed()) {
                String entryMsg = in.readUTF();
                new Thread(()-> {
                    try {
                        String outgoingMsg = reader.readLine();
                        out.writeUTF(outgoingMsg);
                        out.flush();
                        System.out.println(outgoingMsg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                if (entryMsg.equalsIgnoreCase("end")) {
                    System.out.println("Клиент корректно прекратил соединение (команда '" + entryMsg + "')");
                    break;
                }
                System.out.println("Сообщение от клиента: " + entryMsg);
            }
            in.close();
            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
