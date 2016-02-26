/**
 * Created by Liu Lixiang on 2016/2/26.
 */
fun main(args: Array<String>) {
    println("4*3 is ${triple(4)}")
    println("4*4 is ${sqr(4)}")
    println("pay ${calculate_wages(160)}")
    //命名参数
    println("pay ${calculate_wages(hourly_rate = 20.0)}")
}

fun triple(x:Int): Int{
    return x*3
}

fun sqr(x:Int) = x * x

//默认参数
fun calculate_wages(hours:Int = 160, hourly_rate:Double = 100.0): Double{
    return hours*hourly_rate
}