import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InicialTest {

    @Test
    void verificarJUnit() {
        Assertions.assertTrue(true);
    }

    @Test
    void testarSeIgualADois() {
        int numero = 2;

        Assertions.assertEquals(2, numero);
    }

}
