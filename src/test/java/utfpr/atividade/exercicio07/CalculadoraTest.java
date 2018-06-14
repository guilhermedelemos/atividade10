package utfpr.atividade.exercicio07;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
        
    }

    /**
     * Teste que considera apenas o resultado correto
     */
    @Test
    public void calcularMediaTest() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Calculadora c = new Calculadora();
        assertEquals(4.5, c.calcularMedia(vetor, 0, 9), 0.01);
        assertEquals(3.5, c.calcularMedia(vetor, 2, 5), 0.01);
    }
    
    /**
     * Caminho 1, 3
     */
    @Test
    public void calcularMedia1e3Test() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Calculadora c = new Calculadora();
        assertEquals(-1, c.calcularMedia(vetor, -1, 9), 0.01);
    }
    
    /**
     * Caminho 1, 2, 3
     */
    @Test
    public void calcularMedia1e2e3Test() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Calculadora c = new Calculadora();
        assertEquals(-1, c.calcularMedia(vetor, 0, -1), 0.01);
    }
    
    /**
     * Caminho 1, 2, 4 e 5
     * Considera >= em duas asserções
     * if (inicioInterv > fimInterv) {
     * if (inicioInterv == fimInterv) {
     */
    @Test
    public void calcularMedia1e2e4e5Test() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Calculadora c = new Calculadora();
        assertEquals(-1, c.calcularMedia(vetor, 0, 0), 0.01);
        assertEquals(-1, c.calcularMedia(vetor, 1, 0), 0.01);
    }
    
    /**
     * Caminho 1, 2, 4, 6, 7 ,8, 13
     */
    @Test
    public void calcularMedia1e2e4e6e7e8e13Test() {
        int[] vetor = {};
        Calculadora c = new Calculadora();
        assertEquals(Float.NaN, c.calcularMedia(vetor, 0, 10), 0.01);
    }
    
    /**
     * Caminho 1, 2, 4, 6, 7, 8, 10, 9, 8, 13
     */
    @Test
    public void calcularMedia1e2e4e6e7e8e10e9e8e13Test() {
        int[] vetor = {0};
        Calculadora c = new Calculadora();
        assertEquals(Float.NaN, c.calcularMedia(vetor, 1, 10), 0.01);
    }
    
    /**
     * Caminho 1, 2, 4, 6, 7, 8, 10, 11, 9, 8, 13
     */
    @Test
    public void calcularMedia1e2e4e6e7e8e10e11e9e8e13Test() {
        int[] vetor = {2};
        Calculadora c = new Calculadora();
        assertEquals(Float.NaN, c.calcularMedia(vetor, 0, 1), 0.01);
    }
    
    /**
     * Caminho 1, 2, 4, 6, 7, 8, 10, 11, 12, , 9, 8, 13
     * os vértices 10 e 11 são testados por três asserções
     */
    @Test
    public void calcularMedia1e2e4e6e7e8e10e11e12ee9e8e13Test() {
        int[] vetor = {2};
        Calculadora c = new Calculadora();
        
        // if (/*10*/vetor[i] > inicioInterv && /*11*/vetor[i] < fimInterv) {
        assertEquals(2, c.calcularMedia(vetor, 0, 10), 0.01);
        // if (/*10*/vetor[i] > inicioInterv && /*11*/vetor[i] == fimInterv) {
        assertEquals(2, c.calcularMedia(vetor, 0, 2), 0.01);
        // if (/*10*/vetor[i] == inicioInterv && /*11*/vetor[i] < fimInterv) {
        assertEquals(2, c.calcularMedia(vetor, 2, 10), 0.01);
        
        // if (/*10*/vetor[i] == inicioInterv && /*11*/vetor[i] == fimInterv) {
        // não é possível pelo vértice 4 do grafo.
    }
}
