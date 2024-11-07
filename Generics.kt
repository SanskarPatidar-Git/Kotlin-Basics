fun main(){

    //For Int
    var intContainer = Container(100)
    intContainer.print()

    //For all used as Generic
    var strContainer = GenericContainer<String>("Kotlin")
    var doubleContainer = GenericContainer(400.89)
    var boolContainer = GenericContainer(true)

    strContainer.print()
    doubleContainer.print()
    boolContainer.print()

    genericFunction("Android")
    genericFunction(200)
}


/*
This Container only works when data is of Int type.
What if I want to store for String , Double etc I need to write same code again just type is diff.
So instead of it we use generics which can apply on any Object
 */
class Container(var data: Int) {
    fun set(data:Int){
        this.data = data
    }
    fun get() = this.data
    fun print() = println("Data: $data")
}

//Generics in class<>
class GenericContainer<T>(var data: T) {
    fun set(data:T){
        this.data = data
    }
    fun get() = this.data
    fun print() = println("Data: $data")
}

//Generics as function
fun <T> genericFunction(data: T){
    println(data)
}
