package string

fun numJewelsInStones(jewels: String, stones: String): Int {
    var count = 0
    val set = hashSetOf<Char>()

    for(jewel in jewels){
        set.add(jewel)
    }

    for(ch in stones){
        if(set.contains(ch)){
            count++
        }
    }
    return count
}
fun main(){
    val result = numJewelsInStones("aA", "aAAbbbb")
    println(result)
}