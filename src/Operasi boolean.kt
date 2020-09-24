fun main() {
    val nilaiUjian = 78
    val nilaiAbsen = 80
    val nilaiExstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExstra = nilaiExstra > 95


    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExstra
    println(apakahLulus)

    val pendapatan = 80
    val pengeluran = 70
    val laba = 30

    val apakahuntung= pendapatan > 70
    val apakahrugi = pengeluran > 50
    val apakahuntung2 = laba > 20


    val apakahsukses = apakahuntung && apakahrugi && apakahuntung2
    println(apakahsukses)
}