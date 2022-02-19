fun main (){
    salams("ada")
    var x = twoNumbers(30,4)
    println(x)
    var you= intrestingMe("chips","Bible")
    println(you)
    fourNumbers(40,20,30,50)
}
fun salams (name:String){
    println("hello $name")

}
fun twoNumbers(oneNum:Int,secNum:Int):Int{
    var numbers =oneNum%secNum
    return numbers
}
fun fourNumbers(num1:Int,num2:Int,num3:Int,num4:Int){
    var sum=num1+num2+num3+num4
    println(sum)
}
fun intrestingMe(food:String,book: String){
var intrest= food+book
println(intrest)
}
