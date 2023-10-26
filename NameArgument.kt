fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Welcome $firstName $middleName $lastName")
}

fun main() {
    fullName("Doni","Arianto","Pratama")
    fullName(
        lastName = "Pratama",
        middleName = "Arianto",
        firstName = "Doni"
    )
}