package Classes
import java.io.File


class BasalMetabolism (wheight: Double, height: Double, age: Int) {
    val W = wheight
    val H = height
    val A = age

    fun Calc(): Double {

        val Calculator = 88.362 + (13.397 * W) + (4.799 * H) - (5.677 * A)

        return Calculator
    }
}
