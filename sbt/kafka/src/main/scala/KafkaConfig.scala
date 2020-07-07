import java.util.Properties

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.{StringDeserializer, StringSerializer}

class KafkaConfig() {

  private var _brokerPort: String = ""
  private var _topic: String = ""
  private var _groupID: Int = null

  //Getter
  def brokerPort: String = _brokerPort

  //Getter
  def topic: String = _topic

  //Getter
  def groupID: Int = _groupID

  //Setter
  def brokerPort_= (providedPort: String): Unit = {
    val isValid = validateAddress(providedPort)
      if (isValid) _brokerPort = providedPort
  }

  //Setter
  def topic_=(providedTopics: String): Unit ={
    _topic = providedTopics
  }

  //Setter
  def groupID_=(providedID: Int): Unit ={
    _groupID = providedID
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

  def createProducerConfiguration(brokers: String): Properties = {
    val props = new Properties()
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers)
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer].getCanonicalName)
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer].getCanonicalName)
    props
  }

  def createConsumerConfiguration(brokers: String, groupID: Int): Properties = {
      val props = new Properties()
      props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers)
      props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer].getCanonicalName)
      props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, classOf[StringDeserializer].getCanonicalName)
      props.put(ConsumerConfig.GROUP_ID_CONFIG, groupID)
      props
  }



}