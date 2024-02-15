
val test : ()-> Unit={
    println("This is a test")
}

val notTest: ()-> Unit={
    println("This is not a test")
}


fun isItTest(isTest: Boolean) :() -> Unit {
    if (isTest) {
        return test
    } else {
        return notTest
    }
}



fun main(){
    val isNotTest = isItTest(false)
    val itIsTest = isItTest(true)
    isNotTest()
    itIsTest()
}