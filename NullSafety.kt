fun main(){

    var gender : String = "Male"

    //Value of gender2 might be null
    var gender2 : String? = null  //Null check or Nullable

    //If gender2 is null then it will not perform length operation
    println(gender2?.length)

    //If you want to execute some statements only when gender2 is not null.
    //If gender2 is null then this statement will not executed.
    gender2?.let {
        println("Statement 1")
        println("Statement 2")
        println("Statement 3")
    }

    //Copy the value and if the object is null then use default value
    var gender3 = gender2 ?: "NA"
    println("Gender3 : $gender3")

    // !! (Not null asserted operator)
    /*
    It will return length if gender2 is not null
    If null then it will throw an exception - NullPointerException
     */
    var length = gender2!!.length
    println("Length: $length")
}