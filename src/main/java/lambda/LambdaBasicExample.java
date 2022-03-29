package lambda;

import java.util.Arrays;

public class LambdaBasicExample {
    public static void main(String[] args) {
        String[] fruits = {"cherry", "banana", "coconut", "apple"};

        Arrays.sort(fruits, (x, y) -> x.compareToIgnoreCase(y));
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        String[] companies = {"samsung", "tesla", "bmw"};
        Arrays.sort(companies, String::compareToIgnoreCase);
        for (String company: companies) {
            System.out.println(company);
        }
    }
}
