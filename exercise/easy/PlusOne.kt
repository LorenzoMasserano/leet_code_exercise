//kotlinc PlusOne.kt -include-runtime -d PlusOne.jar && java -jar PlusOne.jar

fun main(){

    println(plusOne(digits = intArrayOf(9,9)).toList())

}

fun plusOne(digits: IntArray): IntArray {

    if(digits[digits.size -1] != 9) {
            digits[digits.size -1]++
            return digits
    } else {
        if(digits.size > 1 && digits[digits.size -2] == 9){
            println("ciao")
            digits[digits.size -1] = 1
            val digitsPlus = digits + intArrayOf(0)
            for(index in digitsPlus.size -3 downTo 0){
                if(digitsPlus[index] == 9){
                        digitsPlus[index] = 1   
                }
            }
            return digitsPlus
        } else if(digits.size > 1) {
            digits[digits.size -1] = 0
            digits[digits.size -2]++
            return digits
        } else {
            val digitsPlus = digits + intArrayOf(0)
            digitsPlus[digitsPlus.size -2] = 1
            return digitsPlus
        }
    }
    return digits
}