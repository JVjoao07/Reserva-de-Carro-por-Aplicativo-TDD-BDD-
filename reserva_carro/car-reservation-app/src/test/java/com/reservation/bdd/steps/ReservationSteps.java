import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class ReservationSteps {

    private String cidade;
    private String endereco;
    private String resultado;

    @Given("a cidade {string} e o endereco {string}")
    public void a_cidade_e_o_endereco(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @When("o usuario tenta reservar um carro")
    public void o_usuario_tenta_reservar_um_carro() {
        ReservationService reservationService = new ReservationService();
        resultado = reservationService.reservar(cidade, endereco);
    }

    @Then("o resultado deve ser {string}")
    public void o_resultado_deve_ser(String resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}