package org.example;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private final int passwordLength;
    private String email;

    public String getEmail() {
        return email;
    }

    public PasswordGenerator(int passwordLength) {
        this.passwordLength = passwordLength;
        this.email = enterEmail();
    }

    public String enterEmail() {
        System.out.println("Enter your email address: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        return email;
    }

    public String generatePassword() {
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";

        String allCharacters = uppercaseChars + lowercaseChars + numbers + specialChars;
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

}