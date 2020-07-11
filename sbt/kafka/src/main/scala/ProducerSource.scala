//https://alvinalexander.com/scala/factory-pattern-in-scala-design-patterns/

import java.io.File
import java.nio.file.Paths
import scala.collection.mutable.Queue

import scala.io.StdIn

abstract class ProducerSource {
  def process(): Queue[String]
}

  object ProducerSource {

  private class CommandLineConsole extends ProducerSource {
    override def process: Queue[String] = {

      var bufferQueue = Queue[String]()
      var message = StdIn.readLine()
      bufferQueue += message

    }
  }

    private class TextBased extends ProducerSource {
      override def process: Queue[String] ={ Queue[String]()}
    }

    private class BinaryBased extends ProducerSource {
      override def process : Queue[String] ={Queue[String]()}
    }

    private class PacketBased extends ProducerSource {
      override def process : Queue[String] = {Queue[String]()}
    }

    //Factory method
    def apply(arg: String): ProducerSource = {
      val isFile  = new File(arg).exists()
      val isValidIP = KafkaConfig.validateAddress(arg)

      if (isFile){
        // Get the file extension
        val extension = Paths.get(arg).getFileName.toString.split("\\.").last

        extension match {
          case "txt" => new TextBased
          case "bin" => new BinaryBased
        }

      }
      else if (isValidIP){
        new PacketBased
      }
      else
        {
          new CommandLineConsole
        }
    }
}
