import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Exercicio4Test {

    public Exercicio4Test() {

    }

    Exercicio4 objExercicio4 = new Exercicio4();

    @Test
    public void testTempoSocio() {
        assertEquals("Subsídio é R$25,00", objExercicio4.classificador(1, ""));
        assertEquals("Subsídio é R$35,00", objExercicio4.classificador(2, ""));
        assertEquals("Subsídio é R$50,00", objExercicio4.classificador(5, ""));
        

    }

    @Test
    public void testPosto() {
        assertEquals("Extra de R$10,00", objExercicio4.classificador(0, "LOBO"));
        assertEquals("Extra de R$15,00", objExercicio4.classificador(0, "URSO"));
        assertEquals("Extra de R$20,00", objExercicio4.classificador(0, "LEÃO"));
        assertEquals("Sem subsídio extra", objExercicio4.classificador(0, "LOBINHO"));
        
    }

}