//kotlinc FindTheIndexOfTheFirstOccurrenceInString.kt -include-runtime -d FindTheIndexOfTheFirstOccurrenceInString.jar && java -jar FindTheIndexOfTheFirstOccurrenceInString.jar

fun main(){
    println(strStr("mississippi", "issipi"))
}

//My solution
fun strStr(haystack: String, needle: String): Int {

    var currentNeedleCharIndex = 0
    var indexOfFistChar = -1

    if(haystack.length < needle.length) return -1

    for(index in haystack.indices) {

        val haystackChar = haystack[index]
        val needleChar = needle[currentNeedleCharIndex]

        var tempIndex = index

        if(haystackChar == needleChar) {
            if(haystack.length < index + needle.length) return -1
            indexOfFistChar = index

            while (true) {
                currentNeedleCharIndex++
                tempIndex++
                if (needle.length == currentNeedleCharIndex || haystack.length == tempIndex) {
                    return indexOfFistChar
                }
                if (haystack[tempIndex] != needle[currentNeedleCharIndex]) {
                    indexOfFistChar = -1
                    currentNeedleCharIndex = 0
                    break
                }
            }
        }
    }

    return indexOfFistChar
}
