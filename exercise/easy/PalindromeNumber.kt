//kotlinc PalindromeNumber.kt -include-runtime -d PalindromeNumber.jar && java -jar PalindromeNumber.jar

fun main(){

   println(isPalindrome(123))
}

fun isPalindrome(x: Int): Boolean {

    if(x < 0) return false
    if(x < 10) return true
    var number = x
    var result = 0
    var multiplier = 10
    while(number > 0) {
        val modulo = number % 10
        println("modulo $modulo")
        result = (result * multiplier) + modulo
        number = number / 10
    }

    println("final result $result")

    return x == result
}