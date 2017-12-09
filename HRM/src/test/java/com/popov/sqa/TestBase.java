package com.popov.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
   ChromeDriver wd;

   @BeforeMethod
   public void setUp() throws Exception {
      wd = new ChromeDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      openHomePage();
      login();
   }

   @AfterMethod
   public void tearDown() {
      wd.quit();
   }

   public void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
   }

   public void openHomePage() {
      wd.get("http://localhost/addressbook/");
   }

   public void login() {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys("admin");
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys("secret");
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
   }

   public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
   }

   public void fillGroupForm( Group group1 ) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(group1.name);
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(group1.header);
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(group1.footer);
   }

   public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
   }

   public void initContactCreation() {
      wd.findElement(By.linkText("add new")).click();
   }

   public void fillGroupPage( Contact contact1 ) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contact1.firstname);
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contact1.lastname);
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(contact1.address);
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contact1.homeNumber);
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(contact1.email);
   }

   public void submitContactCreation() {
      wd.findElement(By.name("submit")).click();
   }


   public void gotoHomePage() {
      wd.findElement(By.linkText("home")).click();
   }

   public void selectDeleteContact() {
      wd.findElement(By.name("selected[]")).click();
   }

   void deleteContact() {
      wd.findElement(By.xpath("//div[2]/input")).click();
      wd.switchTo().alert().accept();
   }

   void chooseGroup() {
      wd.findElement(By.name("selected[]")).click();
   }

   void deleteGroup() {
      wd.findElement(By.name("delete")).click();
   }


}
