package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class Relative @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

    def helloview() = Action { implicit request =>
        Ok(views.html.hello3("Bob"))
    }

    def hello(name: String) = Action {
        Ok(s"Hello $name!")
    }
}