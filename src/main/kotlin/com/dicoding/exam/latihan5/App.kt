

package com.dicoding.exam.latihan5

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kriteria seperti berikut:
 *
 *     - Jadikan sebagai suspending function dengan menambahkan suspend operator
 *     - Menambahkan delay 3 detik
 *     - Mengembalikkan nilai kembalian hasil dari perhitungan denngan rumus valueA + valueB
 *
 */
suspend fun sum(valueA: Int, valueB: Int): Int {
    // todo 1
    delay(3000)
    return valueA + valueB
}

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kriteria seperti berikut:
 *
 *     - Jadikan sebagai suspending function dengan menambahkan suspend operator
 *     - Menambahkan delay 2 detik
 *     - Mengembalikkan nilai kembalian hasil dari perhitungan denngan rumus valueA * valueB
 *
 */
suspend fun multiple(valueA: Int, valueB: Int): Int {
    // todo 2
    delay(2000)
    return valueA * valueB
}

fun main() = runBlocking {
    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    println("Result sum: ${resultSum.await()}\n" +
            "Result multiple: ${resultMultiple.await()}")
}