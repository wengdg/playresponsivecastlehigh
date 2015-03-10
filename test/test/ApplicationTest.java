package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that the Index template renders correctly.
   */
  @Test
  public void renderTemplate() {
    Content html = views.html.Index.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Welcome");

  }

  /**
   * Test the Student page for the word 'Knights'.
   */
  @Test
  public void renderStudent() {
    Content html = views.html.Student.render("Students and Parents");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Knights");

  }

  /**
   * Test the Faculty page for the word 'Resources'.
   */
  @Test
  public void renderFaculty() {
    Content html = views.html.Faculty.render("Faculty and Staff");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Resources");

  }

  /**
   * Test the Alumni page for the word 'Transcript'.
   */
  public void renderAlumni() {
    Content html = views.html.Alumni.render("Alumni and Friends");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Transcript");

  }

  /**
   * Test the Contact page for the word 'General'.
   */
  @Test
  public void renderContact() {
    Content html = views.html.Contact.render("Contact");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("General");

  }
}
