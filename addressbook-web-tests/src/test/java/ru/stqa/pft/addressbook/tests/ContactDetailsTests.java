package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDetailsTests extends TestBase {

    @Test
    public void testContactDetails() {
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
        ContactData contactInfoFromDetailsView = app.contact().infoFromDetailsView(contact);

        assertThat(contactInfoFromDetailsView.getContactDetails()
                        .trim().replaceAll(" +", "").replaceAll("\\s", "")
                        .replaceAll("[HW:]", ""),
                equalTo(mergeAllInfo(contactInfoFromEditForm)
                        .trim().replaceAll(" +", "").replaceAll("\\s", "")));
    }

    private String mergeAllInfo(ContactData contact) {
        return Arrays.asList(contact.getFirstName(), contact.getLastName(), contact.getAddress(), contact.getHomePhone(),
                        contact.getMobilePhone(), contact.getWorkPhone(), contact.getEmail(), contact.getEmail2(),
                        contact.getEmail3())
                .stream().filter((s -> !s.equals("")))
                .collect(Collectors.joining("\n"));
    }
}