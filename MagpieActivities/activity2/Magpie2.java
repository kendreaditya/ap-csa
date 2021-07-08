/**

What happens when a keyword is included in another word? Consider statements like “I know
all the state capitals” and “I like vegetables smothered in cheese.” Explain the problem with the
responses to these statements.

When the keyword in included in another word, the computer does not regonize that the list of charaters are in a word, and replies the statement for "no",
and "mother" because it found these words inside of words.
From the computer's perspective all it is doing is finding a list of letters in a list of letters. So it does not know its looking for words,
just letters that are in order.  
 */
public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  statement = statement.trim();
  if(statement.length() == 0)
  {
    response = "Say something, please.";
  }
  else if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf("dog") >= 0
    || statement.indexOf("cat") >= 0)
  {
   response = "Tell me more about your pets.";
  }
  else if (statement.indexOf("Ensmiger") >= 0)
  {
   response = "He sounds like a good teacher!";
  }
  else if (statement.indexOf("Zack") >= 0)
  {
   response = "Is he well!";
  }
  else if (statement.indexOf("car") >= 0)
  {
   response = "When did you get the car?";
  }
  else if (statement.indexOf("phone") >= 0)
  {
   response = "How old is the phone?";
  }
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 7;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
   response = "No way. What are you doing now.";
  }
  else if (whichResponse == 5)
  {
   response = "I am so confused.";
  }
  else if (whichResponse == 6)
  {
   response = "LOL";
  }
  return response;
 }
}
