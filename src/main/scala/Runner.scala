

object Runner extends App{
//  println(enumeration.Constants.testString)


//  println(collect.ExampleLists.testList1(1))
//  println("==============")
//  (collect.ExampleLists.testList1 :+ "z").foreach(i=>println(i))
//  println("==============")
//  (collect.ExampleLists.testList1 ::: collect.ExampleLists.testList2).foreach(i => println(i))

//  val arr = collect.ExampleArrays.testArray1
//  println(arr(2))
//  arr.map(i => i*2).foreach(i=>println(i))
//  println(arr sameElements collect.ExampleArrays.testArray2)
//  println(arr.reduceLeft(_ + _))
//  println(arr.foldLeft(5)(_ + _))

  //  val vect = collect.ExampleVector.testVector1
//  vect updated(1,5)
//  println(vect)
//  0 +: vect
//  println(vect)
//  collect.ExampleVector.testVector2.sorted.foreach(i=>println(i))

//  val arrayBuff = collect.ExampleArrays.testArrayBuffer
//  arrayBuff += 1
//  arrayBuff += 5
//  arrayBuff.foreach(i=>println(i))

//val set1 = collect.ExampleSet.testSet1
//  val set2 = collect.ExampleSet.testSet2
//  println(set1 contains 2)
//  println(set1)
//  println(set2)
//  println(set1 ++ set2)
//  println(set1 -- set2)
//  println(set1 & set2)
//  println(set1 &~ set2)

//  val map1 = collect.ExampleMap.testMap
//  println(map1(1))
//  println(map1 contains 2)
//  println(map1.keys)
//  println((map1 + (3 -> "c")).keys)

  val fibs = collect.ExampleStream.fibs
  fibs take 5 foreach println
  println("======")
  fibs take 10 foreach println

}
