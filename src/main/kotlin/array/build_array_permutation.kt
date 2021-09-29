fun buildArray(numbers: IntArray): IntArray {
    val ans = IntArray(numbers.size) { 0 }

    for (i in numbers.indices){
        ans[i] = numbers[numbers[i]]
    }
    return ans
}

fun main(){
    val numbers = intArrayOf(0,2,1,5,3,4)
    val result = buildArray(numbers)
    for(i in result){
        print("$i ")
    }
}