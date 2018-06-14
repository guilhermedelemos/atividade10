package utfpr.atividade.exercicio08;

import org.junit.Test;
import static org.junit.Assert.*;

public class Mutante1Test {
    
    public Mutante1Test() {
    }
    
    @Test
    public void getMaiorTest() {
        int[] vetor = {5, 4, 3, 2, 1};
        Mutante1 m = new Mutante1();
        assertEquals(5, m.getMaior(vetor));
    }
    
}
