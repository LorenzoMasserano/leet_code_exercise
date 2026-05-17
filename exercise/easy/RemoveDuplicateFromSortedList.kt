// kotlinc RemoveDuplicateFromSortedList.kt -include-runtime -d RemoveDuplicateFromSortedList.jar && java -jar RemoveDuplicateFromSortedList.jar

fun main() {}

fun deleteDuplicates(head: ListNode?): ListNode? {

  var currentNode: ListNode? = head
  val firstNode: ListNode? = currentNode

  while(currentNode?.next != null) {
    
    if(currentNode.next?.`val` == currentNode.`val`) {
      
      currentNode.next = currentNode.next?.next
    } else {
      currentNode = currentNode.next
    }
  }

  return firstNode
}

data class ListNode(var `val`: Int, var next: ListNode?)
