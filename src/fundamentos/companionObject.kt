package fundamentos

class Pessoa1(
    var nome: String,
    var sexo: String,
    var idade: Int
){
    fun criarClasse1(): Pessoa1 {
        return Pessoa1("Vinicius", "M", 24)
    }
}

class Pessoa2(
    var nome: String,
    var sexo: String,
    var idade: Int
){
    companion object{
        fun criarClasse2(): Pessoa2 {
            return Pessoa2("Laura", "F", 24)
        }
    }
}

fun main(){
    var primeiraClasse = Pessoa1("Vinicius", "M", 24) //a classe ja tem uma função de criação. tem q passar valor ficticio pra criar o valor q eu quero
    var segundaClasse = Pessoa2.criarClasse2() // aqui da pra chamar o métod-o sem instanciar a classe (bem melhor mas depende)
    println(primeiraClasse)
    println(segundaClasse)
}