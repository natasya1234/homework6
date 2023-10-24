package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseClass;
import org.example.data.AccountData;
import org.example.locators.CheckoutLocator;
import org.example.page.CheckoutPages;
import org.example.page.InvalidLoginPages;
import org.example.page.LoginPages;
import org.example.page.AddToCartPages;
import org.testng.Assert;

public class LoginTillCheckoutProductStepDef {
    @Before
        public void setup(){
            BaseClass.setDriver();
        }
//login scenario
    @Given("pengguna menampilkan halaman login website saucedemo")
    public void penggunaMenampilkanHalamanLoginWebsiteSaucedemo() {
        BaseClass.navigateToHome();
    }

    @When("pengguna memasukan username")
    public void penggunaMemasukanUsername() {
        LoginPages.inputUsername();
    }

    @And("pengguna memasukan password")
    public void penggunaMemasukanPassword() {
        LoginPages.inputPassword();
    }

    @And("pengguna memilih button login")
    public void penggunaMemilihButtonLogin() {
        LoginPages.btnLogin();
    }

    @Then("pengguna berhasil login website saucedemo")
    public void penggunaBerhasilLoginWebsiteSaucedemo() {
        Assert.assertEquals(LoginPages.homePage(),AccountData.homepage,"Homepage Name Not Same");
    }
// Add to cart scenario
    @Given("The user successfully logs in and displays the inventory page")
    public void theUserSuccessfullyLogsInAndDisplaysTheInventoryPage() {
        BaseClass.navigateToHome();
        LoginPages.inputUsername();
        LoginPages.inputPassword();
        LoginPages.btnLogin();
    }

    @When("User select product image")
    public void userSelectProductImage() {
        AddToCartPages.ItemProduct();
    }

    @And("User klik Add to Cart Button")
    public void userKlikAddToCartButton() {
        AddToCartPages.btnAddToCart();
    }

    @Then("Then users successfully add to cart product and show item on basket")
    public void thenUsersSuccessfullyAddToCartProductAndShowItemOnBasket() {
        AddToCartPages.shoppingCart();
        Assert.assertEquals(AddToCartPages.itemName(),AccountData.item_name,"Item Name Not Same");
        Assert.assertEquals(AddToCartPages.itemQty(),AccountData.item_qty_expect,"Item Qty Not Same");
        Assert.assertEquals(AddToCartPages.itemPriceCurrency(),AccountData.item_price_currency_expect,"Item Currency or Price Not Same");
    }
// Checkout product scenario
    @Given("The user successfully logs in and Add to cart product")
    public void theUserSuccessfullyLogsInAndAddToCartProduct() {
        BaseClass.navigateToHome();
        LoginPages.inputUsername();
        LoginPages.inputPassword();
        LoginPages.btnLogin();
        AddToCartPages.ItemProduct();
        AddToCartPages.btnAddToCart();
    }

    @When("User klik shopping cart")
    public void userKlikShoppingCart() {
        AddToCartPages.shoppingCart();
    }

    @And("User klik checkout button")
    public void userKlikCheckoutButton() {
        CheckoutPages.btnCheckout();
    }

    @And("User insert first name")
    public void userInsertFirstName() {
        CheckoutPages.inputFirstName();
    }

    @And("User insert last name")
    public void userInsertLastName() {
        CheckoutPages.inputLastName();
    }
    @And("user insert postal code")
    public void userInsertPostalCode() {
        CheckoutPages.inputPostalCode();
    }
    @And("User klik continue button")
    public void userKlikContinueButton() {
        CheckoutPages.btnContinue();
        Assert.assertEquals(CheckoutPages.checkoutPages(),AccountData.checkout_overview_page_name,"Page Name Not Same");
    }

    @When("User klik finish button")
    public void userKlikFinishButton() {
        CheckoutPages.btnFinish();
    }

    @Then("The user successfully checkout product and display complete page")
    public void theUserSuccessfullyCheckoutProductAndDisplayCompletePage() {
        Assert.assertEquals(CheckoutPages.completePage(),AccountData.complete_page_name,"Complete Page Name Not Same");
    }
//Invalid Login Scenario
    @Given("The user is on login pages")
    public void theUserIsOnLoginPages() {
        BaseClass.navigateToHome();
    }

    @When("The User enters invalid username")
    public void theUserEntersInvalidUsername() {
        InvalidLoginPages.invalidInputUsername();
    }

    @And("The user enters invalid password")
    public void theUserEntersInvalidPassword() {
        InvalidLoginPages.invalidInputPassword();
    }

    @Then("The user klik login button and failed login")
    public void theUserKlikLoginButtonAndFailedLogin() {
        InvalidLoginPages.invalidButtonLogin();
    }


}
