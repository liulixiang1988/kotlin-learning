fun main(args: Array<String>) {
    //解包赋值
    val (x1, x2) = solve_quadratic_equation(1.0, 10.0, 16.0)
    println("x1 = $x1, x2 = $x2")
}

fun solve_quadratic_equation(a:Double, b:Double, c:Double): Pair<Double, Double>
{
    fun calculate_discriminant(): Double{
        return b*b - 4*a*c
    }
    val root_disc = Math.sqrt(calculate_discriminant())
    return Pair((-b+root_disc)/(2*a), (-b-root_disc)/(2*a))
}