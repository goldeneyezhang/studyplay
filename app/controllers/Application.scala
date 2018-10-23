package controllers
import play.api.mvc._
import javax.inject._
class Application @Inject()(cc:ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc)  {

  def hello(name: String) = Action {
    Ok("Hello " + name + "!")
  }
  // Redirect to /hello/Bob
  def helloBob = Action {
    Redirect(routes.Application.hello("Bob"))
  }
}