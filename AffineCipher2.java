package com.company;
import java.util.Scanner;

public class AffineCipher2 {


        public static void main(String[]Args){
            // Input block
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter PlainText: ");
            String input_string = sc.nextLine();
            String plaintext = input_string;

            // Output block
            String ciphertext = encrypt(plaintext);
            String decrypted = decrypt(ciphertext);
            System.out.println("Ciphertext: " + ciphertext);
            System.out.println("Decrypted text: " + decrypted);

        }

        public static String encrypt(String plaintext) {
            int k1 = 5;
            int k2 = 6;
            char[] ciphertext = new char[plaintext.length()];

            for (int i = 0; i < plaintext.length(); i++) {
                char character_check = plaintext.charAt(i);
                if (Character.isUpperCase(character_check)){
                    int k3 = plaintext.charAt(i) - 'A';
                    int encrypted = (k3 * k1 +k2) % 26;
                    ciphertext[i] = (char)(encrypted + 'A');

                } else {
                    int k3 = plaintext.charAt(i) - 'a';
                    int encrypted = (k3 * k1 +k2) % 26;
                    ciphertext[i] = (char)(encrypted + 'a');
                }
            }
            return new String(ciphertext);
        }

        public static String decrypt(String ciphertext) {
            int k1 = 5; // Multiplicative key
            int k2 = 6; // Additive key
            char[] plaintext = new char[ciphertext.length()];
            // Compute block for k1_inverse
            int k1_inverse = 0;
            for (int i = 0; i < 26; i++) {
                if ((k1 * i) % 26 == 1) {
                    k1_inverse = i;
                    break;
                }
            }

            for (int i = 0; i < ciphertext.length(); i++) {
                char character_check = ciphertext.charAt(i);
                if (Character.isUpperCase(character_check)){
                    int k3 = ciphertext.charAt(i) - 'A';
                    int decrypted = ((k3 - k2 + 26)* k1_inverse) % 26;
                    plaintext[i] = (char)(decrypted + 'A');

                } else {
                    int k3 = ciphertext.charAt(i) - 'a';
                    int decrypted = ((k3 - k2 + 26)* k1_inverse) % 26;
                    plaintext[i] = (char)(decrypted + 'a');
                }
            }
            return new String(plaintext);
        }
    }

