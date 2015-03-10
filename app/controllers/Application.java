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
   * Return the students/parents page.
   * @return The resulting students and parents page.
   */
  public static Result student() {
    return ok(Student.render("Students and Parents"));
  }

  /**
   * Returns the faculty/staff page.
   * @return The resulting faculty and staff page.
   */
  public static Result faculty() {
    return ok(Faculty.render("Faculty and Staff"));
  }

  /**
   * Returns the alumni/friends page.
   * @return The resulting alumni and friends page.
   */
  public static Result alumni() {
    return ok(Alumni.render("Alumni and Friends"));
  }

  /**
   * Returns the contact page.
   * @return The resulting contact page.
   */
  public static Result contact() {
    return ok(Contact.render("Contact"));
  }
}
