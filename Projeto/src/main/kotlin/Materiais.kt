abstract class Materiais (
    var reciclavel: Boolean,
    var nocivo: Boolean,

        ) {
    open var reciclável: String = ("")
    open var nreciclável: String = ("")
    open

    fun exibirLista(reciclaveis: Boolean) {
        if (reciclaveis) {
            var listr: List<String> = listOf(*reciclável.split(", ").toTypedArray())
            listr.forEach(){
                println(it)
            }

        }else{
            var listnr: List<String> = listOf(*nreciclável.split(", ").toTypedArray())
            listnr.forEach() {
                println(it)
            }

        }
    }
}

