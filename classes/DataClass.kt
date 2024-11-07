
/*
Data class is used to store data or model.
 */
fun main(){
    var emp1 : Employee = Employee(1,"Sanskar")
    var emp2 : Employee = Employee(2,"Rakesh")

    println(emp1)
    println(emp2)

    emp1.setId(3)
    println("Id of emp1 : ${emp1.getId()}")

    //Copy the object
    var emp3 = emp1.copy()
    //emp1.copy(id = 4) -> copy object and override some properties value
    println("Employee 3 -> $emp3")

    //equals method of Any class
    println("Equals : ${emp1 == emp3}")


    /*
    -Get values from object
    val (id,name) = emp1
    println(id)

    -get values by component
    emp1.component1() -> represent id
    emp1.component2() -> represent name

    This will work when properties are public.
     */
}

data class Employee(private var id : Int, private var name : String){

    //Getter and Setter for id
    fun setId(id : Int){
        this.id = id
    }

    fun getId() : Int{
       return id
    }

    override fun toString(): String {
        return "Employee(id=$id, name='$name')"
    }
}