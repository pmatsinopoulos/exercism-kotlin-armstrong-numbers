import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val iString = input.toString()
        val numberOfDigits = iString.length
        return iString.fold(0.toDouble()) { acc, d ->
            acc + d.toString().toDouble().pow(numberOfDigits.toDouble())
        } == input.toDouble()
    }

}
