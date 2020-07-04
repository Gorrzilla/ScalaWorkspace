import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen

class ProducerSpecs extends FunSpec with GivenWhenThen{
  {
    {
      describe("A Kafka Configuration File") {

        it("Should have null defaults") {

          Given("No additional parameters are provided")
          val cfg = new KafkaConfig()

          When("It is originally created")
          assert(cfg.topic.isEmpty)
          assert(cfg.brokerPort.isEmpty)
        }

        it("Should allow users to specify a topic"){

          Given("The user provides the topic")
          val topic = "HelloWorld"

          When("After it has been created")
          val cfg = new KafkaConfig()
          cfg.topic = topic
          assert(cfg.topic == topic)

        }

        it("Should allow users to specify a broker port"){

          Given("The user provides the port")
          val port = "192.168.1.1"

          When("After it has been created")
          val cfg = new KafkaConfig()
          cfg.brokerPort = port
          assert(cfg.brokerPort == port)

        }

        it("Should only allow valid ip addresses to be set"){

          Given("The user provides the port")
          val port = "256.8.7.28"

          When("After it has been created")
          val cfg = new KafkaConfig()
          cfg.brokerPort = port

          Then("It should reject the provided address")
          assert(cfg.brokerPort.isEmpty)

        }      }

    }


  }
}
