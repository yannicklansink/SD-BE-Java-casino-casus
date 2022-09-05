package novi;

import java.util.Scanner;

import novi.higherlower.HigherLowerGame;

public class Main {

    public static void main(String[] args) {

        /*
        De speler start het spel (je start de applicatie door het starten van de ‘main’ methode)
        Het spel kiest een willekeurig nummer tussen 0 en 100 dat geraden moet worden.
        Het spel zet het aantal gespeelde beurten op 0
        Het spel print de regel ‘Make a guess’
        De speler raadt een nummer
        Het spel hoogt het aantal gespeelde beurten op met 1
        Was het nummer te hoog? Het spel print de regel `That number is too high!` (terug naar stap 4)
        Was het nummer te laag? Het spel print de regel `That number is too low!` (terug naar stap 4)
        Komt het nummer overeen? Het spel print de regel `Correct! You guessed the number in x turns` waarbij x het aantal gespeelde beurten is. (het spel wordt gestopt)


         */
        Scanner inputScanner = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(inputScanner);

        game.playGame();
    }
}
