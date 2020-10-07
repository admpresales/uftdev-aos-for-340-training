package g1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {

        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://advantageonlineshopping.com/");

        Link tabletsCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("TABLETS")
                .tagName("SPAN").build());
        tabletsCategoryTxtLink.click();

        WebElement hPEliteX21011G1TabletWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP Elite x2 1011 G1 Tablet")
                .tagName("A").build());
        hPEliteX21011G1TabletWebElement.click();

        EditField quantityEditField = browser.describe(EditField.class, new EditFieldDescription.Builder()
                .name("quantity")
                .tagName("INPUT")
                .type("text").build());

        // replays without errors quantityEditField.setValue("2");
        // replays with errors. This is how it is at the end of the video
        quantityEditField.setValue("3");

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        Button checkOutBtnButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("CHECKOUT  ($2,558.00)")
                .tagName("BUTTON").build());
        Verify.areEqual("CHECKOUT ($2,558.00)", checkOutBtnButton.getInnerText(), "Verification", "Verify property: innerText");

        Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
                 .accessibilityName("ShoppingCart")
                .innerText("2 ")
                .role("link")
                .tagName("A").build());
        shoppingCartLink.click();

        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("removeProduct iconCss iconX")
                .innerText("")
                .tagName("DIV")
                .index(0).build());
        webElement.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();

// optional        browser.close();
    }

}