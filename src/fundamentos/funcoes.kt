package fundamentos

fun main() {
    println(parabiensMuchacho(24))
}

fun saludoMuchacho(nome: String): String {
    return "Hola ${nome}"
}

fun parabiensMuchacho(idade: Int){
    println(saludoMuchacho("vinicius") + " Feliz cumpleanos muchacho, estás haciendo ${idade} años?" )
}
