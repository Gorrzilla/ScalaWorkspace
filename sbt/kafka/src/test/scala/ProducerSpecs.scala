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
      }

    }
  }
}
