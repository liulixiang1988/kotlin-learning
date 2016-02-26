/**
 * Created by Liu Lixiang on 2016/2/26.
 */
fun main(args: Array<String>) {
    if_statement()
}

fun if_statement() {
    //? :
    val temp = 20
    val feel = if (temp < 10)
        "cold"
    else if (temp > 20)
        "warm"
    else "ok"

    println("it feels $feel outside")
    println("it is ${if(temp > 20) "warm" else "ok"} today")
}