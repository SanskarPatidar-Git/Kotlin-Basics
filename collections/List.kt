
/*
Two types of list
    - Mutable list (Data and size will be modified)
    - Immutable list (Data and size cannot be changed)

Difference between Immutable list and array is we can change the data of array
but not of immutable list.
Immutable list if fully constant
 */
fun main(){
    mutableList()
    imMutableList()
}

fun mutableList(){
    var list = mutableListOf<Int>(1,2)

    list.add(10) //add
    list.add(20)

    println(list)
    println(list.get(0)) //get

    list.removeAt(0)  //remove at position
    list.remove(20) //remove object from list

    println(list)

    list.add(0,10) //add at a specific position
    println(list)

    list.set(0,50) //change data at specific position
    println(list)

    println(list.contains(10))

    //Add another list into a list
    list.addAll(mutableListOf(80,90,100))
    println(list)
}

/*
Cannot change or modified the list.
 */
fun imMutableList(){
    println("===== IMMUTABLE LIST =====")
    var list = listOf(1,2,3)
    println(list)
}
