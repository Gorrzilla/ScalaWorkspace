package com.catalyst.examples;

import org.apache.spark.SparkContext._
import org.apache.spark.{SparkConf,SparkContext}
import java.nio.File;

//Inspiration from http://knowdimension.com/en/data/create-a-spark-application-with-scala-using-maven-on-intellij/

object SimpleSpark{

def main(args : Array[String]){
    
    var filePath = args[0];
    var isFile = new File(filePath).exists();
    
    if(isFile){
        val textFile = sc.textFile(filePath);
        val df = textFile.toDF("line");
        val levelList = List("TRACE", "DEBUG", "INFO", "WARN", "ERROR", "FATAL");

        var instanceCount = 0;
        for (level <- levelList ){
            instanceCount = df.filter(col("line").like(level)).count();
            println(level + "Occurs " + instanceCount + "Times.")
        }
        
    }
    else{
        println(filePath + " Does Not Exist.")
    }
}

}
