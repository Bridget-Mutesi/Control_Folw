fun main(){
    allOdds()
    var x = namCheck(arrayOf("Bridget","Mutesi","Rita","Nik","Elizabeth","Christine"))
    println(x)

    DrinksRobot(5)
    DrinksRobot(13)
    DrinksRobot(20)


numbers()
}
fun allOdds(){
    for(nums in 1..100)
        if(nums % 2 != 0){
            println(nums)


    }
}

fun namCheck(names:Array<String>): Int {
    var tik = 0
    names.forEach {b ->
        if (b.length>5){
            tik++
        }
    }
    return tik
}

fun DrinksRobot (age:Int){
    when (age ){
       in 0..6-> println("serve milk")
        in 7..15-> println("serve fanta orange")
        else ->println("serve coca cola")


    }}

fun numbers (){
    for (num in 1..100)
     if (num%3==0 && num%5==0)  {
         println("FizzBuzz")
     }
        else if (num%3==0){
            println("Fizz")
     }
        else if ( num%5==0){
            println("Buzz")
     }
        else{
            println(num)
     }
}








