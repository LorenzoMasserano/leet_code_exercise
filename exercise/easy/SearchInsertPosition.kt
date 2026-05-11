//kotlinc SearchInsertPosition.kt -include-runtime -d SearchInsertPosition.jar && java -jar SearchInsertPosition.jar

fun main() {
    println(searchInsert(intArrayOf(1,3,5,6), 5))
    println(searchInsert(intArrayOf(1,3,5,6), 2))
}

fun searchInsert(nums: IntArray, target: Int): Int {

    for(index in nums.indices) {
        val currentNumb = nums[index]
        if(nums[index] == target) return index
        if (target < nums[index]) {
            return index -1
        }
    }

    return nums.size
}