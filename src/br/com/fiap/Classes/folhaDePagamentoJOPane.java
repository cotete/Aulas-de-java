package br.com.fiap.Classes;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class folhaDePagamentoJOPane {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FolhaDePagamento fdp = new FolhaDePagamento();
        double x, z;
        int w, y;

        try {
            x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario bruto: "));
            w = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto do INSS: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes "));
            z = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do plano de saude: "));
            fdp.valorPlanoDeSaude = z;
            fdp.nDeDependentes = y;
            fdp.salarioBruto = x;
            fdp.descontoINSS = w;

            Radio rd = new Radio();
            rd.mostrar();
            float estacao = sc.nextFloat();
            rd.trocarEstacao(estacao);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Voce errou algo ai veionho melhore");
        }

    }
}
