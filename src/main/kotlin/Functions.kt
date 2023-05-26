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
fun sayHelloTo(msg:String,name: String)=println("$msg $name")
fun main(){
    println("Hi my name is Ilias I'm learning kotlin")
    //calling function sayHello().
    println(sayHello())
    //calling function greeting().
    greeting()
    //calling function sayHelloTo(msg,name).
    sayHelloTo(msg = "Love u",name = "bassema")
    sayHelloTo(msg = "Hello", name = "ilias")
}