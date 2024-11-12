import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExitTest extends BaseTest {
    @Test
    @DisplayName("Регистрация и выход из аккаунта ")
    public void accountExit() {
        signUpAndLoginAccBut();
        acc.logOutButtonClick();
        home.clickLogo();
        assertTrue(home.isBunsIsDisplayed());
    }
    @After
    @Override
    public void tearDown() {
        driver.quit();
    }
}
