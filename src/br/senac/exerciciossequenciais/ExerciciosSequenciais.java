/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.senac.exerciciossequenciais;

import java.util.Scanner;

/**
 *
 * @author leonardo.tricano
 */
public class ExerciciosSequenciais {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //CalcularMediaPonderada();
        //CalcularDesconto();
        Poupanca();
        
        
    }
    static void CalcularMediaPonderada(){
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;
        
        float p1 = 1;
        float p2 = 2;
        float p3 = 3;
        float p4 = 4;
        
        
    
    System.out.println("Insira o primeira nota: ");
    n1 = scan.nextFloat();
    System.out.println("Insira o segunda nota: ");
    n2 = scan.nextFloat();
    System.out.println("Insira o terceira nota: ");
    n3 = scan.nextFloat();
    System.out.println("Insira o quarta nota: ");
    n4 = scan.nextFloat();
    
    float somaPonderada = (n1*p1) + (n2*p2)+ (n3*p3) + (n4*p4);
    
    System.out.println("Soma ponderada: " + somaPonderada);
    
    float somaPesos = p1 + p2 + p3 + p4;
    
    System.out.println("Soma pesos: " + somaPesos);
    
    float mediaPonderada = somaPonderada/ somaPesos;
    
    System.out.println("Sua media é: " + mediaPonderada);
    
        }
    
    static void CalcularDesconto(){
    Scanner scan = new Scanner(System.in);    
    float valor = 0;
    
    System.out.println("Digite o valor do produto: ");
    valor = scan.nextFloat();
        
    float totalDesconto = (valor * 0.09f); 
        System.out.printf("Desconto de: R$%.2f\n" , totalDesconto);
    
    float totalDaCompra = valor - totalDesconto;
    
    System.out.printf("Total da compra com desconto: R$%.2f\n" , totalDaCompra );
      
        
    }
    
    static void Poupanca(){
        Scanner scan = new Scanner(System.in);
        float P = 0;
        float i = 0;
        int n = 0;
        
        System.out.println("Digite sua aplicacao mensal: ");
        P = scan.nextFloat();
        
        System.out.println("Digite numero de meses que irá ser aplicado na poupanca: ");
        n = scan.nextInt();
        
        System.out.println("Digite sua taxa: ");
        i = scan.nextFloat();
        i = i*0.01f;
        
        double valorAcumulado =  (P * (Math.pow(1 + i, n)- 1)) / i;
        
        System.out.printf("Valor total da aplicacao: R$%.2f\n",valorAcumulado);
        
        
        
    }
    // FAZER EM CASA 
    static void CalcularValorCofre(){
        double qtdDolares = 0.0d;
        double cotacaoDolar = 0.0d;
        double valorReais = 0.0d;
        
        
    }

}