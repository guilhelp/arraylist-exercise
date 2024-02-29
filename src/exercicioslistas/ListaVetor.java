/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioslistas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ListaVetor {
    
    private Object[] objetos = new Object[100];
    
    private int totalDeObjetos = 0;
    
    public void adiciona(Object objeto) {
        this.garantaEspaço();
        this.objetos[this.totalDeObjetos] = objetos;
        this.totalDeObjetos++;
    }
    
    public void adiciona(int posicao, Aluno aluno) {
        this.garantaEspaço();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i =this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];
        }
        
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }
    
    public Object pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objetos[posicao];
    }
    
    public void remove(int posicao) {
        if(!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }
    
    public boolean contem(Aluno aluno) {
        for (int i = 0; i< this.totalDeObjetos; i++){
            if (aluno.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;
    }
    
    public int tamanho() {
        return this.totalDeObjetos;
    }
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }
    
    private void garantaEspaço() {
        if (this.totalDeObjetos == this.objetos.length) {
            Object[] novaArray = new Object[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                    novaArray[i] = this.objetos[i];
                this.objetos = novaArray;
            }
        }
    }
}
