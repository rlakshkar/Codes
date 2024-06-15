package Questions;

public class StringEncoderDecoder {
    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            encoded.append((char) (c + 1)); 
        }
        return encoded.toString();
    }

    public static String decode(String encoded) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encoded.toCharArray()) {
            decoded.append((char) (c - 1));
        }
        return decoded.toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String encodedString = encode(originalString);
        String decodedString = decode(encodedString);

        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}
