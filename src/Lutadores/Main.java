/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lutadores;

/**
 *
 * @author Thais
 */
public class Main {
    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        L[1] = new Lutador("Luizinho do Gera", "Brasil", 22, 1.85f, 76.8f, 5, 10, 5);
        L[2] = new Lutador("Putscript", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        L[3] = new Lutador("UFOCobol", "Brazil", 37, 1.70f, 119.9f, 5, 4, 3);
        L[4] = new Lutador("Nerdaart", "Alemanha", 30, 1.95f, 105.7f, 12, 2, 4);
        L[5] = new Lutador("Snapshadow", "Austrália", 28, 1.93f, 96.9f, 8, 2, 6);
        
       Lutas UEC01 = new Lutas();
       UEC01.marcarLuta(L[2], L[1]);
       UEC01.lutar();
    }
    
}
