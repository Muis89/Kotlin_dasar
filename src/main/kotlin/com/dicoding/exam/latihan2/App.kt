

package com.dicoding.exam.latihan2

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan nilai dengan rumus
 *  perhitungan berikut:
 *
 *      valueA + (valueB - valueC)
 *
 *  Jika valueC bernilai null, silakan tetapkan nilai 50 sebagai nilai default-nya
 */
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // todo 1
    val result = valueA + (valueB - (valueC ?: 50))
    return result
}

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan text seperti berikut:
 *
 *      Result is ${result}
 */
fun result(result: Int): String {
    // todo 2
    return "Result is ${result}"
}

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ${result(resultA)}
        ${result(resultB)}
    """.trimIndent())
}