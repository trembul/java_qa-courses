package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion(){
        if (! app.getContactHelper().isThereAContact()){
            app.getNavigationHelper().goToAddNewContactForm();
            app.getContactHelper().createContact(new ContactData("Role", "Cole",
                    "+48 857 999 877", "rcole@qa.com", null));
            app.getNavigationHelper().goToHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().acceptAlert();
        app.logout();
    }
}
