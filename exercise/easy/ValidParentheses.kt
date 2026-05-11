package com.example.testandroidsecurityproject

//kotlinc ValidParentheses.kt -include-runtime -d ValidParentheses.jar && java -jar ValidParentheses.jar
fun main(){


    isValid("()")
}

fun isValid(s: String): Boolean {

    if(s.length < 2) return false
    if((s.length % 2) != 0) return false
    val openParentheses = mutableListOf<Int>()

    for(i in s) {

        when(i) {
            '(' -> openParentheses.add(0)
            '[' -> openParentheses.add(1)
            '{' -> openParentheses.add(2)
            ')' -> if (openParentheses.isNotEmpty() && openParentheses.last() == 0) openParentheses.removeAt(openParentheses.size -1) else return false
            ']' -> if(openParentheses.isNotEmpty() && openParentheses.last() == 1) openParentheses.removeAt(openParentheses.size -1) else return false
            '}' -> if(openParentheses.isNotEmpty() && openParentheses.last() == 2) openParentheses.removeAt(openParentheses.size -1) else return false
        }
    }

    return openParentheses.isEmpty()
}