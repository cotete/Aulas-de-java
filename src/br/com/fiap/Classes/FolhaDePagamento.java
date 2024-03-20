package br.com.fiap.Classes;

public class FolhaDePagamento {
    public double salarioBruto;
    public int nDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido(){
        double salarioLiquido = salarioBruto - ((valorPlanoDeSaude * (nDeDependentes+1)) + (salarioBruto * descontoINSS/100));
        return salarioLiquido;
    }

}
