import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class ReservaSteps {
    private ReservaService reservaService;
    private String resultado;
    private String cidade;
    private String endereco;

    @Given("um passageiro na cidade {string} e endereço {string}")
    public void um_passageiro_na_cidade_e_endereço(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
        reservaService = new ReservaService();
    }

    @When("o passageiro solicita a reserva")
    public void o_passageiro_solicita_a_reserva() {
        resultado = reservaService.reservar(cidade, endereco);
    }

    @Then("a mensagem deve ser {string}")
    public void a_mensagem_deve_ser(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}