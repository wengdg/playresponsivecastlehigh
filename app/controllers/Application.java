package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Student;
import views.html.Faculty;
import views.html.Alumni;
import views.html.Contact;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }

  /**
   * Returns the student page.
   *
   * @return The resulting student page.
   */
  public static Result student() {
    return ok(Student.render());
  }

  /**
   * Returns the faculty page.
   *
   * @return The resulting faculty page.
   */
  public static Result faculty() {
    return ok(Faculty.render());
  }

  /**
   * Returns the alumni page.
   *
   * @return The resulting alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render());
  }

  /**
   * Returns the contact page.
   *
   * @return The resulting contact page.
   */
  public static Result contact() {
    return ok(Contact.render());
  }
}
