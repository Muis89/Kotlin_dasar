

package com.dicoding.exam.latihan4

/**
 *  TODO
 *  Lengkapi inisialisasi fungsi dengan nilai kembalian Map di bawah ini dengan nilai key-value berikut:
 *
 *  key: type
 *  value: motorcycle
 *
 *  key: maxSpeed
 *  value: 230Km/s
 *
 *  key: maxTank
 *  value: 100Ltr
 *
 */
fun vehicle() = mapOf<String, String>(
    // todo
    "type" to "motorcycle",
    "maxSpeed" to "230Km/s",
    "maxTank" to "100Ltr"
)

fun main() {
    println("""
        My Map Result:
        ${vehicle()}
    """.trimIndent())
}

