fun main(){
    mutableMap()
    imMutableMap()
}

fun mutableMap(){
    var map = mutableMapOf<Int,String>()
    map.put(1,"Java")
    map.put(2,"Kotlin")
    map.put(3,"Android")

    println(map)

    map.remove(1) //remove using key
    println(map)

    println(map.get(2)) //get value by key if key not present it will return null

    map.put(2,"Firebase") //if key is already present it will update value
    println(map)

    //iterate
    for ((key,value ) in map)
        println("Key: $key - Value: $value")

    println(map.containsValue("Firebase")) //map contains value

    //Set and get with array type
    map[0] = "Java"
    println(map[0])
}

/*
Cannot modify map
Initialization way -> (1 to "Java") ($key to $value)
 */
fun imMutableMap(){
    println("====== IMMUTABLE MAP =======")
    var map = mapOf<Int,String>(1 to "Java" , 2 to "Kotlin")
    println(map)
}