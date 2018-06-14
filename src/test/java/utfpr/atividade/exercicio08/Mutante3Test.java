package utfpr.atividade.exercicio08;

import org.junit.Test;
import static org.junit.Assert.*;

public class Mutante3Test {
    
    public Mutante3Test() {
    }

    @Test
    public void getMaiorTest() {
        // Mutante equivalente, portanto, não será morto.
        int[] vetor = {4, 3, 2, 5, 1};
        Mutante3 m = new Mutante3();
        assertEquals(5, m.getMaior(vetor));
    }
}
