class KafkaConfig() {

  private var _brokerPort: String = ""
  private var _topic: String = ""

  //Getter
  def brokerPort = _brokerPort

  //Getter
  def topic = _topic

  //Setter
  def brokerPort_= (providedPort: String) = {
    _brokerPort = providedPort
  }

  //Setter
  def topic_=(providedTopics: String)={
    _topic = providedTopics
  }

}