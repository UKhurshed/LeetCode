package array

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    var sum = 0

    for(i in accounts){
        for(element in i){
            sum+=element
        }
        if(max < sum){
            max = sum
        }
        sum = 0
    }
    return max
}

fun main(){
    val accounts = arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))
    val result = maximumWealth(accounts)
    print(result)
}