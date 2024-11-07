
/*
Higher Order Function
Passing or returning function from another function

Here sub and add function both have same args and return type so that both
can be passed to function.
 */
fun main(){

    var fn = ::sub //Storing function into variable
    calculate(20,10,fn) //calling method and passing func as args

    /* try this
    var fn = (a:Int , b:Int) -> Int ::add
    calculate(20,10,fn)
    */
}

/*
This two functions are working same take 2 type args and return same type
(a: Int , b : Int) : Int
 */
fun add(a: Int , b : Int) : Int{
    return a+b
}
fun sub(a: Int , b : Int) : Int{
    return a-b
}

/*
This function taking two args which will be passed to another function
gn: (a: Int , b : Int) -> Int
taking function.
 */
fun calculate(a: Int , b : Int , gn: (a: Int , b : Int) -> Int){
    var result = gn(a,b) //calling function
    println("Result : $result")
}