import java.util.Scanner;

import java.lang.String;

// import java.util.Random;
class Conversation {
  public static void main(String[] args) {
     // ask user to choose a number of rounds of conversation
    Scanner scanner = new Scanner(System.in);
    // String[] transcript;
    System.out.println("How many rounds?");
    int num_Rounds = scanner.nextInt();
    
    // print welcome
    System.out.println("Welcome to Chatbot! What brings you here today?");
    // loop for # of rounds
    for (int i = 0; i <= num_Rounds; i++) {
      // get user input
      String user_Response = scanner.nextLine();

      // separate user's response by word and replace word if necessary
      String[] words = user_Response.split(" ");
     
      for (int x = 0; x < words.length; x++) {
        // replaces I to you
        if (words[x].equals("I")) {
          words[x] = words[x].replace("I", "you");
        }

        // replaces me to you
        else if (words[x].equals("me")) {
          words[x] = words[x].replace("me", "you");
        }

        // replaces am to are
        else if (words[x].equals("am")) {
          words[x] = words[x].replace("am", "are");
        }

        // replaces you to I
        else if (words[x].equals("you")) {
          words[x] = words[x].replace("you", "I");
        }

        // replaces my to your
        else if (words[x].equals("my")) {
          words[x] = words[x].replace("my", "your");
        }

        // replaces You to I
        else if (words[x].equals("You")) {
          words[x] = words[x].replace("You", "I");
        }

        // replaces are to am
        else if (words[x].equals("are")) {
          words[x] = words[x].replace("are", "am");
        }

        // replaces My to Your
        else if (words[x].equals("My")) {
          words[x] = words[x].replace("My", "Your");
        }

        // replaces your to my
        else if (words[x].equals("your")) {
          words[x] = words[x].replace("your", "my");
        }
        else {
          words[x] = words[x];
        }
      }
      String bot_feedback = String.join(" ", words);
      System.out.println(bot_feedback);
      // if (bot_feedback.contains("I")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("you")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("me")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("am")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("my")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("My")) {
      //   System.out.println(bot_feedback);
      // }
      // else if (bot_feedback.contains("your")) {
      //   System.out.println(bot_feedback);
      // }
      // else {
      //   Random random_response = new Random();
      //   String[] canned_responses = new String[] {"Oh wow.", "Thanks for telling me.", "Mhm."}; 
      //   String canned_response = canned_responses[random_response.nextInt(2)];
      //   bot_feedback = canned_response;
      //   System.out.println(bot_feedback);
      // }

    }
  // say Goodbye
  System.out.println("Nice talking to you, have a good day!");
  System.out.println();
  
  // print transcript
  System.out.println("TRANSCRIPT");
  System.out.println("Welcome to Chatbot! What brings you here today?");
  
  // close scanner
  scanner.close();
  }
}

