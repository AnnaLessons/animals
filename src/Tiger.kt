

class Tiger(val sizeOfCanine: Short,
            name: String,
            colorOfFur: String,
            colorOfEyes: String) : Feline(name, colorOfFur, colorOfEyes) {
    init {
        println("Сработал конструктор производного класса")
        println(colorOfEyes)
    }
}