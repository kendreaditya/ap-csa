/**
 Iteration       psn       before       after
    1            9          " "          " "
    1            0          " "          " "
    1            8          " "          "c"
    2            19         " "          "s"   
    1            3          "k"          "w"    
    2            7          " "          "t"
    3            22         "s"          "w"
 */
public class StringExplorer
{
  
 public static void main(String[] args)
 {
  String sample = "The quick brown fox jumped over the lazy dog.";
  
  //  Demonstrate the indexOf method.
  int position = sample.indexOf("quick");
  System.out.println ("sample.indexOf(\"quick\") = " + position);
  
  //  Demonstrate the toLowerCase method.
  String lowerCase = sample.toLowerCase();
  System.out.println ("sample.toLowerCase() = " + lowerCase);
  System.out.println ("After toLowerCase(), sample = " + sample);
  
  //  Try other methods here:

 }

}
