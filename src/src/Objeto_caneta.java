/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Thais
 */
public class Objeto_caneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic Cristal","Azul",0.5f,100);
        Caneta c2 = new Caneta("Bic","Preta",1.0f,70);
        c1.status();
        c2.status();
    }
}
