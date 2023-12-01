import driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.service.*;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class PruebaCompraExitosa {
    HomeService homeService = new HomeService();
    ProductDetailService productDetailService = new ProductDetailService();
    CartService cartService = new CartService();
    CheckoutService checkoutService = new CheckoutService();
    PaymentService paymentService = new PaymentService();
    SuccessService successService = new SuccessService();



    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
    }

    @Test
    public void pruebaCompraExitosa(){

        //Pasos para ejecutar la prueba
        //1. Abrir el navegador e ir al sitio web de Magento: https://magento.softwaretestingboard.com/
        DriverManager.goSite(homeService.get_urlHome());

        //2. Seleccionar la prenda "Radiant Tee".
        homeService.click_on_txt_product_radiant_tee();

        //3. Configurar las opciones de la prenda:
        //a. Tamaño: L
        productDetailService.click_on_txt_large_size();

        //b. Color: Azul
        productDetailService.click_on_txt_blue_color();

        //c. Cantidad: 2
        productDetailService.send_keys_on_txt_quantity("2");

        //4. Hacer clic en "Add to Cart".
        productDetailService.click_on_btn_add_to_cart();

        //5. Hacer clic en el enlace "shopping cart".
        productDetailService.click_on_txt_link_to_shopping_cart();

        //6. Hacer clic en "Proceed to Checkout".
        cartService.click_on_btn_proceed_to_checkout();

        //7. Completar el formulario de dirección de envío con los datos deseados.
        checkoutService.send_keys_on_txt_customer_email("nicofernandezrazzetto@gmail.com");
        checkoutService.send_keys_on_txt_customer_firstname("Nicolas");
        checkoutService.send_keys_on_txt_customer_lastname("Fernandez");
        checkoutService.send_keys_on_txt_customer_company("Nombre de empresa");
        checkoutService.send_keys_on_txt_customer_street0("Lamadrid 1000");
        checkoutService.send_keys_on_customer_city("Concordia");
        checkoutService.select_on_customer_country("AR");
        checkoutService.send_keys_on_customer_state("Entre Rios");
        checkoutService.send_keys_on_customer_postcode("3200");
        checkoutService.send_keys_on_customer_telephone("3454023349");

        //8. Seleccionar la primera opción en los Métodos de Envío.
        checkoutService.click_on_shipping_method();

        //9. Hacer clic en "Next".
        checkoutService.click_on_next_button();

        //10. Hacer clic en "Place Order".
        paymentService.click_on_btn_place_order();

        //Validaciones
        //El titulo es igual a "Thank you for purchase!"
        successService.getBtn_create_account_visibility();
        Assert.assertEquals(successService.getTitle_text(),"Thank you for your purchase!", "El titulo de compra exitosa no es el correcto.");

        //- El boton "Continue Shopping" esta habilitado.
        Assert.assertTrue(successService.getBtn_continue_shopping_availability(),"El boton Continue Shoppin no está habilitado.");
        //- El boton "Create an Account" esta visible.
        Assert.assertTrue(successService.getBtn_create_account_enabled_boolean(), "El botón Create an Account no esta visible.");
        //- El nùmero de la orden (Your order # is:) es un numero (en la captura de
        //ejemplo es el 000026889). Pista, mediante el metodo split() de la clase
        //String, podra separar to.do el texto en palabras.
        Assert.assertTrue(isNumeric(successService.getTxt_order_number()), "El numero de orden es un valor numérico.");
    }
}
