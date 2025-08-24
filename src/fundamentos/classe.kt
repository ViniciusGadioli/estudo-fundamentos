package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
    }
}

fun main() {
    val pessoa1 = Pessoa(nome = "vinicius", idade = 24)
    println(pessoa1)
}