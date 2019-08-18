package com.noah

fun main(args: Array<String>) {
//    println("Hello kotlin")
    //分號可加可不加
//    Human().hello()
    val h = Human()
    h.hello()

//    val age :Int = 19;
//    age = 20; <-錯誤
    var age:Int = 25;
    age = age.plus(1)
    val weight = 65.5
    val ecroll : Boolean = true
    println(age)

}
class Human{
    fun hello(){
        println("Hello kotlin")
    }
}