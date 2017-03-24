package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by user on 3/24/2017.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeDialogBox();
  }

}
