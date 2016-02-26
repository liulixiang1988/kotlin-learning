/**
 * Created by Liu Lixiang on 2016/2/26.
 */
fun main(args: Array<String>) {
    nullability()
}

fun nullability(){
    var y:String? = null
    //下面的是错误的
    //println(y.length)
    var len: Int? = y?.length
    println(len)
    //或者这样返回-1，其中?:类似else，也就是说如果y是Null，就返回-1
    var len2:Int = y?.length ?: -1
    println(len2)

    //注意：1.系统库其实自动添加了null 检查，比如 System.out.println，其实是System?.out?.println
    //关闭null检查：y!!.length 如果此时y为null会抛出异常
}