package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData ("George", "Foreman",
                        "+48 256 248 747", "gforman@gmail.com"));
        app.getContactHelper().submitContactModification();
        app.logout();
    }
}
