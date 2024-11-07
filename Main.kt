fun main(){
    start()
    variables()
    dataType()
    typeCasting()
    expressions()
    loops()
    stringTemplate()
}

/*
There are 54 keywords in kotlin.
Kotlin is both Object Oriented and Functional Oriented Programing lang.

functions and variables declared outside a class is top level declarations.
 */


//Console actions
fun start(){
    println("Welcome to Kotlin!")

    //read & write to console
    print("Enter name: ")
    var name = readlnOrNull()
    println("Hi, $name")
    println(200)
}

/*
val and var are used to declare a variable.
val is constant -> after initialization value cannot change
var can be modified.
Changing the data type after init is not possible.
 */
fun variables(){
    var score = 10;
    score = 20;
    println("Var : $score")

    val temperature = 3.14
    //temperature = 3.15 //Gives an error
    println("val : $temperature")
}

/*
Kotlin DataTypes
Integer (Byte , Short , Int , Long)
Character (Char , String)
Boolean (true , false)
Floating (Float , Double)

You can declare the data type of variable explicitly also.
 */
fun dataType(){
    var name : String = "Kotlin"
    var year : Int = 2016
    var rating : Double = 9.99
    var symbol : Char = 'K'
    var isAndroidPref : Boolean = true

    println("$name found in $year")
}

/*
Operators , if else are same like other programming languages.
== , >= , && , || , != , + , - , * , / etc
 */

fun typeCasting(){
    var score = 12 //Int
    var scoreInDouble = score.toDouble() //Int to Double
    var scoreInString = score.toString() //Int to String

    var value = "112" //String
    var valueInInt = value.toInt() //String to Int

    println("Score: $score , ScoreInDouble: $scoreInDouble")
    println("valueInInt DataType: ${valueInInt::class.simpleName}")
}

/*
Similar to switch in other languages.
We can use when as expression also which returns value.
 */
fun expressions(){

    //Expression with when
    var name = "Kotlin"
    var result = when(name){
                    "Kotlin" -> "Kotlin found" //return the result
                    "Java" -> "Java found"
                    "Android" -> "Android found"
                    else -> "Not found"
                }
    println("Status: $result")

    //Expression with if else
    val isGreater = if(20>10) true else false
    println("Expression if-else: $isGreater")
}

/*
while and do-while are same as Java.
for loop -
for(i in 1..10 step 2) {starts 1 to 10 with inc with 2} -> 1,3,5,7,9
for(i in 1..10) {1 to 10} -> 1,2,3,4,5,6,7,8,9,10

until -> ending part is not included like here 10. -> 1 to 9
downTo -> for(i in 5 downTo  1 ) decrement 5,4,3,2,1
 */
fun loops(){
    println("=========== Loop =============")
    for(i in 5 downTo 1){
        println(i)
    }

    //Try with an array
    var names = arrayOf("Kotlin","Java","SQL","Android Studio")
    for(name in names)
        println(name)
}

fun stringTemplate(){
    var language : String = "Kotlin"
    var year = 2019
    var tool = "Android Development"

    //println("From year "+year+", Google has announced "+language+" as its primary language for "+tool);

    //Using String template $, ${}
    println("From year $year, Google has announced $language as its primary language for $tool")
}
