
fun main(){

   //Create object of outer
    var outer = Outer()
    println(outer.outerM())

    //Create object of inner
    /*
    If you are making class as inner you first need to create object of outer.
    Below code will work when nested class is not mark as inner.
     */
    //    var inner = Outer.Inner()
    //    inner.innerM()

    /*
    If you want to access objects of outer class into inner class you need to make
    Nested class as inner.
    Creation of object also change first you need to create obj of outer to access inner
     */
    var innerObj = Outer().Inner()
    innerObj.innerM()
}

//Nested class
class Outer {
    var i = 100
    fun outerM(){
        println("In Outer.....")
    }

    inner class Inner {
        fun innerM(){
            println("In Inner..... $i") //accessing obj of outer mark as inner
        }
    }
}