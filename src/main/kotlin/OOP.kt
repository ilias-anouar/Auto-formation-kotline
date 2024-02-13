class Car(var type:String) {
    private var brand = ""
    private var color = ""
    private var mode = ""
    // brand
    fun getBrand(): String {
        return brand
    }
    fun setBrand(value:String){
        brand=value
    }
    // color
    fun getColor():String{
        return color
    }
    fun setColor(value:String){
        color = value
    }
    // mode
    fun getMode():String{
        return  mode
    }
    fun setMode(value:String){
        mode=value
    }
}

fun main(){
    val car1 = Car("Sport")
    car1.setBrand("Volvo")
    car1.setMode("Mustang")
    car1.setColor("black")

    println(car1.type)
    println(car1.getMode())
    println(car1.getColor())
    println(car1.getBrand())





}







