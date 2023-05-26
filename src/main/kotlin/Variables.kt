import java.util.concurrent.locks.Condition
/*
* Starting with variables:
* * to define : var => for a variable whose value can change.
* * to define : val => for a variable whose value never changes.
* * variables types :
* * * String.
* * * Boolean.
* * * Int (Number).
* * * Array.
* * * * syntax : var?val + variable name + variable type + ?value
* * * * syntax : var?val + variable name = value.
* * Using the println() function to see the results.
*/
// super global variable:
const val condition: String = "Good"
var greeting: String? = null
fun main() {
    // Defining the first variable
    val name: String = "ilias"
    // Printing the name variable in the console with println() function
    println("name: $name")
    // int variable
    val age: Int = 22
    println("age: $age")
    // Boolean variable
    val states: Boolean = false
    println("Taken: $states")
    println("condition: $condition")

    // Nullable variable (Null safety)
    // by adding '?' at the end of variable type that mean that this variable accept the null value
    var firstName: String?
    firstName = null
    println(firstName)
    /*
    this example // Fails to compile.
    val languageName: String = null
    */
    /* variable declaration :
    * * Simplify the variable declaration syntax:
    * * * var?val + variable name + value.
    */
    val num = 1
    val liable = "the first liable"
    println("${liable}, $num")
    /*
    this example // Fails to compile.
    var languageName = "French"
    languageName = null
    */
    // Control flow:
    /*
    * using if statement.
    */
    //greeting = "hello ilias"
    if (greeting == null){
        println("the variable is null")
    }else{
        println(greeting)
    }
    /*
    * using when statement.
    */
    //greeting = "hello ilias gV:2"
    when(greeting){
        null-> println("the variable is null")
        else-> println(greeting)
    }
    // passing variables values to a locale variable.
    /*
    * using if statement.
    */
    //greeting = "hello for the passing"
    val greetingToPrint = if (greeting != null) greeting else "greeting is null"
    println(greetingToPrint)
    /*
    * using when statement.
    */
    //greeting = "ilias using kotlin for preparing"
    val greetingToPrintV2 = when(greeting){
        null->"greeting is null"
        else->greeting
    }
    println(greetingToPrintV2)
}