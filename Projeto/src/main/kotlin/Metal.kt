class Metal(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String = ("Latas de alumínio, Latas de aço, Tampas, Ferragens, " +
            "Canos, Molduras de quadros Tampinhas de garrafas,Enlatados, Panelas SEM cabo," +
            " Ferragens, Arames, Chapas, Canos, Pregos, Cobre, Embalagem de marmitex, Papel " +
            "alumínio limpo, Aerossóis\n")
    override var nreciclavel: String = ("Clipes, Grampos, Esponja de aço, Latas de inseticidas," +
            " Latas de verniz, Latas de solventes químicos \n")

    fun calculadorametal() {
        println("-----TABELA DE PREÇOS-----")
        println("-----Cobre:    R$20.00-----")
        println("-----Alumínio: R$05.00-----")
        println("-----Ferro:    R$01.00-----")


        println(
            "Escolha o tipo de metal:" +
                    "\n1 - Cobre" +
                    "\n2 - Alumínio" +
                    "\n3 - Ferro"
        )
        var opc = readln().toInt()

        when (opc) {
            1 -> {
                var precokg = 20.00
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")

            }
            2 -> {
                var precokg = 5.00
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")
            }
            3 -> {
                var precokg = 1.00

                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.\n\n")
            }
        }
    }
}