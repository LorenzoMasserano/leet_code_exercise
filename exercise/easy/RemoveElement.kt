//kotlinc RemoveElement.kt -include-runtime -d RemoveElement.jar && java -jar RemoveElement.jar

fun main() {

    println("final result ${removeElement(intArrayOf(0,4,4,0,4,4,4,0,2), 4)}")
}

//my solution
fun removeElement(nums: IntArray, `val`: Int): Int {

    var numRemoved = 0
    var validNumber = 0

    for (index in nums.indices) {
        println("index $index")

        if(numRemoved > 0 && index > (nums.size - 1) - numRemoved){
            return validNumber
        }

        if (nums[index] == `val`) {
            println("si ${nums.size - 1}")
            if (index == nums.size - 1) {
                return validNumber
            }
            val numberToRemove = nums[index]
            while (true) {
                println(numRemoved)
                println(nums[(nums.size - 1) - numRemoved])
                if ((nums.size - 1) - numRemoved == index) return validNumber
                if (nums[(nums.size - 1) - numRemoved] == `val`) numRemoved++ else break
            }

            nums[index] = nums[(nums.size - 1) - numRemoved]
            nums[(nums.size - 1) - numRemoved] = numberToRemove
            println(nums.toList())
            numRemoved++
            validNumber++
        } else {
            validNumber++
        }
    }

    return nums.size
}

//pro solution
//fun removeElement(nums: IntArray, `val`: Int): Int {
//    var validNumbers = 0
//
//    for(index in nums.indices){
//        if(nums[index] != `val`){
//            nums[validNumbers] == nums[index]
//            validNumbers++
//        }
//    }
//
//    return validNumbers
//}