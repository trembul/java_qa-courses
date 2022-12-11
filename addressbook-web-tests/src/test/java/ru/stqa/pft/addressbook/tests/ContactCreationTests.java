package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation(){

    app.getNavigationHelper().goToAddNewContactForm();
    app.getContactHelper().fillNewContactForm(new ContactData("Role", "Cole",
            "+48 857 999 877", "rcole@qa.com"));
    app.getContactHelper().submitNewContactForm();
    app.logout();
  }
}
