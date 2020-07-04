import java.util.Arrays

class KafkaConfig() {

  private var _brokerPort: String = ""
  private var _topic: String = ""

  //Getter
  def brokerPort: String = _brokerPort

  //Getter
  def topic: String = _topic

  //Setter
  def brokerPort_= (providedPort: String): Unit = {
    val isValid = validateAddress(providedPort)
      if (isValid) _brokerPort = providedPort
  }

  //Setter
  def topic_=(providedTopics: String): Unit ={
    _topic = providedTopics
  }

  def validateAddress(providedIp: String) : Boolean = {

    var groups = providedIp.split("\\.")
    if (groups.length !=4) {
      return false
    }
    try{
      for (num <- groups){
        val numericRep = num.toInt
          if ((numericRep < 0) || (numericRep > 255)){
            return false
          }
      }
      true
    }
    catch{
      case e : NumberFormatException => false
    }
  }

}