import scala.io.StdIn

def getInput(args: Array[String]): String = {
  if (args.length == 1) {
    args(0)
  } else {
    println("Please enter an integer:")
    StdIn.readLine()
  }
}

def processInput(input: String): Unit = {
  val number = input.trim.toInt

  val isMultipleOfThree: Int => Boolean = _ % 3 == 0
  val isMultipleOfFive: Int => Boolean = _ % 5 == 0

  val message = (number: Int) match {
    case _ if isMultipleOfThree(number) && isMultipleOfFive(number) => "Multiple of Both Three and Five"
    case _ if isMultipleOfThree(number) => "Multiple of Three"
    case _ if isMultipleOfFive(number) => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  println(message)
}

def main(args: Array[String]): Unit = {
  val input = getInput(args)
  processInput(input)
}
