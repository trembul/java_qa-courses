package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillNewContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getMobileNumber());
        type(By.name("email"), contactData.getEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }   else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitNewContactForm() {
        click(By.name("submit"));
    }

    public void selectContact(){
        click(By.name("selected[]"));
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void initContactModification(){
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {click(By.name("update"));}

    public void createContact(ContactData contact, boolean b){
        fillNewContactForm(new ContactData("Role", "Cole",
                "+48 857 999 877", "rcole@qa.com", "test1"), true);
        submitNewContactForm();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
