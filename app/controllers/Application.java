package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {
  /**
   * Controller for homepage.
   * @return Returns the rendered index.
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
