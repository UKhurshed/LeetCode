package array

fun finalValueAfterOperations(operations: Array<String>): Int {
    var initial = 0

    for (element in operations){
        when(element){
            "--X" ->  {
                --initial
            }
            "X++" -> {
                initial++
            }

            "++X" -> {
                ++initial
            }
            "X--" -> {
                initial--
            }
        }
    }

    return initial
}

fun main(){
    val operations = arrayOf("--X","X++","X++")
    val result = finalValueAfterOperations(operations)
    print(result)
}