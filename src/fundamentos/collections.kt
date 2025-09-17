package fundamentos

fun main(){
    val nomes_nao_mutaveis = listOf("Vinicius", "Maria", "João")
    val nomes_mutaveis = mutableListOf("Vinicius", "Maria", "João")
    val nomes_com_v = nomes_nao_mutaveis.filter { it.startsWith("V") }
    val valores_nao_duplicados = setOf(1, 2, 3, 4, 4)
    val valores_nao_duplicados_mutaveis = mutableSetOf(1, 2, 3)
    valores_nao_duplicados_mutaveis.add(3)
    nomes_mutaveis.add("Cleiton")
    println(nomes_mutaveis)
    nomes_mutaveis.removeAt(0)
    println(nomes_mutaveis)
    nomes_mutaveis.sort()
    println(nomes_mutaveis)
    println(valores_nao_duplicados)
    println(valores_nao_duplicados_mutaveis)
}