/* 12 - Faça um programa para calcular a área de um circulo. 
** area = PI*(raio²).
*/

import java.util.Scanner; 

class javaCircArea{
    
    public static double calcArea(double raio) {
        return raio * raio * Math.PI;
    }
 
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Raio do Círculo: ");
        double raio = reader.nextDouble();
        System.out.println("Área: " + String.format( "%.2f", calcArea(raio)));
    }
}