//kotlinc ClimbStairs.kt -include-runtime -d ClimbStairs.jar && java -jar ClimbStairs.jar

fun main() {

  println(climbStairs(44))
}

fun climbStairs(n: Int): Int {

    if(n == 1) return 1
    if(n == 2) return 2

    var previousSolution = 2
    var previousPreviousSolution = 1
    var currentNumber = 3
    var currentSolution = 0
    
    while (currentNumber <= n) {
      currentSolution = previousSolution + previousPreviousSolution
      previousPreviousSolution = previousSolution
      previousSolution = currentSolution
      currentNumber++
    }
    
    return currentSolution
}
