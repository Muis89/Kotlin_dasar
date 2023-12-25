
package com.dicoding.exam.latihan1

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  merupakan angka genap
 */
fun isEvenNumber(number: Int):Boolean {
    // todo 1
    return number % 2 == 0
}

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  lebih dari 5
 */
fun moreThanFive(number: Int):Boolean {
    // todo 2
    return number > 5
}

/**
 *  TODO 3
 *  Sesuaikan fungsi di bawah ini agar dapat menghasilkan nilai akhir dengan
 *  rumus:
 *
 *      param * ( param + 10 )
 */
fun result(number: Int):Int {
    // todo 3
    return number * (number + 10)
}

fun main() {
    val listNumber = 1.rangeTo(100)
    for (number in listNumber) {
        if (isEvenNumber(number)) continue

        if (moreThanFive(number)) break

        val result = result(number)
        println("range result is $result")
    }
}



