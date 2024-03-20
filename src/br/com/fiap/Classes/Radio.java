package br.com.fiap.Classes;

public class Radio {
    public int volume;
    public float estacao;

    public void aumentarVolume(){
        volume++;
    }
    public void DiminuirVolume(){
        volume--;
    }

    public void trocarEstacao (float estacao){
        this.estacao = estacao;
    }

    public void mostrar(){
        System.out.println("Volume: " + volume + "\nEstacao: " + estacao);
    }


}
