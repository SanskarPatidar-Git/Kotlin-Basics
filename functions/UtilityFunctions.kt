
// apply , let , with.
fun main(){
    var user = User("Sanskar",12)
    var user2 : User? = null

    //Don't need to use like user.name = ""
    user.apply {
        println("in apply...")
        name = "Mahesh"
    }
    println(user)


    //It will perform operation only when user2 is not null
    user2?.let {
        println("in let...")
        it.name = "Sanskar"
    }
    println(user2)


    //Direct refer to object
    with(user){
        println("in with...")
        name = "Sanskar"
    }
    println(user)
}

data class User(var name: String , var age: Int) {

    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }
}
