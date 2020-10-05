package edu.umsl;

import org.apache.commons.codec.binary.Base64;
import lombok.Getter;
import java.util.Scanner;

@Getter
public class base64conversion {
    private final String decodedToEncoded;
    private final String encodedToDecoded;

    public base64conversion(String decodedString, String encodedString) {
        this.encodedToDecoded = encodedString;
        this.decodedToEncoded = decodedString;
    }

    public String decodeConversion() {
        byte[] decodedBytes = Base64.decodeBase64(encodedToDecoded);
        return new String(decodedBytes);
    }

    public String encodeConversion() {
        byte[] encodedByte = decodedToEncoded.getBytes();
        return Base64.encodeBase64String(encodedByte);
    }

    public static void main(String args[]) {// Needed string
        String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to encode: "); // User input to encode into Base64
        String decodedString = input.nextLine();

        base64conversion base64 = new base64conversion(decodedString, encodedString);

        System.out.println("The encoded string is: " + base64.encodeConversion() + "\n");
        System.out.println("The code for the project is: " + base64.encodedToDecoded);
        System.out.println("The code translates to:  " + base64.decodeConversion());
    }
}
