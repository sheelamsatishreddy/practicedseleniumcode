
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class livecode {

    public static void main(String[] args) {
        // Setting system properties for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to Galabingo website
        driver.get("https://bingo.galabingo.com");

        // Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        // Fill in login details
        WebElement usernameField = driver.findElement(By.id("loginName"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        usernameField.sendKeys("Sirisha5029");
        passwordField.sendKeys("Test@1234");
        submitButton.click();

        // Wait for login process to complete
        // Note: You may need to add additional waits or logic here depending on the site behavior

        // Navigate to Bargain wins rooms
        WebElement bargainWinsRoomsLink = driver.findElement(By.xpath("//a[contains(text(),'Bargain Wins')]"));
        bargainWinsRoomsLink.click();

        // Wait for the Bargain Wins rooms to load
        // Note: You may need to add additional waits or logic here depending on the site behavior

        // Purchase tickets
        // Add your logic to purchase tickets here
        // Example:
        WebElement ticket = driver.findElement(By.xpath("//your_ticket_xpath"));
        // ticket.click();

        // Check whether correct amount is deducted from player's wallet
        // Add your logic to check wallet balance here
        // Example:
        // WebElement walletBalance = driver.findElement(By.xpath("//xpath_of_wallet_balance_element"));
        // String actualBalance = walletBalance.getText();
        // String expectedBalance = "expected_balance";
        // Assert.assertEquals(actualBalance, expectedBalance);

        // Check if the player is winner or non-winner of any one line reward
        checkRewardStatus("One Line");

        // Check if the player is winner or non-winner of any two line reward
        checkRewardStatus("Two Lines");

        // Check if the player is winner or non-winner of Full house reward
        checkRewardStatus("Full House");

        // Check what all features are configured for the game
        List<WebElement> gameFeatures = driver.findElements(By.xpath("//ul[@class='game-features']/li"));
        for (WebElement feature : gameFeatures) {
            System.out.println("Game Feature: " + feature.getText());
        }

        // After the game ends, check if the player got any reward amount that is correctly added to the wallet
        // Add your logic to check reward amount added to wallet after the game ends

        // Close the browser
        driver.quit();
    }

    public static void checkRewardStatus(String rewardType) {
        WebElement rewardElement = driver.findElement(By.xpath("//div[contains(text(),'" + rewardType + "')]"));
        String rewardStatus = rewardElement.getText();
        System.out.println("Reward for " + rewardType + ": " + rewardStatus);
        // Add your assertion logic or further validation here
    }
}