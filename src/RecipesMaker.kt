import model.Recetario

    val recetas = mutableMapOf<String, MutableList<String>>()

    fun main(){
        println(":: Bienvenido a Recipe Maker ::")
        val bienvenida = """Selecciona la opción deseada
                            1. Hacer una receta
                            2. Ver mis recetas
                            3. Salir""".trimIndent()

        do {
            println()
            println(bienvenida)

            val entrada: String? = readLine()
            when (entrada) {
                "1" -> {
                    makeRecipes(recetas)
                }
                "2" -> {
                    viewRecipes(recetas)
                }
                "3" -> {
                    //Salir
                    println("\n¡Hasta luego!\n")
                    recetas.clear()
                }
                else -> { // Opción default
                    println("\nDigita una opción válida... entre el 1 y el 3\n")
                }
            }
        }while (!entrada.equals("3"))
    }

    fun makeRecipes(recetaIn: MutableMap<String, MutableList<String>>){

        println("\nEscriba un titulo para su receta\n")
        val nombreReceta = readLine().toString()

    val listaIngredientes = mutableListOf<String>()
        do {
            //1. Hacer una receta

            println()
            val menuIngredientes = """
                Elija la categoria para agregar ingredientes a su receta:

                1. Agua
                2. Leche
                3. Carnes
                4. Verduras
                5. Frutas
                6. Cereales
                7. Huevos
                8. Aceites
                9. Guardar receta y volver al menu anterior
                0. Volver al menu anterior
            """.trimIndent()
            println("\n"+menuIngredientes+"\n")

            val entradaIngredientes = readLine().toString()

            when(entradaIngredientes){
                "1" -> {

                    println("Digita la cantidad de agua en litros...")
                    val entradaAgua = readLine().toString()
                    val nAgua = Recetario("Litro(s)", entradaAgua.toDouble())
                    nAgua.agregarAgua(nAgua.listarAgua())
                    listaIngredientes.add("${nAgua.listarAgua()} $entradaAgua ${nAgua.unidad} ")
                }
                "2" -> {
                    println("Digita la cantidad de leche en litros...")
                    val entradaLeche = readLine().toString()
                    val nLeche = Recetario("Litro(s)",entradaLeche.toDouble())
                    println("Elija el tipo de leche")
                    for ((i, v) in nLeche.listarLeche().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeLeche = readLine().toString()
                    if (!nLeche.listarLeche().get(tipoDeLeche.toInt()).isEmpty()){
                        nLeche.agregarLeche(nLeche.listarLeche().get(tipoDeLeche.toInt()))
                        listaIngredientes.add("${nLeche.listarLeche().get(tipoDeLeche.toInt())} ${nLeche.cantidad} ${nLeche.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "3" -> {
                    println("Digita la cantidad de carne en gramos...")
                    val entradaCarne = readLine().toString()
                    val nCarne = Recetario("Gramo(s)",entradaCarne.toDouble())
                    println("Elija el tipo de carne")
                    for ((i, v) in nCarne.listarCarnes().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeCarne = readLine().toString()
                    if (!nCarne.listarCarnes().get(tipoDeCarne.toInt()).isEmpty()){
                        nCarne.agregarCarne(nCarne.listarCarnes().get(tipoDeCarne.toInt()))
                        listaIngredientes.add("${nCarne.listarCarnes().get(tipoDeCarne.toInt())} ${nCarne.cantidad} ${nCarne.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "4" -> {
                    println("Digita la cantidad de verdura en unidades...")
                    val entradaVerdura = readLine().toString()
                    val nVerdura = Recetario("Unidad(es)", entradaVerdura.toDouble())
                    println("Elija el tipo de verdura")
                    for ((i, v) in nVerdura.listarVerduras().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeVerdura = readLine().toString()
                    if (!nVerdura.listarVerduras().get(tipoDeVerdura.toInt()).isEmpty()){
                        nVerdura.agregarVerdura(nVerdura.listarVerduras().get(tipoDeVerdura.toInt()))
                        listaIngredientes.add("${nVerdura.listarVerduras().get(tipoDeVerdura.toInt())} ${nVerdura.cantidad} ${nVerdura.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "5" -> {
                    println("Digita la cantidad de fruta en unidades...")
                    val entradaFruta = readLine().toString()
                    val nFruta = Recetario("Unidad(es)", entradaFruta.toDouble())
                    println("Elija el tipo de verdura")
                    for ((i, v) in nFruta.listarFrutas().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeFruta = readLine().toString()
                    if (!nFruta.listarFrutas().get(tipoDeFruta.toInt()).isEmpty()){
                        nFruta.agregarFruta(nFruta.listarFrutas().get(tipoDeFruta.toInt()))
                        listaIngredientes.add("${nFruta.listarFrutas().get(tipoDeFruta.toInt())} ${nFruta.cantidad} ${nFruta.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "6" -> {
                    println("Digita la cantidad de cereal en gramos...")
                    val entradaCereal = readLine().toString()
                    val nCereal = Recetario("Gramo(s)", entradaCereal.toDouble())
                    println("Elija el tipo de verdura")
                    for ((i, v) in nCereal.listarCereales().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeCereal = readLine().toString()
                    if (!nCereal.listarCereales().get(tipoDeCereal.toInt()).isEmpty()){
                        nCereal.agregarCereal(nCereal.listarCereales().get(tipoDeCereal.toInt()))
                        listaIngredientes.add("${nCereal.listarCereales().get(tipoDeCereal.toInt())} ${nCereal.cantidad} ${nCereal.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "7" -> {
                    println("Digita la cantidad de huevo en unidades...")
                    val entradaHuevo = readLine().toString()
                    val nHuevo = Recetario("Unidad(es)", entradaHuevo.toDouble())
                    println("Elija el tipo de verdura")
                    for ((i, v) in nHuevo.listarHuevos().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeHuevo = readLine().toString()
                    if (!nHuevo.listarHuevos().get(tipoDeHuevo.toInt()).isEmpty()){
                        nHuevo.agregarHuevo(nHuevo.listarHuevos().get(tipoDeHuevo.toInt()))
                        listaIngredientes.add("${nHuevo.listarHuevos().get(tipoDeHuevo.toInt())} ${nHuevo.cantidad} ${nHuevo.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "8" -> {
                    println("Digita la cantidad de aceite en litros...")
                    val entradaAceite = readLine().toString()
                    val nAceite = Recetario("Litro(s)", entradaAceite.toDouble())
                    println("Elija el tipo de verdura")
                    for ((i, v) in nAceite.listarAceite().withIndex()){
                        println("$i: $v")
                    }
                    val tipoDeAceite = readLine().toString()
                    if (!nAceite.listarAceite().get(tipoDeAceite.toInt()).isEmpty()){
                        nAceite.agregarAceite(nAceite.listarAceite().get(tipoDeAceite.toInt()))
                        listaIngredientes.add("${nAceite.listarAceite().get(tipoDeAceite.toInt())} ${nAceite.cantidad} ${nAceite.unidad}")
                    }else{
                        println("La opción elegida no está disponible...")
                    }

                }
                "9" -> {
                    recetaIn.put(nombreReceta, listaIngredientes)
                    main()
                }
                "0" ->{
                    main()
                }
                else -> println("Digite una opción válidad...")
            }
        }while (!entradaIngredientes.equals("9") || !entradaIngredientes.equals("0"))
    }


    fun viewRecipes(recetaIn: MutableMap<String, MutableList<String>>){
        do {
            println()
            val menu2 = """
                    Desea buscar una receta por el nombre almacenado o listar todas:
                    1. Buscar por nombre
                    2. Listar todas
                    3. Volver al menu anterior
                """.trimIndent()
            println(menu2)
            val menuOption = readLine().toString()
            when (menuOption){
                "1" ->{
                    println("Escriba el nombre de la receta a contirnuación...")
                    val tituloReceta = readLine().toString()
                    if (tituloReceta in recetaIn.keys){
                        println("\nSu receta $tituloReceta consta de los siguientes ingredientes: ")
                        recetaIn.getValue(tituloReceta).forEach { println(it)}
                    }else{
                        println("La receta buscada no existe aún...")
                    }
                }
                "2" -> {
                    if (recetaIn.isEmpty()){
                        println("Recetario vacio...")
                    }else{
                        for (k in recetaIn.keys){
                            println("\n"+k)
                            if (k in recetaIn.keys){
                                recetaIn.getValue(k).forEach { println(it)}
                            }
                        }
                    }

                }
                "3" -> main()
                else -> {
                    println("Elija una opción válida...")
                }
            }
        }while (!menuOption.equals("3"))
    }