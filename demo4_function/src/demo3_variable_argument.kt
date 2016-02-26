package KotlinSamples.Demo3

fun main(args: Array<String>) {
    println("result is ${sum_up(1, 3, 5)}")
    println("result is ${sum_up2(4, 5, 6)}")
    //解包操作
    val stuff = intArrayOf(1,2 ,3)
    println(sum_up(3, 5, *stuff, 1, 9))
}

//可变长参数
fun sum_up(vararg values:Int):Int{
    var result = 0
    for (v in values){
        result += v
    }
    return result
}

//函数式的解法
fun sum_up2(vararg values:Int):Int{
    return values.sum()
}