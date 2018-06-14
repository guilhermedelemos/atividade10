/*
 * http://moodle.utfpr.edu.br/mod/assign/view.php?id=248804
 * (Exercício 8) Considere as quatro classes a seguir. Observe que existe um programa original e três 
 * mutantes; as mutações aplicadas em cada mutante estão destacadas em negrito.
 * Implemente casos de teste em JUnit para matar cada um dos três mutantes; se algum dos mutantes for 
 * equivalente, justifique.
 */
package utfpr.atividade.exercicio08;

public class Mutante3 {
//método retorna o maior elemento do vetor

    public int getMaior(int vetor[]) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
