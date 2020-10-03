package edu.umsl;

import org.apache.commons.codec.binary.Base64;
import java.util.Scanner;


public class base64conversion {
    public static void main(String args[]) {
    String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y"; // Needed string
    byte[] decodedBytes = Base64.decodeBase64(encodedString); // Decode using the apache base 64 conversion
    String decodedString = new String(decodedBytes); // Turn into a string
    System.out.println("The code for the project is: " + encodedString);
    System.out.println("The code translates to:  " + decodedString + "\n");

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string to encode: "); // User input to encode into Base64
    String stringToEncode = input.nextLine();
    byte[] encodedByte = stringToEncode.getBytes();

    String finalString = Base64.encodeBase64String(encodedByte); // Encode the string
    System.out.println("The encoded string is: " + finalString);
    }
}
