/*
We have an interface Decoder which declares a method decode(String data) for decoding data.
We have two concrete decoder classes, Base64Decoder and URLDecoder, implementing the Decoder interface.
Each concrete decoder class provides its own implementation for the decode() method.
In the DecoderPatternExample class, we demonstrate how to use the Decoder pattern. We create instances of Base64Decoder and URLDecoder, and then use them to decode sample data.
This example illustrates how the Decoder pattern allows you to encapsulate decoding algorithms into separate classes, making it easy to add new decoders without modifying existing code.
 */
public class Main {
    public static void main(String[] args) {

        // Create a Base64 Decoder
        Decoder base64Decoder = new Base64Decoder();
        String base64Data = "c29tZSBkYXRhIGZvciBCYXNlNjQ=";
        String decodedBase64Data = base64Decoder.decode(base64Data);
        System.out.println(decodedBase64Data);

        // Create a URL Decoder
        Decoder urlDecoder = new URLDecoder();
        String urlData = "Hello%20World";
        String decodedURLData = urlDecoder.decode(urlData);
        System.out.println(decodedURLData);

        System.out.println("Decoder Design Pattern Example!");
    }
}