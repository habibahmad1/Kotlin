fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 26

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 25

    val apakahLulus = apakahLulusAbsen && apakahLulusUjian

    println(apakahLulus)
}