fun main(){
    //here we call print two times but init executed only once when object is created
    SingleObject.print()
    SingleObject.print()

    println(SingleObject.id)
    useAsExpression()
}

/*
We can create an object consist of methods and behaviours without creating class.
The object should be created only once and shared everywhere it will be used.
Singleton object
No constructors because only single object will be created
init block is used once when the object is created for initial work
Example -> Single object for database operation

Work classes and interface
open class Example{

}
object SingleObject : k(){}
 */
object SingleObject {

    var id : Int = 100

    init {
       println("init.....")
    }

    fun print(){
        println("in single object")
    }
}

/*
using object as expression
replacement of anonymous class in java
 */

open class Test {
    open fun test(){
        println("text from Test")
    }
}

//Anonymous class as child class -
fun useAsExpression(){

    //Inheritance with object
    var testObj = object : Test(){
        override fun test() {
            super.test()
            println("useAsExpression anonymous")
        }
    }

    //Object as expression
    var test = object {
        fun expr(){
            println("object as expression")
        }
    }

    testObj.test()
    test.expr()
}