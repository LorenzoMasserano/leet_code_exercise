package com.example.testandroidsecurityproject

//kotlinc RomanToInteger.kt -include-runtime -d RomanToInteger.jar && java -jar RomanToInteger.jar

fun main() {
    romanToInt("XIV")
}

fun romanToInt(s: String): Int {
    var previousChar: RomanValues? = null
    var result = 0
    for (index in s.lastIndex downTo 0) {
        when (s[index]) {
            RomanValues.I.romanValue -> {
                val currentType = RomanValues.I
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.V.romanValue -> {
                val currentType = RomanValues.V
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    println(currentType.numericalValue)
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.X.romanValue -> {
                val currentType = RomanValues.X
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.L.romanValue -> {
                val currentType = RomanValues.L
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.C.romanValue -> {
                val currentType = RomanValues.C
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.D.romanValue -> {
                val currentType = RomanValues.D
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }

            RomanValues.M.romanValue -> {
                val currentType = RomanValues.M
                if (previousChar == null || previousChar.numericalValue <= currentType.numericalValue) {
                    result = result + currentType.numericalValue
                    previousChar = currentType
                } else {
                    result -= currentType.numericalValue
                    previousChar = null
                }
            }
        }
    }

    println(result)
    return result
}


enum class RomanValues(val romanValue: Char, val numericalValue: Int) {
    I('I', 1),
    V('V', 5),
    X('X', 10),
    L('L', 50),
    C('C', 100),
    D('D', 500),
    M('M', 1000), ;
}