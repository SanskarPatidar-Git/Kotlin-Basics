
/*
There is no body of abstract method.
If a class contains at least one abstract method you need to declare class as abstract.
We cannot create object of abstract class.
 */

fun main(){
   var planet : Planet = Earth()
   planet.rotationSpeed()
}

/*
Every planet has its rotation speed and on initial stage we cannot define rotation speed
so we made a method abstract that the body of method will be defined in future when any class
inherit Planet class.
 */
abstract class Planet(){
    abstract fun rotationSpeed()
}

class Earth : Planet(){

    override fun rotationSpeed() {
        println("Speed of earth rotation is 29 km/s")
    }

}