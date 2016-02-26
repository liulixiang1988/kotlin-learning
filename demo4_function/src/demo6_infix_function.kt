fun main(args: Array<String>) {
    infix_functions()
}
//定义中缀函数
infix fun Double.averageWith(other: Double):Double{
    //this是左边的运算符
    return (this + other) / 2.0
}
fun infix_functions(){
    val x = 'z' downTo 'a'
    for(a in x) print("$a\t")
    println()

    val capitals = mapOf("Paris" to "France", "London" to "UK")
    for((key, value) in capitals)
        println("$key\t$value")
    println()

    //调用中缀函数
    val a = 3.0
    val b = 10.0
    println("The average of $a and $b is ${a averageWith b}")
}