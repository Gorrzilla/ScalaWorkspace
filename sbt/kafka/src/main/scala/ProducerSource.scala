import java.io.File
import scala.io.StdIn
import java.nio.file.Paths

abstract class ProducerSource {
  def process(): Unit
}

  object ProducerSource {

  private class CommandLineConsole extends ProducerSource {
    override def process: Unit ={
      println("Enter message (type exit to quit)")
      var message = StdIn.readLine()

    }
  }

    private class TextBased extends ProducerSource {
      override def process{}
    }

    private class BinaryBased extends ProducerSource {
      override def process{}
    }

    private class PacketBased extends ProducerSource {
      override def process {}
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
