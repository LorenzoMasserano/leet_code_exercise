//kotlinc LenghtOfLastWord.kt -include-runtime -d LenghtOfLastWord.jar && java -jar LenghtOfLastWord.jar

fun main() {

    println(lengthOfLastWord("Hello World"))
}

fun lengthOfLastWord(s: String): Int {

    var wordDimen = 0
    
    for(index in s.length -1 downTo 0){

        if(s[index] != ' ') {
            wordDimen++
        } else {
            if(wordDimen != 0) return wordDimen
        }
    }

    return wordDimen
}