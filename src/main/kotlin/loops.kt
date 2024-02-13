/*
* working with loop :
* For loop :
* * syntax => for (variable + in + array){ body:treatment }
* while loop :
* * syntax => while (condition) { body:treatment }
* */

fun main(){
    // starting with for loop
    // array cars to loop in !!
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        // print each car as x in cars !!
        println(x)
    }
    // staring with while loop:
    // i as an int = 0 to start with
    var i=0
    // while i < 10 print i + increment i !!
    while (i<10){
        i++
        println(i)
    }


// condition and break !!
for ((r, x) in cars.withIndex()) { println(r);
    if(x=="BMW"){ 
        println(x); 
        break
}
}

for ((e,o) in cars.withIndex()){ println("the index of $o is $e")}

}