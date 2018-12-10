import scala.concurrent.Future
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global



  def sleep(time: Long): Unit = Thread.sleep(time)

  def longRunningFunction: Future[Int] = Future {
    sleep(Random.nextInt(1000))
    1+1
  }

  longRunningFunction.onComplete {
    case Success(value) => println(s"The value we've been waiting for is: $value")
    case Failure(error) => error.printStackTrace()
  }

  println("1.....");sleep(150)
  println("2.....");sleep(150)
  println("3.....");sleep(150)
  println("4.....");sleep(150)
  sleep(10000)
