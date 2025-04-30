import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.reservation.service.ReservationService;

public class ReservationServiceTest {

    private ReservationService reservationService;

    @BeforeEach
    public void setUp() {
        reservationService = new ReservationService();
    }

    @Test
    public void testReservarInBeloHorizonte() {
        String result = reservationService.reservar("Belo Horizonte", "Rua A, 123");
        assertEquals("Motorista a caminho", result);
    }

    @Test
    public void testReservarInContagem() {
        String result = reservationService.reservar("Contagem", "Rua B, 456");
        assertEquals("Motorista a caminho", result);
    }

    @Test
    public void testReservarOutsideCoverageArea() {
        String result = reservationService.reservar("São Paulo", "Rua C, 789");
        assertEquals("Área fora de cobertura", result);
    }
}