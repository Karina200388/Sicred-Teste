package elementos;

import org.openqa.selenium.By;

public class Elementos {


	public By version = By.xpath("//option[@value='/v1.x/demo/bootstrap_theme_v4']");
    public By addCustomer = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
    public By name = By.xpath("//input[@id='field-customerName']");
    public By lastName = By.xpath("//input[@id='field-contactLastName']");
    public By contactFirstName = By.xpath("//input[@id='field-contactFirstName']");
}
