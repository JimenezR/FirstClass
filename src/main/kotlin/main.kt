/************************************
 * Kotlin Diploma                   *
 * First class                      *
 * @jimenez_r                       *
 ************************************/
fun main(args: Array<String>) {

    /************************************
     * Kotlin variables and Basic Types *
     ************************************/
    var num: Int = 10
    var double: Double = 100.0
    var float: Float = 100F
    var shortMin: Short = -32768
    var shortMax: Short = 32767
    var longMin: Long = -9_223_372_036_854_775_807
    var longMax: Long = 9_223_372_036_854_775_807
    var byteMin: Byte = -128
    var byteMax: Byte = 127
    var string: String = "Hello World!"
    var char: Char = 'k'
    var charOther: Char = '#'
    var boolean: Boolean = false


    /*************************
     * Mutable and Immutable *
     *************************/
    // Mutable
    var x = 1
    x = 5
    // Immutable
    val y = 2
    // This is not possible: y = 3

    println("Mutable and Immutable")
    println(x)
    println(y)


    /***********
     * Output: *
     * 5       *
     * 2       *
     ***********/

    /*************************
     * ArrayList             *
     *************************/

    val days = arrayListOf<String>()
    val weekdays = arrayListOf<String>()
    weekdays.add("Monday")
    weekdays.add("Tuesday")
    weekdays.add("Wednesday")
    weekdays.add("Thursday")
    weekdays.add("Friday")

    days.addAll(weekdays)

    if (days.size > 0) {
        println("First day ${days.first()}")
    }

    /*************************
     * Concatenation         *
     *************************/
    num = 2
    println("concatenation")
    println("Numeric value = " + num + "\n  and day = " + days[num])

    /*************************
     * String templates      *
     *************************/
    num = 3
    println("string templates")
    println("Numeric value = $num \n  and day = ${days[num]}")

    /***************
     * Null Safety *
     ***************/
    var nameOne: String? = null
    nameOne?.let { name ->
        println("Null Safety")
        println("Hello World! : $name")
    }

    /*****************************
     * operators *
     *****************************/
    val car = "auto"
    val car2 = "auto"

    // igual
    if (car == car2) {
        println("igual")
    }

    // and
    if (car == car2 && num == 7) {
        println(car)
    }

    // or and negation and greater
    if (!((car == car2 || num == 7) && num < 9)) {
        println(car)
    }

    // negation
    if (!boolean) {
        println(car)
    }


    /*****************************
     * when and ranges           *
     *****************************/

    when (100) {
        5 -> {
            println("this number is 5")
            num + 3
        }
        10 -> {
            println("this number is 10")
            num + 6
        }
        15 -> {
            println("this number is 15")
        }
    }

    when (10) {
        in 4..6 -> println("kindergarten")
        !in 6..12 -> println("primary")
        in 12..18 -> println("high school")
        50 -> println("you are 50 years old")
        51 -> println("you are 51 years old")
    }

    /*****************************
     * loops                     *
     *****************************/

    weekdays.forEachIndexed { index, _ ->
        println(index)
    }

    for (day in weekdays) {
        println(day)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 5 step 2) {
        println(i)
    }

    for (i in weekdays.indices) {
        println("${days[i]} today ${if (i == 3) "Wednesday" else ""}")
    }

    for ((index, day) in weekdays.withIndex()) {
        println("${index + 1} - $day")
    }

}
