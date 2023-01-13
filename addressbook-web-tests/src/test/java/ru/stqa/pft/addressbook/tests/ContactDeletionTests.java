package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase{

    @Test(enabled = false)
    public void testContactDeletion(){
        if (! app.getContactHelper().isThereAContact()){
            app.goTo().goToAddNewContactForm();
            app.getContactHelper().createContact(new ContactData("Role", "Cole"));
            app.goTo().goToHomePage();
        }

        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size()-1);
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().waitForDynamicElement(By.cssSelector("div.msgbox"));
        app.goTo().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(before.size()-1);
        Assert.assertEquals(before, after);
    }
}
