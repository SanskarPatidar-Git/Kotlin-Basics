/*
Handle Exception-
try -> write the code in try where are chances of getting exception
catch -> whenever any exception occurs catch block will be invoked
        catch will be depends on the object of which exception is occur
        Like -> if exception is of ArrayIndexOutOfBound then that catch will be executed which is object of this exception.
finally -> either exception occur or not it will be executed.

Multiple catch will be used with single try block.
try block will we work with either catch or finally.

try { }
catch (e : NullPointerException){}
catch (e : ArrayIndexOutOfBoundException) {}
catch (e : Exception) {}

if NullPointerException is thrown then it will execute only first catch block.
if any exception occurs which is not mentioned separately then super class of all exception that is Exception will execute.
if you add Exception catch block at beginning before its subclasses then every exception will executed in Exception block.

 */
fun main(){
    handleException()
    throwException()
}

fun handleException(){
    var list = arrayOf<Int>(1,2,3,4,5)

    // println(list[5]) -> gets ArrayIndexOutOfBoundException (accessing element of list out of bound)

    try {
        println("before exception....")
        println(list[5]) // occurs exception
        println("after exception....")

    } catch (e : Exception) {  //It will execute any Exception as it is super class of all Exceptions. Create multiple catch for different Exceptions.
        println("Exception occurs:  ${e.message}")

    } finally {
        println("Exception occur or not I will execute always")
    }
}

//use of throw
//Explicitly throw an exception
//I want to throw an exception if age is less than 18 for license creating.
fun throwException(){

    var age : Int = 17
    if(age < 18){
        //throw exception
        throw Exception("You are not applicable for license as you are below 18")
    } else {
        println("License created.......")
    }
}
