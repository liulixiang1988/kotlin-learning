/**
 * Created by Liu Lixiang on 2017/8/28.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1, 2))
    println(min(1, 2))
    val languages = arrayListOf("Java");
    languages.add("Kotlin")
    println(languages)

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")
    println("Hello, ${if (args.size >0) args[0] else "someone"}!")
}

fun max(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun min(x: Int, y: Int): Int = if (x < y) x else y

class Person(val name: String)