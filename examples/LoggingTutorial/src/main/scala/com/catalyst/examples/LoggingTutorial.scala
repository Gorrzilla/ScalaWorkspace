package com.catalyst.examples;

import org.apache.logging.log4j.scala.{Logger, Logging}
import org.apache.logging.log4j.Level

object LoggingTutorial extends Logging {

    def main(args : Array[String]) {
    logger.fatal("HelloWorld")
  }
}
