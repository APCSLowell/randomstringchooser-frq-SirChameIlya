import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList <String> list;
  public RandomStringChooser(String[] wordList){
    list = new ArrayList <String>();
    for (int i = 0; i < wordList.length; i++){
      list.add(i, wordList[i]);
    }
  }
  public String getNext(){
    if (list.size() == 0){
      return "NONE";
    }
    return list.remove((int)(Math.random()*list.size()));
  }
  
}
