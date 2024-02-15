open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded:Boolean=true): Phone(){
    override fun switchOn(){
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun unFold(){
        isFolded=false
    }

    fun fold(){
        isFolded=true
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unFold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}