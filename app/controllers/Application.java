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
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns.
   * @return student.
   */
  public static Result student() {
    return ok(Student.render("Students and Parents"));
  }

  /**
   * Returns.
   * @return faculty.
   */
  public static Result faculty() {
    return ok(Faculty.render("Faculty and Staff"));
  }

  /**
   * Returns.
   * @return alumni.
   */
  public static Result alumni() {
    return ok(Alumni.render("Alumni and Friends"));
  }

  /**
   * Returns.
   * @return contact.
   */
  public static Result contact() {
    return ok(Contact.render("Contact"));
  }
}
