fun fullName (firstName: String, middlename : String, lastName:String){
    println("hai $firstName $middlename $lastName")}

fun loongSee (kata1: String, kata2: String, kata3: Int){
    println("ganbate $kata1 $kata2 $kata3")}


fun main() {
    fullName(firstName = "Ratih",
    lastName = "Dina",
    middlename = "El")

    fullName("Ratih", "El", "Dina")
    loongSee("ayo", "semangat", 55)
}