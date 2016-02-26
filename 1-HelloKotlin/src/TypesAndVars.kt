fun main(args: Array<String>) {
    val_declarations()
}

fun val_declarations(){
    //val声明的变量不能更改
    val a = 64
    val b= 123
    val c = 3.4f //后面跟'F'或者'f'
    val d = 3.4
    val e = 12.3e5
    //不赋值的val声明，变量类型不能省略
    val f: Int
    f = 13

    val g = StringBuffer("test")
    g.replace(0, 1, "T")
    //打印
    println("$a $b $c $d $e $f")
    println("$g")

    //可更改的变量
    var h = 123
    h = 45
    println("$h")
}