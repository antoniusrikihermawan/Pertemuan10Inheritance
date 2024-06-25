/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pboinheritance;

/**
 *
 * @author DKID
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Contoh Game Tebak Angka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
        
        // Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
