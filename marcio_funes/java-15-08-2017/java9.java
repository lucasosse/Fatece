/* 9 - Faça um programa que calcule a média de um aluno: 
** Media 1 = (P1 + API1)/2 e Media 2 = (P2 + API2)/ 2 e 
** Media Final = Média 1 + Média 2
*/

import java.util.Scanner; 

class java9{
    
    
    public static String media(double a, double b, double c, double d){
        
        double media1 = (a+b)/2;
        double media2 = (c+d)/2;
        double mediaF = (media1+media2)/2;
        
        if(mediaF<5) return "Sua Média Final é: " + String.format( "%.1f", mediaF ) + "\nSe Fodeu!";
        else return "Sua Média Final é: " + String.format( "%.1f", mediaF );
        
        
    }
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("P1: ");
        double nota1 = reader.nextDouble(); // Scans the next token of the input as an int.
        System.out.println("API 1: ");
        double api1 = reader.nextDouble();
        System.out.println("P2: ");
        double nota2 = reader.nextDouble(); // Scans the next token of the input as an int.
        System.out.println("API 2: ");
        double api2 = reader.nextDouble();
        reader.close();
        System.out.println(media(nota1,api1,nota2,api2));
    }
}