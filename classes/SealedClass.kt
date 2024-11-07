
/*
A sealed class is a class that restricts class inheritance to a limited set of types
Sealed class allows for a restricted class hierarchy, meaning you can only subclass it within the same file.

Subclasses of a sealed class must be defined within the same file.
It cannot be instantiated directly; you can only instantiate its subclasses.
Often used with when expressions to handle different subclasses exhaustively, ensuring that all subclasses are handled.

Here, Result has two possible outcomes Success and Error.
 */

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

/*
Doesn't require else in when as because Result can be of either Success or Error.
 */
fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
    }
}

fun main() {
    val result: Result = Result.Success("Data loaded")
    handleResult(result)  // Output: Success: Data loaded
}
