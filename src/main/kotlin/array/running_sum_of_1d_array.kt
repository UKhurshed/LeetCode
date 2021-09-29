package array

fun runningSum(numbers: IntArray): IntArray {
    for(i in 1 until numbers.size){
        numbers[i] += numbers[i - 1]
    }

    return numbers
}

fun main(){
    val numbers = intArrayOf(1,2,3,4)
    val result = runningSum(numbers)
    for(num in result){
        print("$num ")
    }
}