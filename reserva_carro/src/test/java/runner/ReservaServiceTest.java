import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaServiceTest {
    private final ReservaService reservaService = new ReservaService();

    @Test
    public void testReservaDentroCobertura() {
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaForaCobertura() {
        String resultado = reservaService.reservar("São Paulo", "Rua B");
        assertEquals("Área fora de cobertura", resultado);
    }
}