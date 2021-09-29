package string

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0
    val listOfType = mutableListOf<String>()
    val listOfColor = mutableListOf<String>()
    val listOfName = mutableListOf<String>()
    val typeMap = hashMapOf<String, List<String>>()
    val colorMap = hashMapOf<String, List<String>>()
    val nameMap = hashMapOf<String, List<String>>()

    for(item in items){
        listOfType.add(item[0])
        listOfColor.add(item[1])
        listOfName.add(item[2])
    }

    typeMap["type"] = listOfType
    colorMap["color"] = listOfColor
    nameMap["name"] = listOfName

    when(ruleKey){
        "color" -> {
            colorMap.values.forEach {
                for(i in it){
                    if(i == ruleValue){
                        count++
                    }
                }
            }
        }
        "type" -> {
            typeMap.values.forEach {
                for(i in it){
                    if(i == ruleValue){
                        count++
                    }
                }
            }
        }
        "name" -> {
            nameMap.values.forEach {
                for(i in it){
                    if(i == ruleValue){
                        count++
                    }
                }
            }
        }
    }
    return count
}


fun main(){
    val result = countMatches(listOf(listOf("phone","blue","pixel"), listOf("computer","silver","phone"), listOf("phone","gold","iphone")), ruleKey = "type", ruleValue = "phone")
    println(result)
}