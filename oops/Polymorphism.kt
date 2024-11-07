
/*
Polymorphism - Many forms
like Vehicle can be Car , Bike etc
 */
fun main(){
    //Reference of parent class and object of child class
    var mercedes : Car = Mercedes()
    var bmw : Car = BMW()

    mercedes.start()
    mercedes.run()
    mercedes.stop()

    bmw.start()
    bmw.run()
    bmw.stop()

    //Passing object of child while reference of parent.
    callStart(mercedes)
    callStart(bmw)

    //type checking and casting
    typeChecking(mercedes)
    typeCasting(mercedes)
}

/*
Every Car has the same functionality start , run ,stop.
So Mercedes and BMW are inheriting Car.
 */
open class Car{

    open fun start(){
        println("start()-> Car")
    }

    open fun run(){
        println("run()-> Car")
    }

    open fun stop(){
        println("stop()-> Car")
    }
}

class Mercedes : Car() {
    override fun start() {
        println("start()-> Mercedes")
    }

    override fun run() {
        println("run()-> Mercedes")
    }

    override fun stop() {
        println("stop()-> Mercedes")
    }

    fun type(){
        println("Mercedes type")
    }
}

class BMW : Car(){
    override fun start() {
        println("start()-> BMW")
    }

    override fun run() {
        println("run()-> BMW")
    }


    override fun stop() {
        super.stop() //Calling parent method
        println("stop()-> BMW")
    }

    fun type(){
        println("BMW type")
    }
}

//Calling start of every cars which inherit car
/*
We don't need to call separate start of cars it will override the method
of passed object.
 */
fun callStart(car: Car){
    car.start()
}


//======= Type checking and Type casting ======================

fun typeChecking(car : Car){
    if(car is Mercedes) //Is car is instance of Mercedes
        car.type() //Smart check
}

fun typeCasting(car : Car){
    (car as Mercedes).type()  //Casting instance of car into mercedes
}