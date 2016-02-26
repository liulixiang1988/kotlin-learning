import java.util.*

fun main(args: Array<String>) {
    extension_functions()
}
//扩展函数
fun <T> ArrayList<T>.swap(index1:Int, index2:Int){
    //this指向实例
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

//给所有的对象添加函数，用Any?
fun Any?.print(){
    if( this == null) println("Object is null")
    else println("Object is ${this.toString()}")
}

//扩展函数
val String?.empty: Boolean
    get() = (this == null || this.length == 0)

fun extension_functions(){
    val mylist = arrayListOf(1, 2, 3)
    //调用扩展函数
    mylist.swap(0, 2)
    println(mylist)
    mylist.print()

    val s:String? = null
    s.print()
    //调用扩展属性
    println(s.empty)
    println("".empty)
}