//kotlinc AddBinary.kt -include-runtime -d AddBinary.jar && java -jar AddBinary.jar

fun main() {
    println(addBinary("11","1"))
}

fun addBinary(a: String, b: String): String {

    var carry = 0
    var index = 0
    var resultString = StringBuilder()

    while(true) {

        if((a.length -1) - index < 0 && (b.length -1) - index < 0 && carry ==) break
        val fistChar = if((a.length -1) - index >= 0) a[(a.length -1) - index].digitToInt() else 0
        val secondChar = if((b.length -1) - index >= 0) b[(b.length -1) - index].digitToInt() else 0

        index++

        if(fistChar == 0 && secondChar == 0) {
            val sum = 0 + carry
            carry = 0
            resultString.insert(0, "$sum")
            continue
        }
        if(fistChar == 1 && secondChar == 1 && carry > 0) {
            resultString.insert(0, "1")
            continue
        }
        if(fistChar == 1 && secondChar == 1 && carry == 0) {
            carry++
            resultString.insert(0, "0")
            continue
        }
        if(fistChar == 1 || secondChar == 1) {
            val sum = 1 - carry
            carry = carry
            resultString.insert(0, "$sum")
            continue
        }
    }

    return resultString.toString()
}
