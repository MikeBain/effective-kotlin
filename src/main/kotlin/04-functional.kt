typealias Candidate = Pair<Int, String>

fun prep(value: Int): Candidate {
  return Candidate(value, value.toString())
}

fun fizz(value: Candidate): Candidate {
  return value
  TODO("Fizz for ints divisible by 3")
}

fun buzz(value: Candidate): Candidate {
  return value
  TODO("Fizz for ints divisible by 5")
}

fun others(value: Candidate) : Candidate {
  return value
  TODO("A number, otherwise")
}

fun answers(value: Candidate) = value.component2()

fun main(args: Array<String>) {
  val answers = (0..100)
      .map(::prep)
      .map(::fizz)
      .map(::buzz)
      .map(::others)
      .map(::answers)

  println(answers.joinToString("\n"))
}
