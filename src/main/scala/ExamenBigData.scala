object ExamenBigData {

  // la fonction qui prend en parametre une liste de valeurs text et retourne une liste des valeurs qui se terminent par n
  def retournListe(list: List[String]) : List[String] ={
    val liste2 = list.filter(l => l.endsWith("n"))
    return  liste2
  }

  def liste_double() : Unit ={
    val tab : Map[String,String] = Map(
      "ecommercemag.fr" -> "",
      "https://www.journalducm.com/contact/" -> "Payant",
      "https://www.zatsaz.com/" -> "",
      "https://www.lerevenu.com/" -> "",
      "https://www.cadre-dirigfdeant-magazine.com/" -> "Payant",
      "https://www.silicon.fr/services/contact#annoncer" -> "Payant",
      "https://www.channelbiz.fr/nous-contacter/" -> "",
      "https://www.itespresso.fr/" -> "",
      "https://www.industrie-mag.com/article4.html/" -> "invité",
      "https://www.jesuissundev.com/article-invite/" -> "invité",
      "https://www.numerama.com/" -> ""
    )

    val secondeTab  = tab.map(l => {
      if (l._1.startsWith("https://www.")){ (l._1.substring(12).split("/")(0),l._2) }
      else{ (l._1.split("/")(0), l._2)}
    }).foreach(l =>println(l))
  }





  def main(args: Array[String]): Unit = {
    // test de la fonction
    val liste = retournListe(List("Julien", "Paul", "Jean", "rac", "trec", "joel", "ed", "chris", "maurice"))
    liste.foreach(l =>println(l))
    liste_double()


  }
}
