/* 13 - Um banco concede empréstimo a seus clientes 
** no valor máximo de 30% 
** do valor do seu salário liquido. 
** Receba o valor do salário bruto, 
** o valor dos descontos 
** e o valor do possível empréstimo de um cliente, 
** em seguida avise se ele poderá ou não fazer o empréstimo.
*/

import java.util.Scanner;

class javaEmp{
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Seu Salário: ");
        double sal = reader.nextDouble(); // Scans the next token of the input as an int.
        System.out.println("Seus Descontos: ");
        double desc = reader.nextDouble();
        System.out.println("Seu Potencial Empréstimo: ");
        double emp = reader.nextDouble();
        
        double limit = (sal - desc)*0.3;
        
        if(emp <= limit) System.out.println("Você poderá Emprestar");
        else System.out.println("Infelizmente, você não poderá emprestar");
        
    }
}