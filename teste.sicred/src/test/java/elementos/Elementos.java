package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By version = By.xpath("//option[@value='/v1.x/demo/bootstrap_theme_v4']");
	public By addCustomer = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");
    public By name = By.xpath("//input[@id='field-customerName']");
    public By lastName = By.xpath("//input[@id='field-contactLastName']");
    public By ContactFirstName = By.xpath("//input[@id='field-contactFirstName']"); 
    public By phone = By.xpath("//input[@id='field-phone']");
    public By AddressLine1 = By.xpath("//input[@id='field-addressLine1']");
    public By AddressLine2 = By.xpath("//input[@id='field-addressLine2']");
    public By City = By.xpath("//input[@id='field-city']");
    public By State = By.xpath("//input[@id='field-state']");
    public By PostalCode = By.xpath("//input[@id='field-postalCode']");
    public By Country = By.xpath("//input[@id='field-country']");
    public By fromEmployeer = By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]");
    public By CreditLimit = By.xpath("//input[@id='field-creditLimit']");
    public By save = By.xpath("//button[@class='btn btn-secondary btn-success b10']");
    public By reportSucess = By.xpath("//div[@id='report-success']");

}
