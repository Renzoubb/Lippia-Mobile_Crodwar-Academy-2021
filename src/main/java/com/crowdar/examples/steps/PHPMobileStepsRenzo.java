package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PHPMobileStepsRenzo extends PageSteps {

    @Given("el usuario se encuentra en la home de la app")
    public void userInHome() {
        PHPMobileHome.VerificaElemento();
        }

    @When("el usuario tapea el icono Tours")
    public void elUsuarioTapeaElIconoTours() {
        Injector._page(PHPMobileHome.class).tapToursButton();
    }

    @And("el usuario completa los datos de destino <destino> , fecha <fecha>")
    public void elUsuarioCompletaLosDatosDeDestinoDestinoFechaFecha() {
        Injector._page(PHPToursPage.class).tapLocationContent();
        Injector._page(PHPToursPage.class).tapSearchContent();
        Injector._page(PHPToursPage.class).completeLocationTour();
        Injector._page(PHPToursPage.class).tapCityName();
        Injector._page(PHPToursPage.class).tapDateFrom();
        Injector._page(PHPToursPage.class).tapDateSelected();
        Injector._page(PHPToursPage.class).tapOkButton();
    }
    @And("el usuario selecciona cantidad de adultos <cantidad>")
    public void elUsuarioSeleccionaCantidadDeAdultosCantidad() {
        Injector._page(PHPToursPage.class).tapAdultButton();
        Injector._page(PHPToursPage.class).tapAdultCuantity();
    }
    @And("el usuario tapea el boton {string}")
    public void elUsuarioTapeaElBoton(String arg0) {
        Injector._page(PHPToursPage.class).tapSearchButton();
    }

    @And("el usuario tapea el ícono de tour encontrado")
    public void elUsuarioTapeaElÍconoDeTourEncontrado() {
        Injector._page(PHPToursPage.class).tapTourName();
    }

    @And("el usuario selecciona la cantidad de adultos y de niños")
    public void elUsuarioSeleccionaLaCantidadDeAdultosYDeNiños() {
        Injector._page(PHPtourSelected.class).tapSpinnerAdult();
        Injector._page(PHPtourSelected.class).tapQuantityAdult();
        Injector._page(PHPtourSelected.class).tapSpinnerChild();
        Injector._page(PHPtourSelected.class).tapQuantityChild();
    }

    @And("el usuario tapea el boton BOOK")
    public void elUsuarioTapeaElBotonBOOK() {
        Injector._page(PHPtourSelected.class).tapBook();
    }

    @And("el usuario completa los datos <nombre>, <apellido>,<mail>,<phonenumber>, <address>")
    public void elUsuarioCompletaLosDatosNombreApellidoMailPhonenumberAddress() {
        Injector._page(PHPtourSelected.class).tapFirstName();
        Injector._page(PHPtourSelected.class).CompleteFirstName();
        Injector._page(PHPtourSelected.class).tapSecondName();
        Injector._page(PHPtourSelected.class).CompleteSecondName();
        Injector._page(PHPtourSelected.class).tapEmailButton();
        Injector._page(PHPtourSelected.class).CompleteEmail();
        Injector._page(PHPtourSelected.class).tapPhoneButton();
        Injector._page(PHPtourSelected.class).CompletePhone();
        Injector._page(PHPtourSelected.class).tapAddressButton();
        Injector._page(PHPtourSelected.class).CompleteAddress();

    }

    @And("el usuario tapea el boton PROCEED")
    public void elUsuarioTapeaElBotonPROCEED() {
        Injector._page(PHPtourSelected.class).tapProceedButton();
    }

    @Then("el usuario verifica que se realizo correctamente la reserva del tour")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReservaDelTour() {
        Assert.assertEquals(Injector._page(PHPtourSelected.class).ReadTittle(), "Your booking status is Unpaid");
    }
}


