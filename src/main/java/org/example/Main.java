package org.example;

public class Main {
    public static void main(String[] args) {
        int passwordLength = 12;
        PasswordGenerator passwordGenerator = new PasswordGenerator(passwordLength);
        String generatedPassword = passwordGenerator.generatePassword();
        System.out.println("It Generated Password for your Email : " + passwordGenerator.getEmail() + "\n Your Password : " + generatedPassword);
    }
}