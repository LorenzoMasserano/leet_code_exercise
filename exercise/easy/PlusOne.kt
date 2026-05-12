//kotlinc PlusOne.kt -include-runtime -d PlusOne.jar && java -jar PlusOne.jar

fun main(){

    println(plusOne(digits = intArrayOf(9,9)).toList())

}

fun plusOne(digits: IntArray): IntArray {

    for(index in digits.size -1 downTo 0){
        if(digits[index] == 9 && index != 0) {
            digits[index] = 0
        } else if (digits[index] != 9) {
            digits[index]++
            return digits
        } else {
            digits[index] = 1
            return digits + intArrayOf(0)
        }
    }

    return digits
}