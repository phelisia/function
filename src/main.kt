fun main (){
    salams("Ada")
    var x = twoNumbers(30,4)
    println(x)
    var you= intrestingMe("chips","Bible")
    println(you)
}
fun salams (name:String){
    println("hello $name")

}
fun twoNumbers(oneNum:Int,secNum:Int):Int{
    var numbers =oneNum%secNum
    return numbers
}
fun intrestingMe(food:String,book: String){
var intrest= food+book
println(intrest)
}
