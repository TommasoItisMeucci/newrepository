package com.example;

public class Cestino {
    private int contatore;

    public int getContatore() {
        return contatore;
    }

    public Cestino(int contatore) {
        this.contatore = contatore;
    }

    synchronized public void aggiungiMoneta(){
        contatore = contatore + 1;
    }
    
}
