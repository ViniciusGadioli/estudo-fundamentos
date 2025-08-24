package fundamentos

fun main() {
    println(parOuImpar(3))
    println(resultadoFinal(6))

}

fun parOuImpar(numero: Int){
    if (numero % 2 == 0){
        println("O número ${numero} é par")
    } else {
        println("O número ${numero} é impar")
    }
}

fun resultadoFinal(nota: Int){
    if (nota >= 7){
        println("Aprovado")
    } else if (nota >= 5){
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}