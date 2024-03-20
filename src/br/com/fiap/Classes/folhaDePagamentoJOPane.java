package br.com.fiap.Classes;

import javax.swing.*;

public class folhaDePagamentoJOPane {
    public static void main(String[] args) {


        FolhaDePagamento fdp = new FolhaDePagamento();
        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;

        try {
            salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario bruto: "));
            descontoINSS = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto do INSS: "));
            numeroDeDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes "));
            valorPlanoDeSaude = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do plano de saude: "));
            fdp.valorPlanoDeSaude = valorPlanoDeSaude;
            fdp.nDeDependentes = numeroDeDependentes;
            fdp.salarioBruto = salarioBruto;
            fdp.descontoINSS = descontoINSS;

            double salarioLiquido = fdp.calcularSalarioLiquido();

            JOptionPane.showMessageDialog(null, "O seu salario liquido e de: " + salarioLiquido);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Voce errou algo ai veionho melhore");
        }

    }
}
