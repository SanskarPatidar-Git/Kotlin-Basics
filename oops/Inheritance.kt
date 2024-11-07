
/*
For inheritance make a parent class open.
For overriding make properties and behaviour of parent class open.
Any is the super class of all classes like Object class in java.
 */
fun main(){
    var child = Child("Mahesh",44)
    println(child.getParentChildName())
    child.printName()

    var vehicle = Vehicle()
    vehicle.name = "BMW"
    vehicle.color = "blue"
}

open class Parent(var parentAge : Int){
    var parentName = "Rakesh"

    open fun printName(){
        println("Name is $parentName")
    }
}

//Passing data to parent constructor
class Child(var childName: String , age:Int) : Parent(age) {

    //Access properties of parent class
    fun getParentChildName() : String {
        return "Parent: $parentName and Child: $childName"
    }

    //Override properties and behaviour of parent class
    override fun printName() {
        println("Name is $childName")

        //If you also want to call the method of parent class use super keyword.
        super.printName()
    }

}


//Getter and Setters
/*
var name: String = "Mercedes"
        set(value) {
            field = value
        }
        get() = field

This are default getter setter used by kotlin.
You can explicitly add this for custom logic.
 */
class Vehicle{
     var name: String = "Mercedes"
        set(value) {
            println("name set property called")
            field = value
        }
        get() = field

     var color: String = "black"
        set(value) {
            println("color set property called")
            field = value
        }
        get() = field


    override fun toString(): String {
        return "Vehicle(name='$name', color='$color')"
    }


}