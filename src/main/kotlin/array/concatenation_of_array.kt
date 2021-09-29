fun getConcatenation(numbers: IntArray): IntArray {
    val ans = IntArray(numbers.size*2) { 0 }
    val count = numbers.size

    for (i in numbers.indices){
        ans[i] = numbers[i]
        ans[i + count] = numbers[i]
    }
    return ans
}

fun main(){
    val numbers = intArrayOf(1,2,1)
    val result = getConcatenation(numbers)
    for(k in result){
        print("$k ")
    }
}