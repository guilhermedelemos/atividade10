package utfpr.atividade.exercicio08;

import org.junit.Test;
import static org.junit.Assert.*;

public class OriginalTest {

    public OriginalTest() {
    }

    @Test
    public void getMaiorTest() {
        int[] vetor = {4, 3, 2, 5, 1};
        Original o = new Original();
        assertEquals(5, o.getMaior(vetor));
    }
    
    /**
     * Mutante 1
     */
    @Test
    public void getMaior1Test() {
        int[] vetor = {5, 4, 3, 2, 1};
        Original o = new Original();
        assertEquals(5, o.getMaior(vetor));
    }
    
    /**
     * Mutante 2
     */
    @Test
    public void getMaior2Test() {
        int[] vetor = {4, 5, 1, 2, 3};
        Original o = new Original();
        assertEquals(5, o.getMaior(vetor));
    }
    
}
