
/*
A class can extend only one parent class but implement multiple interface.
 */
fun main(){
    var i1 : I1 = C()
    i1.i1Method()


    var i2 : I2 = C()
    i2.i2Method()

    //Calling same overriding method of both interfaces
    i1.one()
    i2.one()

    //set and get properties of I1 interface
    i1.i1 = 100
    println(i1.i1)
}

/*
In Kotlin, you can define method body and properties also like default method in java.
cannot create object.
 */
interface I1 {
    var i1 : Int //Declaration is possible not initialization
    fun i1Method()
    fun one(){
        println("interface I1 one()")
    }
}

interface I2 {
    fun i2Method()
    fun one(){
        println("interface I2 one()")
    }
}

class C : I1 , I2 {

    //Either its properties or behaviour(methods) you need to override both.
    //You can define getter and setter explicitly.
    override var i1: Int = 0

    override fun i1Method() {
        println("i1Method()->C")
    }


    override fun i2Method() {
        println("i2Method()->C")
    }

    /*
    Overriding the method one() consisting in both interface
     */
    override fun one() {
        super<I1>.one() //Specify method calling of which interface.
    }

}
