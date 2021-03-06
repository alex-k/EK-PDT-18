package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	app.groupHelper.fillGroupForm(app, this, group);
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	app.navigationHelper.openMainPage();
    app.navigationHelper.gotoGroupsPage();
    app.groupHelper.initGroupCreation();
    app.groupHelper.fillGroupForm(app, this, new GroupData("", "", ""));
    app.groupHelper.submitGroupCreation();
    app.groupHelper.returnToGroupsPage();
  }
}
