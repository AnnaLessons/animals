abstract class Feline(val name: String,
                  val colorOfFur: String,
                  protected val colorOfEyes: String) {
    init {
        println("Сработал конструкор базового класса")
    }
}

