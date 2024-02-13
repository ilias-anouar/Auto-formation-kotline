
open class Base {
    var id = ""
    var addAt=""
    var updateAt=""
}



class User:Base(){
    private var name = ""
    private var age = ""

    // name
    fun setName(value:String){
        name = value
    }
    fun getName(): String {
        return this.name
    }
    // age
    fun getAge():String{
        return  this.age
    }
    fun setAge(value:String) {
        this.age = value
    }
}


fun main(){
    val test1 = User()
    test1.id="0"
    test1.addAt="01/01/01"
    test1.updateAt="01/01/01"
    test1.setName("user0")
    test1.setAge("22")
    println(test1)
    println(test1.id)
    println(test1.addAt)
    println(test1.updateAt)
    println(test1.getName())
    println(test1.getAge())
}