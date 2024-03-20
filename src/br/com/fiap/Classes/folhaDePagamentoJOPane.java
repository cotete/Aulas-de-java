package br.com.fiap.Classes;

import javax.swing.*;

public class folhaDePagamentoJOPane {
    public static void main(String[] args) {


        FolhaDePagamento fdp = new FolhaDePagamento();

        try {
            fdp.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario bruto: "));
            fdp.descontoINSS = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto do INSS: "));
            fdp.nDeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes "));
            fdp.valorPlanoDeSaude = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do plano de saude: "));

            double salarioLiquido = fdp.calcularSalarioLiquido();

            JOptionPane.showMessageDialog(null, "O seu salario liquido e de: " + salarioLiquido);

        } catch (Exception e) {
            System.out.println("Voce errou algo ai veionho melhore");
        }

    }
}
