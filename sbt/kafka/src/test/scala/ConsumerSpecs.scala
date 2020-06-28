// https://dzone.com/articles/hands-on-apache-kafka-with-scala
// https://dzone.com/articles/putting-bdd-in-practice-using-scala

class ConsumerSpecs extends FeatureSpec with GivenWhenThen 
{

feature("Consumer Reads From Topic")
    {

    scenario("The consumer topic has not been set")
        {
            Given(s""" A default created consumer""")

            When(s""" No topic has been pointed towards""")

            And(s""" The consumer is ordered to start""")

            Then(s""" An error should occur""")
        }

    scenario("The Consumer Has Not Been Pointed Towards Broker")
        {
            Given(s""" A default created consumer""")

            When(s""" No broker address is given""")

            And(s""" The consumer is ordered to start""")

            Then(s""" An error should occur""")
        }

    scenario("The Consumer Poll Frequency Has Not Been Set")
        {
            Given(s""" A consumer is setup with valid broker and topic""")

            When(s""" The user does not provide a poll frequency""")

            And(s""" The consumer is ordered to start""")

            Then(s""" The consumer should run with a default poll""")
        }





    }

}