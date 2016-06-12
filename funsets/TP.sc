object TP {
 	
  type Word = String
  type Sentence = List[Word]
  type Occurrences = List[(Char, Int)]
  def wordOccurrences(w: Word): Occurrences = {
    val temp = w.toLowerCase() groupBy ( c => c )
    val temp2 = temp map (  x => (x._1 , x._2.length))
    
    temp2.toList sortBy (_._1)
  }                                               //> wordOccurrences: (w: TP.Word)TP.Occurrences
  
  val f = List("kamal", "chander", "gurala")      //> f  : List[String] = List(kamal, chander, gurala)
  
  val h = f.foldLeft("")( (x,y) => x ++ y)        //> h  : String = kamalchandergurala
  val g = "kamal"                                 //> g  : String = kamal
  
  val hw = wordOccurrences(h) toMap               //> hw  : scala.collection.immutable.Map[Char,Int] = Map(e -> 1, n -> 1, u -> 1,
                                                  //|  a -> 5, m -> 1, g -> 1, l -> 2, c -> 1, h -> 1, r -> 2, k -> 1, d -> 1)
  val gw = wordOccurrences(g) toMap               //> gw  : scala.collection.immutable.Map[Char,Int] = Map(a -> 2, k -> 1, l -> 1,
                                                  //|  m -> 1)
  
  hw('a')                                         //> res0: Int = 5
  
  
  
  
  
 	
 	

}