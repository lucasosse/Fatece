/* 11 - Faça um programa que calcule rendimento de um valor depositado 
** após um mês (juros fixo de 0.70% ao mês). 
** (deposito *0.70)/100.
**
** PASSE VALOR COMO ARGUMENTO!
**
*/

class javaDepRend{
    
    public static void main(String[] args){
        double d = Double.parseDouble(args[0]);
        double r = (d *0.70)/100;                  //juros
        System.out.println(String.format( "%.2f", r));          //rend total
    }
}