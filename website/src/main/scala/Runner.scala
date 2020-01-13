import org.scalajs.dom
import org.scalajs.dom.{window, Coordinates, PositionError, PositionOptions}
import dom.document
import scalatags.JsDom.all._
import scala.scalajs.js

object Runner {

  def locateSuccess(pos: dom.Position): Unit = {
      val longitude = pos.coords.longitude
      val parNode = document.createElement("p")
      val latitudeNode = document.createTextNode("Your Latitude is " + pos.coords.latitude)
      val longitudeNode = document.createTextNode("Your Longitude is " + pos.coords.longitude)
      val br = document.createElement("br")
      parNode.appendChild(latitudeNode)
      parNode.appendChild(br)
      parNode.appendChild(longitudeNode)
      document.body.appendChild(parNode)
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

  def main(args: Array[String]): Unit = {

    val opts = locationOpts()
    window.navigator.geolocation.getCurrentPosition(
      {pos: dom.Position => locateSuccess(pos)}, 
      {err: PositionError =>},
      opts)
  }


  

}
