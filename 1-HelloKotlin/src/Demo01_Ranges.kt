/**
 * Created by liulixiang on 16/2/26.
 */
fun main(args: Array<String>) {
    ranges()
}

fun ranges(){
    val a: IntRange = 1..10 //闭区间,而不是左闭右开. 1, 2, ..., 10(含10)
    //遍历range,使用in语法
    for (x in a) println(x)

    //除了上面的声明方式,还有以下声明方式:
    val b = 1.rangeTo(10)

    println("=====逆序=====")
    val c:IntProgression = b.reversed()
    for(x in c) println(x)

    println("=====range求和=====")
    println("sum of ints $c = ${c.sum()}")

    println("=====递减的range=====")
    val d = 10.downTo(1) //不能用10..1
    for(x in d) println(x)

    println("=====省略括号======")
    val e = 10 downTo 1
    for(x in e) println(x)

    println("=====根据变量声明range======")
    val m = 8
    val n = -3
    val f = IntRange(Math.min(m, n), Math.max(m, n))
    for(x in f) println(x)

    println("=====指定步长======")
    val g = 100 downTo 1 step 3
    for(x in g) print("$x\t")
    println()
}