package string

fun interpret(command: String): String {
    var text = ""

    for(ch in command.indices){
        if(command[ch] == '('){
            if(command[ch + 1] == ')'){
                text += "o"
            }
        }else if(command[ch] != ')'){
            text += command[ch]
        }
    }

    return text
}

fun main(){
    val command = "G()()()()(al)"
    print(interpret(command))
}