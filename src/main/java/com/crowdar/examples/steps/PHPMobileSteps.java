package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ApiDemoHome;
import com.crowdar.examples.pages.PHPMobileHome;
import com.crowdar.examples.pages.PHPVisaPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class PHPMobileSteps extends PageSteps {}

/*


    @Given("el usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {
    }


    @When("el usuario tapea el icono VISA")
    public void elUsuarioTapeaElIconoVISA() {
       // Injector._page(PHPMobileHome.class).tapVisaButton();
    }

    @And("el usuario completa los datos desde {string} hasta {string}")
    public void completeFrom(String arg0, String arg1) {
        Injector._page(PHPVisaPage.class).tapSearchFrom();
        Injector._page(PHPVisaPage.class).completeFrom();
        Injector._page(PHPVisaPage.class).tapCountryTo();
        Injector._page(PHPVisaPage.class).tapSearchTo();

        Injector._page(PHPVisaPage.class).tapCountryTo();
        Injector._page(PHPVisaPage.class).tapSearchTo();
        Injector._page(PHPVisaPage.class).tapcompleteTo();
        Injector._page(PHPVisaPage.class).tapCountrySpain();

    }

    @And("el usuario completa el campo nombre: {string}, apellido <apellido>, email <email>, celular <celular>, notas <notas>")
    public void elUsuarioCompletaElCampoNombreApellidoApellidoEmailEmailCelularCelularNotasNotas(String arg0) {
        Injector._page(PHPVisaPage.class).completeName();
        Injector._page(PHPVisaPage.class).tapLastName();
        Injector._page(PHPVisaPage.class).completeLastName();
        Injector._page(PHPVisaPage.class).tapEmail();
        Injector._page(PHPVisaPage.class).completeEmail();
        Injector._page(PHPVisaPage.class).tapPhone();
        Injector._page(PHPVisaPage.class).CompletePhone();
    }

    @And("el usuario tapea el boton {string}")
    public void elUsuarioTapeaElBoton(String arg0) {
        Injector._page(PHPVisaPage.class).tapSubmit();
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReserva() {
        Assert.assertEquals(Injector._page(PHPVisaPage.class).ReadTittle(), "Reservation Submitted");
    }
}*/
