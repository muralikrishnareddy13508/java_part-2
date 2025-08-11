import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman_game {
    public static void main(String[] args){

        //java Hangman game

        String filePath = "src/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("could not find file");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");

        while (wrongGuesses < 6){
            System.out.print(getHangmanArt(wrongGuesses));

            System.out.print("word: ");

            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("Correct guess");

                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("You Win!");
                    System.out.println("the word is: " + word);
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }
        }

        if (wrongGuesses >= 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("Game Over!");
            System.out.println("the word is: " + word);
        }
    }
    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       o
                      
                      
                      """;
            case 2 -> """
                       o
                       |
                      
                      """;
            case 3 -> """
                       o
                      /|
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
