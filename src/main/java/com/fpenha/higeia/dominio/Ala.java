package com.fpenha.higeia.dominio;

public class Ala {

    private String nome;
    private Leito[] leitos;
    private int indiceDeEntrada = 0;

    public Ala(String nome, int quantidadeDeLeito){

        this.nome = nome;
        this.leitos = new Leito[quantidadeDeLeito];
    }

    public void adicionarPaciente (Paciente paciente) throws DominioException{

        if(alaLotada()){
            throw new DominioException("Ala Lotada: " + nome);
        }

        Leito leitoOcupado = new Leito(paciente);
        leitos[indiceDeEntrada] = leitoOcupado;

    }

    public void removerPaciente(Paciente paciente){
        
    }

    private boolean alaLotada () {
        return leitos.length-1 == indiceDeEntrada;
    }
}
