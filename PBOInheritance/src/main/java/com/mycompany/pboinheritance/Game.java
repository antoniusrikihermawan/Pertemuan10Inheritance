/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pboinheritance;

/**
 *
 * @author DKID
 */

import java.util.Random;
import java.util.Scanner;

public class Game {
    int secretNumber;
    private int guessLimit;

    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public void generateNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; // Contoh: 1-100
    }
    
    public int getGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tebakan Anda (1-100): ");
        return scanner.nextInt();
    }

    public String checkGuess(int guess) {
        if (guess == secretNumber) {
        return "Benar!";
        } else if (guess > secretNumber) {
        return "Terlalu tinggi, coba lagi!";
        } else {
        return "Terlalu rendah, coba lagi!";
        }
    }

    public void play() {
        generateNumber();
        int remainingGuesses = guessLimit;

        while (remainingGuesses > 0) {
            int guess = getGuess();
            String feedback = checkGuess(guess);
            System.out.println(feedback);

            if (feedback.equals("Benar!")) {
                break;
        }
    
            remainingGuesses--;
                System.out.println("Sisa tebakan: " + remainingGuesses);
    }

        if (remainingGuesses == 0) {
            System.out.println("Maaf, Anda kehabisan tebakan. Angka rahasia adalah: " + secretNumber);
            }
        }
    }
        //File NumberGuessing.java

class NumberGuessingGame extends Game {
    
    public NumberGuessingGame(int guessLimit) {
        super(guessLimit);
    }   

    @Override
    public void play() {
        super.play(); // Memanggil metode dari kelas base
        System.out.println("Terima kasih sudah bermain!");
    }
}
//File WordGuessing.java
class WordGuessingGame extends Game {
    private String[] words;
    
    public WordGuessingGame(int guessLimit, String[] words) {
        super(guessLimit);
        this.words = words;
    }
    @Override
    public void generateNumber() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        secretNumber = index; // Memperlakukan indeks sebagai nomor acak
    }

    @Override
    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "Benar! Anda menebak kata \"" + words[secretNumber] + "\"";
        } else if (guess > secretNumber) {
            return "Kata yang dicari ada di urutan alfabet yang lebih awal.";
        } else {
            return "Kata yang dicari ada di urutan alfabet yang lebih akhir.";
        }
    }
}


    
