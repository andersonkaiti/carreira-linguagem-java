/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author o.o
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo.");*/
        
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        if (ano % 400 == 0) {
            System.out.println("O ano é bissexto!");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + "não é bissexto.");
        }
    }
    
}
