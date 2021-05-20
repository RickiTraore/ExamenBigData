object ExamenBigData {

  // la fonction qui prend en parametre une liste de valeurs text et retourne une liste des valeurs qui se terminent par n
  def retournListe(list: List[String]) : List[String] ={
    val liste2 = list.filter(l => l.endsWith("n"))
    return  liste2
  }

  def main(args: Array[String]): Unit = {
    // test de la fonction
    val liste = retournListe(List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice"))
    liste.foreach(l =>println(l))
  }
}
