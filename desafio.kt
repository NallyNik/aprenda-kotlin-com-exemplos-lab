// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val id: Int, val nome: String, val sobrenome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: String) {
    companion object Conteudo {
        val listaConteudo = mutableListOf<ConteudoEducacional>()
        fun addConteudo (conteudo: ConteudoEducacional) {
            listaConteudo.add(conteudo)
        }
    }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    companion object Lista {
        val inscritos = mutableListOf<Usuario>()
        fun matricular(usuario: Usuario) {
        	inscritos.add(usuario)
    	}
    }
}

fun main() {
    val inteligenciaArtificial = ConteudoEducacional("inteligencia artificial", 500, "DIFICIL")
    val softSkills = ConteudoEducacional("soft skills", 100, "BASICO")

    val aluno1:Usuario = Usuario(1, "Adolpho", "Silva", 25)
    val aluno2 = Usuario(2, "Alice", "Maravilhas", 39)
    val aluno3 = Usuario(3, "Branco", "Coelho", 50)
    
	ConteudoEducacional.addConteudo(inteligenciaArtificial)
    ConteudoEducacional.addConteudo(softSkills)
    
    Formacao.matricular(aluno1)
    Formacao.matricular(aluno2)
    Formacao.matricular(aluno3)
        
    println(aluno1)
    println(aluno2.nome)
    println(softSkills)
    println(ConteudoEducacional.listaConteudo)
    println(Formacao.inscritos)
}