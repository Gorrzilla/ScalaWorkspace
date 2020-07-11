import java.util.Properties

import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}

import scala.jdk.CollectionConverters._

class Consumer(cfg : KafkaConfig) {

  def receiveMessages(): Unit = {
    while (true) {
      val records: ConsumerRecords[String, String] = consumer.poll(1000)
      records.asScala.foreach(record => println(s"Received message: $record"))
    }
  }

  val kafkaProducerConfig: Properties = cfg.createConsumerConfiguration(cfg.topic, cfg.groupID)

  val consumer = new KafkaConsumer[String, String](kafkaProducerConfig)
  consumer.subscribe(List(cfg.topic).asJava)
  receiveMessages()
}

object Consumer extends App {

  val kafkaConfig = new KafkaConfig()
  kafkaConfig.brokerPort = args(0)
  kafkaConfig.topic = args(1)
  kafkaConfig.groupID = args(2).toInt

  val consumer = new Consumer(kafkaConfig)


}