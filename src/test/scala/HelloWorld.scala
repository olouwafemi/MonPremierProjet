import Personne._
import scala.collection.immutable._
import scala.collection.mutable

import java.util.{Calendar, Date}
import java.text.SimpleDateFormat
object HelloWorld {

  val variable2 : String = ""

  def main(args: Array[String]): Unit = {

    val text : String = "Hello world, mon premier programme en scala."

    val text2 : String = text + variable2

    val test = println(text)

    test

    val Ella =  Personne("ODOUNHARO","Ella", 24, "Beninoise", Some(25000000))

    val Etudiant =  new Personne("ODOUNHARO","Raissa", 24, "Beninoise", None)

    val age_personne = renvoiePersonne("Femi", "ADEYE", "02/02/1997", "Béninoise", 25000).age



    println("L'age de la personne est de : " + age_personne)

    val somme = println("La somme est de : " + calculSomme(13, 20) )

    macollection()

    masequence()


  }

  def calculSomme(a : Int, b : Int) : Int = {
    var resultat = 0
    var i = 1
    if (a < 0 || b < 0){
      println("Valeurs d'argument incorrecte")
    }else {
      resultat = a + b
    }

    for (i <- 1 to 10){
      println("Compteur " + i)
    }

    while (i < 15){
      println("Itération " + i)
      i = i + 1
    }

    return resultat
  }

  def renvoiePersonne (N : String, P : String, A : String,Nat : String,  S : Double) : Personne = {

    var date : Date = new SimpleDateFormat("dd/MM/yyyy").parse(A)
    var c : Calendar = Calendar.getInstance()

    val yearAct = c.getWeekYear
    c.setTime(date)
    val yearNais = c.getWeekYear

    val Age : Int = yearAct - yearNais

    return (Personne (N, P, Age, Nat, Some(S)))



  }



  def macollection() : Unit = {
    val maliste = List ("jvc", "jj", "ecole", "idsi")

    val maliste2 : List[String] = List("Julien", "jvc", "Yasmine")

    maliste.foreach(l =>println(l.toUpperCase()))

    maliste2.foreach(l => {
      val var2 = l.toUpperCase()
    })
  }

  def masequence() : Unit = {
    val seq = Seq("Ysamine", "Stephane", "Sirabana", "Namory", "Oula", "Sery", "Marius", "Edoukou", "Cedarta", "Esther")

    val seq2 : Seq [Int] = seq.map(l => l.length)

    seq2.foreach(l => println(l))

    val seq3 : Seq [String] = seq.filter(l => l.length > 4)

    seq3.foreach(l => println(l))

    val monTuple = ("10", Personne("ODOUNHARO", "Eniola", 10, "Béninoise", None))

    val monMap : Map[String, String] = Map (
      "cc" -> "Cocody",
      "poy" -> "Yopougon",
      "abj" -> "Abidjan"
    )

    monMap.toList.foreach(l => println(l))

    monMap.keys.foreach(k => println(k))
    monMap.values.foreach(k => println(k))

    val monTableau : Array[String] = Array ("Julien", "Juvenal")

  }



}
