import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

class Producer (cfg : KafkaConfig, source : ProducerSource){

  def sendMessages(producerSource: ProducerSource): Unit = {
    while (true) {
      // fetch from queue
      val activeQueue = producerSource.process()
      val message = activeQueue.dequeue()

      val record = new ProducerRecord[String, String](cfg.topic, "1", message)

      producer.send(record)

    }
    producer.close()
  }

    val kafkaProducerConfig: Properties = cfg.createProducerConfiguration(cfg.topic)

    val producer = new KafkaProducer[String, String](kafkaProducerConfig)

    sendMessages(source)

}

object Producer extends App {

  val kafkaConfig = new KafkaConfig()
  kafkaConfig.brokerPort = args(0)
  kafkaConfig.topic = args(1)

  if (kafkaConfig.brokerPort.isEmpty){
    System.exit(-1)
  }

  val prodSource = ProducerSource.apply(args(2))
  val producer = new Producer(kafkaConfig, prodSource)

}

//TODO add logging framework