/**
 * Created by Liu Lixiang on 2016/2/26.
 */
fun main(args: Array<String>) {
    for_loop()
}

fun for_loop(){
    //普通for循环
    for (a in (10 downTo 1)) print("$a\t")
    println()

    //数组for循环
    val ints = intArrayOf(4, 3, 2, 1)
    for((index, value) in ints.withIndex()){
        println("$index:\t$value")
    }

    //字典for循环
    val capitals = mapOf("Paris" to "France", "London" to "UK")
    for ((capital, country) in capitals){
        println("${country}'s capital is $capital")
    }
}