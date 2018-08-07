import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {
    println("hello")

    val spark = SparkSession
      .builder()
      .appName("Broadcast Test")
      .config("spark.master", "local")
      .getOrCreate()

    val sc = spark.sparkContext


  }

}
