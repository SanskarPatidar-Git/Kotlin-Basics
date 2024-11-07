import kotlin.math.pow

/*
Lambda Expression-
{ statement }
{ args -> expression}
Addition -  {a , b -> a+b}
If args is single replace with it(points the data).
 */
fun main(){

    //Simple lambda expression
    var expr = {
        println("Lambda expression....")
    }
    expr()

    //Expression taking 2 args and returning result
    var lambda = { a : Int , b : Int -> a*b}
    println( lambda(10,20))

    //Return type of lambda will be data type of last expression
    var lambdaType = {
        "Hello kotlin"  //return String
        //200 //As 200 is last expression then return type will be of Int
    }
    println(lambdaType())

    //Using it (refer to current value if only one args is present)
    var lambdaSum : (Int)-> Int = { it + it}
    println(lambdaSum(400))

    //Passing lambda function as argument
    calculator({ a , b -> a.pow(b) })

    //If lambda function is last arg of function it can be replace in outer body.
    calculator { a, b -> a.pow(b) }
}

//Getting a function in arg
fun calculator(po : (Double , Double) -> Double) {
    println("Power is: ${po(4.2,2.0)}")
}