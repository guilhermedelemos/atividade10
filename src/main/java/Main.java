
import utfpr.atividade.exercicio07.Calculadora;
import utfpr.atividade.exercicio08.Mutante1;
import utfpr.atividade.exercicio08.Mutante2;
import utfpr.atividade.exercicio08.Mutante3;
import utfpr.atividade.exercicio08.Original;

public class Main {
    public static void main(String[] args) {
        //int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] valores = {};
        Calculadora c = new Calculadora();
        float resultado = c.calcularMedia(valores, 0, 10);
        System.out.println("Média: " + resultado);
        
        int[] vetor = {5, 2, 10, 1};
        Original o = new Original();
        System.out.println("Original: " + o.getMaior(vetor));
        
        Mutante1 m1 = new Mutante1();
        System.out.println("Mutante 1: " + m1.getMaior(vetor));
        
        Mutante2 m2 = new Mutante2();
        System.out.println("Mutante 2: " + m2.getMaior(vetor));
        
        Mutante3 m3 = new Mutante3();
        System.out.println("Mutante 3: " + m3.getMaior(vetor));
    }
}
