package collect
object ExampleStream {
  lazy val fibs: Stream[BigInt] =
    BigInt(0) #::
      BigInt(1) #::
      fibs.zip(fibs.tail).map(n => {
        println("Evaluating: %s -> %s".format(n._1, n._2))
        n._1 + n._2
      })
}
