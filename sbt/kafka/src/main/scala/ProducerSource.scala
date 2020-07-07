import java.io.File

abstract class ProducerSource {

  def process(): Unit

  object ProducerSource {

  private class Console extends ProducerSource {
    override def process{}
  }

    private class TextBased extends ProducerSource {
      override def process{}
    }

    private class BinaryBased extends ProducerSource {
      override def process{}
    }

    //Factory method
    def apply(arg: String): ProducerSource = {
      val isFile  = new File(arg).exists()
      val isValidIP = KafkaConfig.validateAddress(arg)
      if (isFile){

      }
      else if (isValidIP){

      }
        {

        }
      // If is string then select the appropriate class based on extension

      // If not string then check if IP provided

      // Otherwise exit!


    }




  }
}
