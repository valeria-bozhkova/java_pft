package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.gotoAddContactPage();
    app.fillContactForm(new ContactData("John", "Doe", "Green Street, LA, 30495", "1-208-555-1212", "johndoe@soup.com"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}