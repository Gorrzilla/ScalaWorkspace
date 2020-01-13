import org.scalajs.dom
import org.scalajs.dom.{window, Coordinates, PositionError, PositionOptions}
import dom.document
import scalatags.JsDom.all._
import scala.scalajs.js

object Runner {

  def locateSuccess(pos: dom.Position): Unit = {
      appendPar(document.body, "Your Latitude is " + pos.coords.latitude)
      appendPar(document.body, "Your Longitude is " + pos.coords.longitude)
  }

  def locateFailure(err: dom.PositionError): Unit = {
        println(err.code)
        println(err.message)
  }

  def locationOpts(): org.scalajs.dom.raw.PositionOptions = {
     val opts = js.Object().asInstanceOf[PositionOptions]
     opts.timeout = 50000
     opts.enableHighAccuracy = true
     return opts 
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  val textNode = document.createTextNode(text)
  parNode.appendChild(textNode)
  targetNode.appendChild(parNode)
} 

  def main(args: Array[String]): Unit = {

    val opts = locationOpts()
    window.navigator.geolocation.getCurrentPosition(
      {pos: dom.Position => locateSuccess(pos)}, 
      {err: PositionError =>},
      opts)
  }


  

}
