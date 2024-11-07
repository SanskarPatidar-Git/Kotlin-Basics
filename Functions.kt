import kotlin.math.pow

fun main(){
    add(10,20)
    var finalStr = getName("Mahesh",32000.0)
    println("FinalStr: $finalStr")

    //Named arguments
    add(b = 300 , a = 100)

    println("Inline function multiply(): ${multiply(10,20)}")

    //Reference of a function in a variable
    var fn = (::calPower)(2.0,3)

    //Extension function
    var formattedStr = "Kotlin Developer".formattedString()
    println(formattedStr)

    //Inline function
    inlineFunction { loopAsInline(1000) }

    //Varargs -> any no. of args
    sumUsingVarargs(1,4,7,3,8,3)
    sumUsingVarargs(98,23,54,76,12,76,99,43,56,78)
}

//Function with arguments but no return type
fun add(a : Int ,  b : Int){
    println("Addition is ${a+b}")
}

//Function with arguments and return type
fun getName(name: String , salary: Double) : String{
    return "$name has income $salary per month "
}

/*
Inline function-
one line expression (return multiplication of two numbers)
 */
fun multiply(a:Int, b:Int) = a*b


fun calPower(a:Double,b:Int) {
    val power = a.pow(b)
    println("Power of $a to $b = $power")
}

/*
Function Extension
Apply Extensions on that object.
Here we are applying on String object that every string will be formatted with --
this represent the object on which extension is provided
 */
fun String.formattedString() : String{
    return "-----------------\n $this \n-----------------"
}

/*
Inline function-
In Kotlin, an inline function is a function that is compiled in such a way that its code is inserted directly at the call site,
rather than being called normally through a function call. This can help improve performance by reducing function call overhead,
especially in the case of higher-order functions (functions that take other functions as parameters).

Also it does not create instances for lambda functions rather than executes at cll side.

If you want to check it remove inline keyword and check the decompiled code
Tools -> kotlin -> show decompile code
Use inline again and check decompiled code you can se the INSTANCES are removed.
 */
inline fun inlineFunction(fn: () -> Unit){
    fn()
}

fun loopAsInline(n: Int){
    for(i in 1..n){

    }
}


/*
Varargs -> Variable arguments
You can send multiple number of args and her values work as array
 */
fun sumUsingVarargs(vararg values : Int){
    var sum = 0
    for (i in values)
        sum += i
    println("Variable args sum : $sum")
}


/*
By default function which is not returning any value has a return type Unit.
 */