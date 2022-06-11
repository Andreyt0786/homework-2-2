fun main(){
val likes = 1121
    val man = "человеку"
    val people = "людям"
    val result = if(likes%10 == 1 && likes%100 != 11) man else people
    println("Нравится $likes $result")
}