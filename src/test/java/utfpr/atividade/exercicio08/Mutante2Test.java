package utfpr.atividade.exercicio08;

import org.junit.Test;
import static org.junit.Assert.*;

public class Mutante2Test {

    public Mutante2Test() {
    }
    
    @Test
    public void getMaiorTest() {
        int[] vetor = {4, 5, 1, 2, 3};
        Mutante2 m = new Mutante2();
        assertEquals(5, m.getMaior(vetor));
    }
}
