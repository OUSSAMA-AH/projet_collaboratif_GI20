package com.example;

public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }
    
    public int soustraction(int a, int b) {
        return a - b;
    }
    
    public int multiplication(int a, int b) {
        return a * b;
    }
    
    public int division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Division par zéro");
        return a / b;
    }
    
    public int puissance(int a, int b) {
        if (b < 0)
            throw new IllegalArgumentException("Exposant négatif non supporté");
        if (b == 0)
            return 1;
        
        int resultat = 1;
        for (int i = 0; i < b; i++) {
            resultat *= a;
        }
        return resultat;
    }
}
