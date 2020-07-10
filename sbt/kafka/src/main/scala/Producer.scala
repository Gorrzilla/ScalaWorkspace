import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

class Producer (cfg : KafkaConfig){
  val kafkaProducerConfig: Properties = cfg.createProducerConfiguration(cfg.topic)

  val producer = new KafkaProducer[String, String](kafkaProducerConfig)

  def sendMessages(producerSource: ProducerSource): Unit = {
    producerSource.process()
  }

}

object Producer extends App {

  val kafkaConfig = new KafkaConfig()
  kafkaConfig.brokerPort = args(0)
  kafkaConfig.topic = args(1)

  if (kafkaConfig.brokerPort.isEmpty){
    System.exit(-1)
  }

  val prodSource = ProducerSource.apply(args(2))
  val producer = new Producer(kafkaConfig)

  producer.sendMessages(prodSource)
}

//TODO add logging framework