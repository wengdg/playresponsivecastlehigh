package test;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {

  /**
   * Check to see that all pages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:9000");
        assertThat(browser.pageSource()).contains("Welcome to Castle High School");

        browser.goTo("http://localhost:9000/student");
        assertThat(browser.pageSource()).contains("Students/Parents");

        browser.goTo("http://localhost:9000/faculty");
        assertThat(browser.pageSource()).contains("Faculty/Staff");

        browser.goTo("http://localhost:9000/alumni");
        assertThat(browser.pageSource()).contains("Alumni/Friends");

        browser.goTo("http://localhost:9000/contact");
        assertThat(browser.pageSource()).contains("Contact");

      }
    });
  }

}
