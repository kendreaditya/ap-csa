// Aditya Kendre
// Dice class
// 5-1-2019
import java.util.Random;

public class Dice {
 Random rand = new Random();
 private int diceSide;
 
 public Dice()
 {
  diceSide = 6;
 }
 
 public Dice(int diceSide)
 {
  this.diceSide = ((diceSide == 4 ||
    diceSide == 6 ||
    diceSide == 8 ||
    diceSide == 10 ||
    diceSide == 12 ||
    diceSide == 20) ? diceSide : 6);
 }
 
 public void setDiceSide(int newDiceSide)
 {
  this.diceSide = ((newDiceSide == 4 ||
    newDiceSide == 6 ||
    newDiceSide == 8 ||
    newDiceSide == 10 ||
    newDiceSide == 12 ||
    newDiceSide == 20) ? newDiceSide : 6);
 }
 
 public int roll()
 {
  return rand.nextInt(diceSide)+1;
 }
 
 public void roll(int rolls)
 {
  for(int x = 1; x < rolls; x++)
    System.out.print((rand.nextInt(diceSide)+1)+", ");
  System.out.print(rand.nextInt(diceSide)+1);
 }
 
 public int getDiceSide()
 {
  return diceSide;
 }
 
 public String toString()
 {
  return "This is a "+this.diceSide+" sided die";
 }
}
