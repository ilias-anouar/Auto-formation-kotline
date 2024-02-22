
val test : ()-> Unit={
    println("This is a test")
}

val notTest: ()-> Unit={
    println("This is not a test")
}


fun isItTest(isTest: Boolean) :() -> Unit {
    return if (isTest) {
        test
    } else notTest
}



fun main(){
    val isNotTest = isItTest(false)
    val itIsTest = isItTest(true)
    isNotTest()
    itIsTest()
}