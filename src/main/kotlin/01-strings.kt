// All this underneath is yours to change
val you = "" // What's your name?

fun thisLanguage(): String {
  TODO("Which programming language is this?")
}

fun main(args: Array<String>) {
  println("Hi " + you)
  println("You've stumbled upon the " + thisLanguage() + " World Tour!")

//  TODO( "The Haiku shouldn't have so much whitespace…")
  println("Haiku is the brevity of wit. Whitespace is brief.")
  println(haiku)
}

// You're not allowed to change any of these:
val thisLanguage = "Kotlin"
val haiku = """Don’t just mirror me
      as if we were both two halves
        of the same melon.
"""
