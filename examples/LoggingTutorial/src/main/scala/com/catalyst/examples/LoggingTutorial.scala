package com.catalyst.examples;

import org.apache.logging.log4j.scala.{Logger, Logging}
import org.apache.logging.log4j.Level

object LoggingTutorial extends Logging {

    def main(args : Array[String]) {
    logWithLevel(Level.TRACE)
    logWithLevel(Level.DEBUG)
    logWithLevel(Level.INFO)
    logWithLevel(Level.WARN)
    logWithLevel(Level.ERROR)
    logWithLevel(Level.FATAL)
  }

  def logWithLevel(level: Level): Unit = {
    logger(level, "Testing different log levels")
  }
}
