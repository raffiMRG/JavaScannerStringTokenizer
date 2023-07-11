import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // untuk chek apakah ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); //true

        // untuk membaca data dengan pemisah/delimiter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); //false

        // menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringTokenizer = new StringTokenizer(data, ",");

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        bufferedReader.close();
        fileInput.close();

    }

}
