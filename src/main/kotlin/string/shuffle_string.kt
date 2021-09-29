package string

fun restoreString(s: String, indices: IntArray): String {
    var text = ""
    val hashMap = hashMapOf<Int,Char>()

    for(index in indices.indices){
        hashMap[indices[index]] = s[index]
    }

    for(key in hashMap){
        text += key.value
    }
    return text
}

fun main(){
    val result = restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
    print(result)
}