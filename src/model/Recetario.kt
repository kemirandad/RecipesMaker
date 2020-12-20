package model

class Recetario(unidad: String, cantidad: Double): Ingredientes(unidad, cantidad) {

    private val recetasIngredientes = mutableListOf<String>()
    fun listarRecetario():MutableList<String>{
        return recetasIngredientes
    }

    //Frutas
    private val frutas = mutableListOf("Fresa","Naranja","Banano","Pera","Uvas","Manzana")
    fun agregarFruta(fruta: String){
        this.recetasIngredientes += fruta
    }
    fun listarFrutas():MutableList<String>{
        return frutas
    }

    //Agua
    private val agua = "Agua"
    fun agregarAgua(agua: String){
        this.recetasIngredientes += agua
    }
    fun listarAgua():String{
        return agua
    }

    //Leches
    private val leches = mutableListOf("Leche Deslactosada","Leche Entera","Leche Descremada")
    fun agregarLeche(leche: String){
        this.recetasIngredientes += leche
    }
    fun listarLeche():MutableList<String>{
        return leches
    }

    //Aceites
    private val aceites = mutableListOf("Aceite de Oliva","Aceite de cocina")
    fun agregarAceite(aceite: String){
        this.recetasIngredientes += aceite
    }
    fun listarAceite():MutableList<String>{
        return aceites
    }

    //Verduras
    private val verduras = mutableListOf("Zanahoria","Lechuga","Pepino","Cebolla","Apio","Cebolla Larga","Ají")
    fun agregarVerdura(verdura: String){
        this.recetasIngredientes += verdura
    }
    fun listarVerduras():MutableList<String>{
        return verduras
    }

    //Carnes
    private val carnes = mutableListOf("Cerdo","Pollo","Pescado","Carne de res")
    fun agregarCarne(carne: String){
        this.recetasIngredientes += carne
    }
    fun listarCarnes():MutableList<String>{
        return carnes
    }

    //Cereales
    private val cereales = mutableListOf("Avena","Trigo","Maiz","Arroz")
    fun agregarCereal(cereal: String){
        this.recetasIngredientes += cereal
    }
    fun listarCereales():MutableList<String>{
        return cereales
    }

    //Huevos
    private val huevos = mutableListOf("Huevo criollo","Huevo de codorniz")
    fun agregarHuevo(huevo: String){
        this.recetasIngredientes += huevo
    }
    fun listarHuevos():MutableList<String>{
        return huevos
    }
}