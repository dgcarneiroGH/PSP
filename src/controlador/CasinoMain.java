/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import POJOS.Tragaperras;
import java.util.Scanner;

/**
 *
 * @author Dg_Ca
 */
public class CasinoMain {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("-- BIENVENIDO AL CASINO ONLINE --");

        System.out.println("Introduce créditos: ");
        int credito = teclado.nextInt();
        System.out.println("Créditos añadidos correctamente, a jugar!\n");
        
        Tragaperras maquina = new Tragaperras(1, 3, credito);
        maquina.start();
    }

}
