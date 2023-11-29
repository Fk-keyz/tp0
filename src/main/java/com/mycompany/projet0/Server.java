/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    public static void main(String[] args) throws IOException {

        // new Server().start();
        new Thread(new Server()).start();//demarage par runnable

    }

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Demarage du serveur.");
            Socket s = ss.accept();
            
            new Chat(s).start();
            //lecture de donnees
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            //Ecriture de donnees
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            String IP = s.getRemoteSocketAddress().toString();
            pw.println("Bienvenue Client IP = " + IP);

            while (true) {
                String chaine = br.readLine();
                int n = chaine.length();
                pw.println("La longueur de lachaine est : " + n);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public class Chat extends MThread{
        private Socket socket;
        private String psoedo;
        public Chat(Socket s){
            this.socket=s;
            
        }

        @Override
        public void run() {
            InputStream is = null;
             try {
            //lecture de donnees
             is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            //Ecriture de donnees
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            String IP = s.getRemoteSocketAddress().toString();
            pw.println("Bienvenue Client IP = " + IP);

            while (true) {
                String chaine = br.readLine();
                int n = chaine.length();
                pw.println("La longueur de lachaine est : " + n);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        
        
    }

}
