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
   * Check to see that the index and subpages can be retrieved.
   */
  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        browser.goTo("http://localhost:3333");
        assertThat(browser.pageSource()).contains("Welcome to Castle");

        browser.goTo("http://localhost:3333/student");
        assertThat(browser.pageSource()).contains("Student page");

        browser.goTo("http://localhost:3333/faculty");
        assertThat(browser.pageSource()).contains("Faculty Page");

        browser.goTo("http://localhost:3333/alumni");
        assertThat(browser.pageSource()).contains("Alumni Page");

        browser.goTo("http://localhost:3333/contact");
        assertThat(browser.pageSource()).contains("Contact page");

      }
    });
  }

}
