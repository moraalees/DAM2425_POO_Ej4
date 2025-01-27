class Coche (
    val marca: String,
    val modelo: String )
{

    var color: String = ""
        set(value) {
            require(color.isEmpty()){ "El color no puede ser nulo." }
            field = value
        }

    var nCaballos: Int = 0
        set(value){
            require(value in 70..700){ "El nº de caballos debe oscilar entre 70 y 700." }
            field = value
        }

    var nPuertas: Int = 0
        set(value){
            require(value in 3..5){ "El nº de puertas debe oscilar entre 3 y 5." }
            field = value
        }

    var matricula: String = ""
        set(value){
            require(value.length == 7){ "Matrícula debe ocupar 7 caracteres." }
            field = value
        }

    init{
        marca.replaceFirstChar { it.uppercase() }
        modelo.replaceFirstChar { it.uppercase() }
    }

    fun cambiarColor(color: String){
        this.color = color
        println("¡Color actualizado! ($color)")
    }

    fun cambiarNCaballos(nCaballos: Int){
        this.nCaballos = nCaballos
        println("¡Nº de caballos actualizado! ($nCaballos)")
    }

    fun cambiarNPuertas(nPuertas: Int){
        this.nPuertas = nPuertas
        println("¡Nº de puertas actualizado! ($nPuertas)")
    }

    fun cambiarMatricula(matricula: String){
        this.matricula = matricula
        println("Matrícula actualizada! ($matricula)")
    }

    override fun toString(): String {
        return "Marca: $marca, Modelo: $modelo, Color: $color, NumCaballos: $nCaballos, NumPuertas: $nPuertas, Matrícula: $matricula"
    }
}