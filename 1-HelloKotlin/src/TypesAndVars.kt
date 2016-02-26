fun main(args: Array<String>) {
    val_declarations()
    //ranges()
}

fun val_declarations(){
    //val声明的变量不能更改
    val a:Int = 64
    val b:Long = 123

    //这种事不行的,必须每个占一行:
    //val c = 3, d = 4

    val c:Float = 3.4f //后面跟'F'或者'f'
    val d:Double = 3.4
    val e:Double = 12.3e5
    //不赋值的val声明
    val f: Int
    f = 13

    val g:StringBuffer = StringBuffer("test")
    g.replace(0, 1, "T")
    //打印
    println("$a $b $c $d $e $f")
    println("$g")

    //可更改的变量
    var h:Int = 123
    h = 45
    println("$h")
}

fun ranges(){
    val a:IntRange = 1..10 //包含10
    for(i in a) println(i)
}