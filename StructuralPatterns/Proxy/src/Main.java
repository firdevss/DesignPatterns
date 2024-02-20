/*
We have an Image interface that defines the common method display().
We have a RealImage class, which is the real subject implementing the Image interface. It performs heavy tasks like loading an image from disk.
We have an ImageProxy class, which is a proxy for RealImage. It creates and controls access to the RealImage object. The proxy is responsible for creating the RealImage object only when it is required, thus providing lazy initialization.
In the ProxyPatternExample class, we demonstrate the use of both the RealImage and ImageProxy.
This example illustrates how the Proxy pattern provides a surrogate or placeholder for another object to control access to it. It is useful in scenarios where the creation of the real object is costly or resource-intensive, and you want to defer it until it is actually needed
 */
public class Main {
    public static void main(String[] args) {
        // Using RealSubject
        Image realImage = new RealImage("example.jpg");
        realImage.display();

        // Using Proxy
        ImageProxy imageProxy = new ImageProxy("example.jpg");
        imageProxy.display();

        System.out.println("Proxy Pattern Example");
    }
}