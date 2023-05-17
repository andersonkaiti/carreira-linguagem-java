/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author o.o
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, maior100 = 0, par = 0, impar = 0, totalv = 0, s = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            totalv++;
            if (n % 2 == 0) {
                par++;
                if (n > 100) {
                    maior100++;
                }
            } else {
                impar++;
                if (n > 100) {
                    maior100++;
                }
            }
        } while (n != 0);
        media = s / totalv;
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr><br>"
                + "<br>Total de Valores: " + totalv
                + "<br>Total de Pares: " + par
                + "<br>Total de Ímpares: " + impar
                + "<br>Acima de 100: " + maior100
                + "<br>Média dos valores: " + media
                + ".</html>");
    }
    
}
