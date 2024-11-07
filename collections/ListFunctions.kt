
fun main(){
    filter()
    map()
    forEach()
}

/*
Filter the data of list and return new list.
Lambda expression is used
 */
fun filter(){
    var list = listOf(1,2,3,4,5)
    var list2 = listOf("Java","Kotlin","Android")

    //Filter list of even numbers
    var evenList = list.filter { x -> x % 2 == 0 }
    println(evenList)

    //Filter the list which has length > 4
    var longStr = list2.filter { data -> data.length > 4 }
    println(longStr)

    /*
    As Filter takes one arg so it can be replace by 'it' which points to data.
     */
    var list3 = list2.filter { it.length > 6 }
    println(list3)
}

//Convert the type
fun map(){
    var userList = listOf(
        User(1,"Kotlin",10),
        User(2,"Java",9),
        User(3,"Python",7),
        User(4,"Android",9)
    )

    //Map this User to mapUser -> A class which required less data from original list
    var mapUsers = userList.map {
        MapUser(it.id , it.name)
    }
    println(mapUsers)
}

data class MapUser(var id: Int , var name : String)
data class User(var id: Int , var name : String , var grade : Int)


//For each loop
fun forEach(){
    var list = listOf("Java","Kotlin","Android")
    list.forEach{
        data -> println(data)
    }

    //using it
    list.forEach{ println(it) }
}

