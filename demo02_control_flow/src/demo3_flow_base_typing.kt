/**
 * Created by Liu Lixiang on 2016/2/26.
 */
fun main(args: Array<String>) {
    flow_based_typing()
}

fun flow_based_typing() {
    var s:String? = "hjkh"
    if(s!=null){
        //不需要s?.length
        println(s.length)
    }
    var x: Cloneable = intArrayOf(1, 2, 3)
    if (x is IntArray){
        //不需要(x as IntArray).size
        println(x.size)
    }
}