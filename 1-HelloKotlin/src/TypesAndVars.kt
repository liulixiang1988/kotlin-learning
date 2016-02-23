fun main(args: Array<String>) {
    //val_declarations()
    ranges()
}

fun val_declarations(){
    val a:Int = 64
    val b:Long = 123
    val c:Float = 3.4f
    val d:Double = 3.4
    println("$a $b $c $d")
}

fun ranges(){
    val a:IntRange = 1..10 //包含10
    for(i in a) println(i)
}