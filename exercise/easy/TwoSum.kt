//kotlinc TwoSum.kt -include-runtime -d TwoSum.jar && java -jar TwoSum.jar

fun main() {

    println(twoSum(intArrayOf(2,7,11,15,2,7,11,15,2,7,11,15,2,7,11,15), 26).contentToString())

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val seenNumbers = HashMap<Int, Int>()

    for(index in nums.indices) {
        val currentNum = nums[index]
        val complement = target - currentNum

        if(seenNumbers.contains(complement)) {
            return intArrayOf(seenNumbers[complement]!!, index)
        }

        seenNumbers[currentNum] = index
    }

    return intArrayOf()
}