
/*
Kotlin Constructors are of two types Primary and Secondary
class Test() -> primary
using val or var in constructor are objects associated with that class if you are
creating without it they will be treated as local var and cannot access in class.
 */
fun main(){

    //Creating object
    var emp = Employee("Mahesh",24,32500.0,"Pune")
    emp.printEmpDetails()
    println("getEmpName()-> ${emp.getEmpName()}")

    //Access properties of object
    emp.name = "Ramesh"
    emp.printEmpDetails()
    println("City-> ${emp.city}")


    var shape = Shape("Circle",550.9)
    shape.printShapeDetails()
}


//Using Primary Constructor
class Employee(var name: String , var age: Int , var salary: Double , city: String /* local variable*/) {

    //Explicitly initialize object with local variable
    var city = city

    //At the time of object creating init blocks are called. Multiple init block executed in sequence.
    init {
        println("This is first initialization block")
    }
    init {
        println("This is Second initialization block")
    }

    fun printEmpDetails(){
           println("Name: $name \nAge: $age \nSalary: $salary ")
    }

    fun getEmpName() : String{
        return name
    }
}

//Using Secondary Constructor
/*
If you are using secondary constructor then it is mandatory to call primary constructor.
In this example we are taking two objects from user and rest of two are same for all object
The values which are getting through secondary constructor are given to Primary for initialization.
 */
class Shape(var shape: String , var area: Double , var color: String , var radius: Int){

    //Secondary Constructor
    constructor(shape: String , area: Double):
            this(shape,area,"Red",2)

    fun printShapeDetails(){
        println("Shape: $shape , Area: $area , Color: $color , Radius: $radius")
    }
}

//Class without constructors
class Temp {
    fun printHello(){
        println("Hello!")
    }
}