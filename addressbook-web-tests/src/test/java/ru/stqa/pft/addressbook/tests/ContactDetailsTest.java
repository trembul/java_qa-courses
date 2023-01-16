package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDetailsTest extends TestBase{

    @Test
    public void testContactDetails() {
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));
        assertThat(contact.getAllEmails().trim()
                .replaceAll(" +", ""), equalTo(mergeEmails(contactInfoFromEditForm)));
        assertThat(contact.getAddress().trim()
                        .replaceAll(" +", ""),
                equalTo(contactInfoFromEditForm.getAddress().trim().replaceAll(" +", "")));
    }

    private String mergePhones(ContactData contact) {
        return Arrays.asList(contact.getHomePhone(), contact.getMobilePhone(), contact.getWorkPhone())
                .stream().filter((s -> ! s.equals("")))
                .map(ContactPhoneTest :: cleaned)
                .collect(Collectors.joining("\n"));
    }

    private String mergeEmails(ContactData contact) {
        return Arrays.asList(contact.getEmail(), contact.getEmail2(), contact.getEmail3())
                .stream().filter((s -> ! s.equals("")))
                .map(ContactEmailTest :: cleaned)
                .collect(Collectors.joining("\n"));
    }

    public static String cleaned(String contact) {
        return contact.replaceAll("\\s", "").replaceAll("[-()]", "");
    }
}
