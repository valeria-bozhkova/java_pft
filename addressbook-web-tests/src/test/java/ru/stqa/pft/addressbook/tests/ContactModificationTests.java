package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 3/24/2017.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.goTo().addContactPage();
      app.contact().create(new ContactData().withFirstName("John").withLastName("Doe").withAddress("Green Street, LA, 30495")
              .withPhone("1-208-555-1212").withEmail("johndoe@soup.com").withGroup("g2name"), true);
    }
  }

  @Test//(enabled = false)
  public void testContactModification() {
    List<ContactData> before = app.contact().list();
    int index = before.size() - 1;
    ContactData contact = new ContactData().withFirstName("John").withLastName("Doe").withAddress("Green Street, LA, 30495")
            .withPhone("1-208-555-1212").withEmail("johndoe@soup.com").withGroup("g2name");
    app.contact().modify(index, contact);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }



}
