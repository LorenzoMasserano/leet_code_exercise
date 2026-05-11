//kotlinc LongestCommonPrefix.kt -include-runtime -d LongestCommonPrefix.jar && java -jar LongestCommonPrefix.jar
fun main(){

    println(longestCommonPrefix(arrayOf("flower","flow","floight")))
}

fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = ""

    if (strs.size == 1) return strs[0]

    val firstWord = strs[0]
    val secondWord = strs[1]

    for(index in firstWord.indices) {
        if (index > secondWord.length - 1) break
        val firstWordChar = firstWord[index]
        val secondWordChar = secondWord[index]

        if(firstWordChar == secondWordChar) {
            prefix += firstWordChar
        } else {
            break
        }
    }

    outerLoop@ for(index in 2 until strs.size) {

        if (prefix.isBlank()) return ""
        val currentWord = strs[index]
        if (currentWord.isEmpty()) return ""
        if (currentWord.length < prefix.length) {
            prefix = prefix.dropLast(prefix.length - currentWord.length)
        }

        while(prefix.isNotEmpty()) {
            val stringSection = currentWord.substring(0, prefix.length)
            if(prefix == stringSection) {
                continue@outerLoop
            } else {
                prefix = prefix.dropLast(1)
            }
        }
    }

    return prefix
}