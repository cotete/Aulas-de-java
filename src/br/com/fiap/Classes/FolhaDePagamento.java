package br.com.fiap.Classes;

public class FolhaDePagamento {
    public double salarioBruto;
    public int nDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularPlanoDeSaude(){
        double valorPlano = (valorPlanoDeSaude*(nDeDependentes+1));
        return valorPlano;
    }

    public void calcularSalarioLiquido(){
        double salarioLiquido = salarioBruto - (calcularPlanoDeSaude() + (salarioBruto * descontoINSS/100));
        System.out.println(salarioLiquido);
    }

}
