/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet0;

/**
 *
 * @author Ibrahim
 */
public class Thread2 implements Runnable {

    private String nom;

    public Thread2(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static void main(String[] args) {

        //Thread2 t3 = new Thread2("Toto"); Possibilite d faire aussie
        //new Thread(T3).start();
        
        
        new Thread(new Thread2("Toto")).start();//demarage par runnable
        new Thread(new Thread2("jojo")).start();//demarage par runnable
        while (true) {              
            new Thread(new Thread2("Frankey")).start();//demarage par runnable
        }
    }
    @Override
    public void run() {
        System.out.println("Bienvenue dans  " + nom);
    }

}
