


fun main(args: Array<String>) {
    println("Hello World!")
    startScreen()
    var userChoice = 0
    var newAccount  = ""
    while (newAccount == "")
    {
        println("Choose an option (1 , 2  or  3)\n")
        userChoice = readln().toInt()
        println("The selected option is $userChoice.")
        newAccount = when(userChoice) {
            1 ->{
                "Debit"
            }
            2-> {
                "Credit"
            }
            3 -> {
                "Checking"
            }
            else -> {
                continue
            }
        }
    }
    println("You have created a $newAccount account.")

}
fun startScreen(){
    println("Welcome to Ash Banking System")
    println("What type of account would you like to create ?")
    println("1.     Debit Account")
    println("2.     Credit Account")
    println("3.     Checking Account")
}