
package loopwhile3;

import java.util.Scanner;


public class LoopWhile3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int soma = 0; 
        int maiorValor =0; 
        int entrada = 0;
        int menorValor = 0;
        int i = 0;
        
        while (true) /*(i < 15)*/ {
            System.out.println ("Informe o valor do produto");
            
            entrada = leia.nextInt();
           
            if (entrada ==0){
                System.out.println("Operação finalizada.");
                break; 
            }
            
                  
            if (entrada > maiorValor | i == 0){
            maiorValor = entrada;
            }
            
            if (entrada < menorValor | i == 0) {
                menorValor = entrada;
            } 
            soma += entrada;
            i++;
        }
        System.out.println ("O menor valor é: "+menorValor);
        System.out.println ("O maior valor é: "+maiorValor);
        System.out.println("A média é: "+(soma/i));
    }
    
}
