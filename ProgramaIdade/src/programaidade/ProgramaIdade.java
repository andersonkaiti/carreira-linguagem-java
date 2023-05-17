/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author o.o
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate ano = LocalDate.now();
        int anoAtual = ano.getYear();
        
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = anoAtual - nasc;
        System.out.println("Sua idade é " + i);
        if(i>=18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
    
}
