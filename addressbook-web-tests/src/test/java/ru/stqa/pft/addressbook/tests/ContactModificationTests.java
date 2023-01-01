package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        if (! app.getContactHelper().isThereAContact()){
            app.getNavigationHelper().goToAddNewContactForm();
            app.getContactHelper().createContact(new ContactData("Role", "Cole",
                    "+48 857 999 877", "rcole@qa.com", null));
            app.getNavigationHelper().goToHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData ("George", "Foreman",
                        "+48 256 248 747", "gforman@gmail.com", null), false);
        app.getContactHelper().submitContactModification();
        app.logout();
    }
}
