package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.contact().all().size() == 0){
            app.goTo().newContactForm();
            app.contact().create(new ContactData()
                    .withFirstName(app.properties.getProperty("contact.firstNameCreate"))
                    .withLastName(app.properties.getProperty("contact.lastNameCreate")));
            app.goTo().homePage();
        }
    }

    @Test
    public void testContactDeletion(){

        Contacts before = app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo(before.size()-1));
        Contacts after = app.contact().all();
        before.remove(deletedContact);
        assertThat(after, equalTo(before.without(deletedContact)));
    }
}
