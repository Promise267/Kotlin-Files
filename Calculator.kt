import java.util.Scanner
//calculator program in kotlin
fun main(args: Array<String>) {
    //declaring variable with equivalent data types
    //keyword variable: datatype
    val firstNumber: Double
    val secondNumber: Double
    val operator: Char
    val result: Int
    //scanner object
    val scan = Scanner(System.`in`)

    println("OPERATORS:")
    println("+ = ADDITION")
    println("- = SUBTRACTION")
    println("* = MULTIPLICATION")
    println("/ = DIVISION")
    //prompts user for operator
    print("ENTER OPERATOR : ")
    operator = scan.next().single();
    //prompts user for firstNumber
    print("\nENTER FIRST NUMBER : ")
    firstNumber = scan.nextDouble()
    //prompts user for secondNumber
    print("ENTER SECOND NUMBER : ")
    secondNumber = scan.nextDouble()

    when(operator){
        '+' -> {
            result = (firstNumber + secondNumber).toInt()
            println("The sum of $firstNumber and $secondNumber = $result")
        }
        '-' -> {
            result = (firstNumber - secondNumber).toInt()
            println("The difference of $firstNumber and $secondNumber = $result")
        }
        '*' -> {
            result = (firstNumber * secondNumber).toInt()
            println("The multiplication of $firstNumber and $secondNumber = $result")
        }
        '/' -> {
            result = (firstNumber / secondNumber).toInt()
            println("The division of $firstNumber and $secondNumber = $result")
        }
        else -> {
            println("OPERATOR DOESN'T EXISTS!")
        }
    }
}



