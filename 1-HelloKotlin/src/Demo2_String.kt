/**
 * Created by liulixiang on 16/2/26.
 */
fun main(args: Array<String>) {
    characters_and_strings()
}

fun characters_and_strings() {
    //字符
    println("=====字符=====")
    val a:Char = '\u0041'
    if (a.toInt() == 65){
        println("match")
    }

    //字符串
    println("=====字符=====")
    val b:String = "Hello"
    println(b)
    println("取字符串中的字符:${b[0]}")
    println("遍历字符串中的字符:")
    for(letter in b) print("$letter\t")
    println()

    //原始字符串
    println("=====原始字符串=====")
    val raw = """Hello
"test"
world"""
    println(raw)

    //字符串模板
    println("=====字符串模板=====")
    val c = 123.0
    val d = "c = $c, price = ${'$'}${c/10}"
    println(d)

    //range
    println("=====range=====")
    val e = "${(10 downTo 1).toList().map { it.toString().toList() }.joinToString()}"
    println(e)

}