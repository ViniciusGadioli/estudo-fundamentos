package fundamentos

class Carro(var cor: String, var anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int){

}

fun main() {
    var carro = Carro(cor = "vermelho", anoFabricacao = 2020, Dono(nome = "Vinicius", idade = 24))

    carro.cor = "preto"
    println(carro.anoFabricacao)
    println(carro.dono)
    println(carro.dono.nome)

}