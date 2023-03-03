import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

class Conversation {
  public static void main(String[] args) {
    // ask user to choose a number of rounds of conversation
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > transcript = new ArrayList < String > ();
    System.out.println("How many rounds?");
    int num_Rounds = scanner.nextInt();
    scanner.nextLine();

    // prints welcome and adds to the transcript ArrayList
    System.out.println("Welcome to Chatbot! What brings you here today?");
    transcript.add("TRANSCRIPT: ");
    transcript.add("Welcome to Chatbot! What brings you here today?");
    // loop for # of rounds
    for (int i = 0; i <= num_Rounds; i++) {
      // get user input 
      String user_Response = scanner.nextLine();
      transcript.add(user_Response);
      // sets hasMirror to false
      boolean hasMirror = false;

      // separate user's response by word and replace word if necessary; sets hasMirror to true if the response contains a mirror word
      String[] words = user_Response.split(" ");

      for (int x = 0; x < words.length; x++) {
        // replaces I to you
        if (words[x].equals("I")) {
          words[x] = words[x].replace("I", "you");
          hasMirror = true;
        }

        // replaces me to you
        else if (words[x].equals("me")) {
          words[x] = words[x].replace("me", "you");
          hasMirror = true;
        }

        // replaces am to are
        else if (words[x].equals("am")) {
          words[x] = words[x].replace("am", "are");
          hasMirror = true;
        }

        // replaces you to I
        else if (words[x].equals("you")) {
          words[x] = words[x].replace("you", "I");
          hasMirror = true;
        }

        // replaces my to your
        else if (words[x].equals("my")) {
          words[x] = words[x].replace("my", "your");
          hasMirror = true;
        }

        // replaces You to I
        else if (words[x].equals("You")) {
          words[x] = words[x].replace("You", "I");
          hasMirror = true;
        }

        // replaces are to am
        else if (words[x].equals("are")) {
          words[x] = words[x].replace("are", "am");
          hasMirror = true;
        }

        // replaces My to Your
        else if (words[x].equals("My")) {
          words[x] = words[x].replace("My", "Your");
          hasMirror = true;
        }

        // replaces your to my
        else if (words[x].equals("your")) {
          words[x] = words[x].replace("your", "my");
          hasMirror = true;
        }
      }
      String bot_feedback = String.join(" ", words);
      // if the bot's response contains mirror words the mirrored response is printed; otherwise a randomly selected canned response is printed
      if (hasMirror) {
        System.out.println(bot_feedback);
        transcript.add(bot_feedback);
      } else {
        Random random_response = new Random();
        String[] canned_responses = new String[] {
          "Oh wow.",
          "Thanks for telling me.",
          "Mhm."
        };
        String canned_response = canned_responses[random_response.nextInt(2)];
        System.out.println(canned_response);
        transcript.add(canned_response);
      }
    }
    // say Goodbye and prints each line of transcript
    System.out.println("Nice talking to you, have a good day!");
    transcript.add("Nice talking to you, have a good day!");
    for (int i = 0; i < transcript.size(); i++) {
      System.out.print(transcript.get(i) + "\n");
    }
    // close scanner
    scanner.close();
  }
}