/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioslistas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaVetor vetor = new ListaVetor();
       
       Aluno aluno1 = new Aluno();
       Aluno aluno2 = new Aluno();
       Aluno aluno3 = new Aluno();
       
       vetor.adiciona(aluno1);
       vetor.adiciona(aluno2);
       vetor.adiciona(0, aluno3);
       
       int tamanho = vetor.tamanho();
       
       if (tamanho != 3) {
           System.out.println("Erro: O tamanho da lista está errado. ");
       }
       
       if (!vetor.contem(aluno1)) {
           System.out.println("Erro: Não achou um aluno que deveria estar na lista");
       }
       
       vetor.remove(0);
       tamanho = vetor.tamanho();
       
       if (tamanho != 2) {
           System.out.println("Erro: O tamanho da lista está errado. ");
       }
       
       if (vetor.contem(aluno3)) {
           System.out.println("Erro: Achou um aluno que não deveria estar na lista. ");
       }
    }
    
}
