fun main(){
    //Companion.Comp.display() //Without using companion
    Companion.display()

    var comp  = Companion.get()
    comp.print()
}

/*
using object declaration in class
and that object is shared among all act as a common then make it companion
only one companion object present in a single class

Basically companion are used for a factory pattern.

@JvmStatic-
As static methods are not allowed in kotlin but we can make it as static using JvmStatic annotation.
 */
class Companion private constructor(){

    fun print(){
        println("in Companion")
    }

    companion object Comp {
        fun display(){
            println("display...")
        }

        @JvmStatic
        fun get() : Companion{
            return Companion()
        }
    }
}