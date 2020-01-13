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
        dom.window.alert(err.code + "\n" + err.message)
  }

  def locationOpts(): org.scalajs.dom.raw.PositionOptions = {
     val opts = js.Object().asInstanceOf[PositionOptions]
     opts.timeout = 50000
     opts.enableHighAccuracy = true
     return opts 
  }

  def populateHeader() : Unit = {
    //import org.scalajs.dom.Date

    val div = document.createElement("h1")
    val textNode = document.createTextNode("Welcome Andrew")
    div.appendChild(textNode)
    document.body.appendChild(div)
    val tmp = js.Date().toString()
    appendPar(document.body, tmp)

  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  val textNode = document.createTextNode(text)
  parNode.appendChild(textNode)
  targetNode.appendChild(parNode)
} 

  def main(args: Array[String]): Unit = {

    populateHeader()

    val opts = locationOpts()
    window.navigator.geolocation.getCurrentPosition(
      {pos: dom.Position => locateSuccess(pos)}, 
      {err: PositionError =>},
      opts)
  }


  

}
