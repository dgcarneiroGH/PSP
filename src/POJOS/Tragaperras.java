/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;

import java.util.Scanner;

/**
 *
 * @author Dg_Ca
 */
public class Tragaperras extends Thread {

    int nMin, nMax;
    int s1, s2, s3;
    int credito;

    public Tragaperras(int nMin, int nMax, int credito) {
        this.nMin = nMin;
        this.nMax = nMax;
        this.credito = credito;
    }

    private int azar(int nMin, int nMax) {
        return (int) (Math.random() * nMax + nMin);
    }

    public synchronized boolean jugar(int s1, int s2, int s3, int credito) {
        System.out.println("\t| " + s1 + " |\t| " + s2 + " |\t| " + s3 + " |\n");

        if (s1 == s2 && s2 == s3) {
            System.out.println("GANADOR!!!");
            System.out.println("Tu premio: "+credito*10+" créditos");
            return true;
        } else {
            System.out.println("FALLO, inténtalo de nuevo!");
            if (credito > 0) {
                System.out.println("Credito actual: "+credito+"\n");
            } else {
                System.out.println("Te has quedado sin créditos, vuelve pronto!");
                return true;
            }

            return false;
        }
    }

    public void run() {
        boolean victoria = false;
        do {

            System.out.println("--------------------------------------");
            System.out.println("Pulsa ENTER y pon a prueba tu suerte!!");
            System.out.println("--------------------------------------");
            new Scanner(System.in).nextLine();
            credito --;
            
            s1 = azar(nMin, nMax);
            s2 = azar(nMin, nMax);
            s3 = azar(nMin, nMax);

            victoria = jugar(s1, s2, s3, credito);
        } while (!victoria);

    }
}
