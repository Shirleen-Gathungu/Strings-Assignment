fun main(){
printString()
    var message=myAge("Shirleen",20)
    println(message)
    var display=stringLength("Shirleen")
    println(display)
    myName("Shirleen","Dylan")

}

fun printString(){
    var name="AkiraChix"
    var display=(name[2].toString()+name[3]+name[4])
    println(display)
}

fun myAge(word:String,age:Int):String{
    var word="Shirleen"
    var age=20
    var statement="Hi,my name is $word,I am $age years old"
    return statement

}
fun stringLength(name:String):Int{
    var n= name.length
    return n

}
fun myName(name1:String,name2:String){
    var n1=name1
    var n2= name2
    if (n1.equals(n2)){
        println("That's me!")

    }
    else {
        println("I don't know who that is")
    }
}
