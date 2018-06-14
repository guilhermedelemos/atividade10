/*
 * http://moodle.utfpr.edu.br/mod/assign/view.php?id=248804
 * Elabore casos de teste em JUnit de forma a alcançar 100% de cobertura do critério de teste estrutural 
 * todos-arcos (branch coverage). Desenhe o grafo de fluxo de controle (GFC) para o método e comente cada 
 * caso de teste com o caminho que foi executado de acordo com o GFC. O desenho do GFC pode ser feito no 
 * espaço em branco no final da avaliação ou encaminhada como uma imagem junto com o projeto; enumere 
 * os nós para identificar corretamente os caminhos.
 */
package utfpr.atividade.exercicio07;

public class Calculadora {

    /**
     * @param vetor
     * @param inicioInterv deve ser >= 0 e menor que fimInterv
     * @param fimInterv deve ser >= 0 e maior que inicioInterv
     * @return (i) media dos inteiros do vetor que estão no intervalo
     * [inicioInterv, fimInterv]
     *
     * (ii) -1 se os parametros forem invalidos
     */
    public float calcularMedia(int vetor[], int inicioInterv, int fimInterv) {
        if (/*1*/inicioInterv < 0 || /*2*/fimInterv < 0) {
            return -1; /*3*/
        }
        if (/*4*/inicioInterv >= fimInterv) {
            return -1; /*5*/
        }
        float soma = 0, n = 0; /*6*/
        for (int i = 0/*7*/; /*8*/i < vetor.length; /*9*/i++) {
            if (/*10*/vetor[i] >= inicioInterv && /*11*/vetor[i] <= fimInterv) {
                soma = soma + vetor[i];/*12*/
                n++;
            }
        }
        return soma / n; /*13*/
    }
}
