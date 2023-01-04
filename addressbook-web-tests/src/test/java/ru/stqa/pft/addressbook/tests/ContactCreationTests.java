package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNavigationHelper().goToAddNewContactForm();
        app.getContactHelper().createContact(new ContactData("Role", "Cole",
                "+48 857 999 877", "rcole@qa.com", null));
        app.logout();
    }
}
