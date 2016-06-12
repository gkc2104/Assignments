object TP {
 	
  type Word = String
  type Sentence = List[Word]
  type Occurrences = List[(Char, Int)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(296); 
  def wordOccurrences(w: Word): Occurrences = {
    val temp = w.toLowerCase() groupBy ( c => c )
    val temp2 = temp map (  x => (x._1 , x._2.length))
    
    temp2.toList sortBy (_._1)
  };System.out.println("""wordOccurrences: (w: TP.Word)TP.Occurrences""");$skip(48); 
  
  val f = List("kamal", "chander", "gurala");System.out.println("""f  : List[String] = """ + $show(f ));$skip(46); 
  
  val h = f.foldLeft("")( (x,y) => x ++ y);System.out.println("""h  : String = """ + $show(h ));$skip(18); 
  val g = "kamal";System.out.println("""g  : String = """ + $show(g ));$skip(39); 
  
  val hw = wordOccurrences(h) toMap;System.out.println("""hw  : scala.collection.immutable.Map[Char,Int] = """ + $show(hw ));$skip(36); 
  val gw = wordOccurrences(g) toMap;System.out.println("""gw  : scala.collection.immutable.Map[Char,Int] = """ + $show(gw ));$skip(13); val res$0 = 
  
  hw('a');System.out.println("""res0: Int = """ + $show(res$0))}
  
  
  
  
  
 	
 	

}
