public class DataTypeExample {
    public static void main(String[] args) {

        // 1. byte (1 byte, -128 to 127)
        byte Byte = 100;
        System.out.println("Byte: " + Byte);

        // 2. short (2 bytes, -32,768 to 32,767)
        short Short = 30000;
        System.out.println("Short: " + Short);

        // 3. int (4 bytes, -2 billion to +2 billion)
        int Int = 123456789;
        System.out.println("Int: " + Int);

        // 4. long (8 bytes, for very large numbers)
        long Long = 9876543210L; 
        System.out.println("Long: " + Long);

        // 5. float (4 bytes, single precision)
        float Float = 5.75f; 
        System.out.println("Float: " + Float);

        // 6. double (8 bytes, double precision)
        double Double = 19.99;
        System.out.println("Double: " + Double);

        // 7. char (2 bytes, single character)
        char Char = 'A';
        System.out.println("Char: " + Char);

        // 8. boolean (1 bit, true/false)
        boolean Boolean = true;
        System.out.println("Boolean: " + Boolean);

        // 9. String (non-primitive)
        String String = "Hello, Ajay!";
        System.out.println("String: " + String);
    }
}
