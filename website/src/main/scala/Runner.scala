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
      val latitude = pos.coords.latitude
      val longitude = pos.coords.longitude
      println("Latitude is: " + latitude)
      println("Longitude is " + longitude)}, 
      {err: PositionError =>
        println(err.code)
        println(err.message)}
        ,opts)
  }


  

}
