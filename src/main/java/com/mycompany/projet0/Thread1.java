/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet0;

/**
 *
 * @author Ibrahim
 */
public class Thread1 extends MThread {
    private String nom;

    public Thread1(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public static void main(String[] args) {
        new Thread1("Tata").start();//Demarrage par Heritage

    }

    @Override
    public void run() {
        System.out.println("Bienvenue sur "+nom);
    }

}
