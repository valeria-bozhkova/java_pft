package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    gotoAddContactPage();
    fillContactForm(new ContactData("John", "Doe", "Green Street, LA, 30495", "1-208-555-1212", "johndoe@soup.com"));
    submitContactCreation();
    returnToHomePage();
  }

}