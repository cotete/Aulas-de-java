package br.com.fiap.Classes;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FolhaDePagamento fp = new FolhaDePagamento();
        Scanner sc;
    try{
        sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem do desconto de INSS: ");
        fp.descontoINSS = sc.nextInt();
        System.out.println("Digite o seu salario bruto: ");
        fp.salarioBruto = sc.nextDouble();
        System.out.println("Digite o numero de dependentes: ");
        fp.nDeDependentes = sc.nextInt();
        System.out.println("Digite o valor do plano de saude: ");
        fp.valorPlanoDeSaude = sc.nextDouble();


        double salarioLiquido = fp.calcularSalarioLiquido();

        System.out.println("O seu salario liquido e: " + salarioLiquido);
    }catch (Exception e){
        System.out.println("Tu digito errado ai irmaozinho vamo ta melhorando imundo.");
    }


    }
}