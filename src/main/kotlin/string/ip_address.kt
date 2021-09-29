package string

import kotlin.math.ln

fun replaceString(str: String): String{
    var txt = ""
    val template = "[.]"

    for(ch in str)
    {
        if(ch == '.'){
            txt += template
        }else{
            txt += ch
        }
    }

    return txt
}

fun main(){
    val text = "192.168.88.43"
    val result = replaceString(text)
    print(result)
}