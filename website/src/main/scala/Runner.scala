import org.scalajs.dom
import org.scalajs.dom.{window, Coordinates, PositionError, PositionOptions}
import dom.document
import scalatags.JsDom.all._
import scala.scalajs.js

object Runner {

  def main(args: Array[String]): Unit = {






     val opts = js.Object().asInstanceOf[PositionOptions]
     opts.timeout = 50000
     opts.enableHighAccuracy = true

    window.navigator.geolocation.getCurrentPosition(
      {pos: dom.Position => 
      val longitude = pos.coords.longitude
      val parNode = document.createElement("p")
      val latitudeNode = document.createTextNode("Your Latitude is " + pos.coords.latitude)
      val longitudeNode = document.createTextNode("Your Longitude is " + pos.coords.longitude)
      val br = document.createElement("br")
      parNode.appendChild(latitudeNode)
      parNode.appendChild(br)
      parNode.appendChild(longitudeNode)
      document.body.appendChild(parNode)}, 
      {err: PositionError =>
        println(err.code)
        println(err.message)}
        ,opts)
  }


  

}
