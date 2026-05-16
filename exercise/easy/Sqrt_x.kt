// kotlinc Sqrt_x.kt -include-runtime -d Sqrt_x.jar && java -jar Sqrt_x.jar

fun main() {

  println(mySqrt(8))
}

fun mySqrt(x: Int): Int {

  if(x == 0) return 0
  var r = x.toLong()

  while (r * r > x) {
    r = (r + x / r) / 2
  }

  return r.toInt()
}
