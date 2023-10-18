package com.mardelapps.apprueba.Exercises

abstract class Phone(){
    abstract fun switchOn()
    abstract fun switchOff()
    abstract fun checkPhoneScreenLight()
}

class FondablePhone(var isFoldable: Boolean = false, var isScreenLightOn:Boolean = false) : Phone() {
    fun folded(){
        isFoldable = true
    }

    fun unfolded(){
        isFoldable = false
    }

    override fun switchOn() {
        isScreenLightOn = true
    }

    override fun switchOff() {
        isScreenLightOn = false
    }

    override fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isFoldable){
            if(isScreenLightOn){
                "error"
            } else {
                "off"
            }
        } else {
            if(isScreenLightOn){
                "on"
            } else {
                "off"
            }
        }
        println("The phone screen's light is $phoneScreenLight.")
    }
}

fun main(){
    val Phone = FondablePhone()
    Phone.unfolded()
    Phone.switchOn()
    Phone.checkPhoneScreenLight()   //on

    Phone.folded()
    Phone.switchOn()
    Phone.checkPhoneScreenLight()   //error

    Phone.switchOff()
    Phone.checkPhoneScreenLight()   //off

    Phone.unfolded()
    Phone.switchOn()
    Phone.checkPhoneScreenLight()   //on


}