import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


def sleep(time: Long): Unit = Thread.sleep(time)

val function = Future {
  sleep(5000)
  35+53
}

// this is blocking the thread until the computation is completed
val result = Await.result(function, 10 seconds)
println(result)
sleep(15000)