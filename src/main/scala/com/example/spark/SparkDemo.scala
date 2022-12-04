package com.example.spark

import org.apache.spark.sql.SparkSession
import org.slf4j.{Logger, LoggerFactory}

object SparkDemo {
  val logger = LoggerFactory.getLogger("SparkDemo")

  def main(args: Array[String]): Unit = {
    logger.info("Hello................")
    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate();

  }


}
