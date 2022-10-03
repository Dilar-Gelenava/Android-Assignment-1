import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    // Task 1
    val myArray: Array<Int> = arrayOf(8, 16, 32, 64, 128, 256)
    print("${getAverageOnEvenIndexes(myArray)}\n")

    // Task 2
    val myString = "Hello, world!"
    print("${isPalindrome(myString)}\n")

    // Task 3
    val myDate = Date()
    print("${myDate.getFormattedDate("yyyy-MM-dd")}\n")
}

fun getAverageOnEvenIndexes(array: Array<Int>): Double {
    var sum = 0
    var count = 0
    for (i in array.indices) {
        if (i % 2 == 0) {
            sum += array[i]
            count++
        }
    }
    return sum.toDouble() / count
}

fun isPalindrome(string: String): Boolean {
    return string == string.reversed()
}

fun Date.getFormattedDate(pattern: String): String {
    return SimpleDateFormat(pattern).format(this)
}
