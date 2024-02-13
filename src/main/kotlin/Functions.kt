/*
 * Starting with functions:
 * * to define:
 * * * starting with syntax:
 * fun + function name + ( in case => any parameters ) + ?type of return + { function body }.
 */

// defining new function
/*
* setting the return value to string.
* returning a message => Hello word.
*/
fun sayHello():String{
    return "Hello world"
}
/*
 * setting a unit function:
 * returning => a call back
 */
fun greeting():Unit{
    println(sayHello())
}

/*
 * Function parameters:
 * * defining a function => sayHelloTo().
 * * taking the name as a parameter.
 */
fun sayHelloTo(msg:String,name:String)=println("$msg $name")

/*
* Function Check if the message is good it will print it else it will say invalid
*/
 fun checkMessage(msg:String):String{
    return if (msg.indexOf("test")>-1){
        msg
    } else {
        "invalid"
    }
 }

fun main(){
    println("Hi my name is Ilias I'm learning kotlin")
    println(checkMessage(msg = "hey test is here"))
}