// https://dzone.com/articles/hands-on-apache-kafka-with-scala
// https://dzone.com/articles/putting-bdd-in-practice-using-scala

import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen

class ConsumerSpecs extends FunSpec with GivenWhenThen
{
    {
        describe("A Kafka Consumer")
        {
            it("Should throw an error")
            {
                Given("The user has not provided a topic")
            }
        }

    }
}