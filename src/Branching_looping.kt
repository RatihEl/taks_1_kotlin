//IF Expression
fun main() {
    val nilaiUjian = 85
    if (nilaiUjian > 70) {
        println("Good Job")

        //Else Expression
    } else {
        println("Coba Lagi Tahun Depan")
    }

    //Else IF Expression
    val nilai = 95

    if (nilai > 90){
        println("MasyaAllah")
    }else if (nilai > 75){
        println("Good Job")
    }else if (nilai > 60){
        println("Tetap Semangat")
    }else {
        println("jangan sedih, tetap berusaha")
    }


    val sekolah = "SMP"
            when(sekolah){
                "SD" -> print("Akreditasi A")
                "SMP" -> print("Akreditasi B")
                "SMA" -> print("Akreditasi c")

                else -> print("Tidak Ada Akreditasi")
            }
    // looping

    //while looping
    var int = 7
    while (int <= 10) {
        println("siip")
        int++
    }
    //do while loop

    var angka = 2
    do {
        println("baik")
        angka++
    }while (angka < 4)


        for (data in 1..5)
            println("Jaya")
    }










