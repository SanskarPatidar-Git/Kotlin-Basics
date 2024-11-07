
/*
Fixed size with constant values.
NORTH , SOUTH, EAST, WEST are objects of Direction.
 */
enum class Direction {
    NORTH , SOUTH, EAST, WEST;

    //Return opposite direction
    //Here this return the object by which opposite() is called.
    fun opposite(): Direction {
        return when (this) {
            NORTH -> SOUTH
            SOUTH -> NORTH
            EAST -> WEST
            WEST -> EAST
        }
    }
}

fun main() {
    val direction = Direction.NORTH
    println(direction)  // Output: NORTH
    println(direction.opposite())  // Output: SOUTH

    val day = Day.MONDAY
    println("Day: $day")
    println("Name: ${day.name} - Value: ${day.value}")

    //Change the value - day.value = 20
}

//Give values to enum constants
enum class Day(var value : Int){
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
}
