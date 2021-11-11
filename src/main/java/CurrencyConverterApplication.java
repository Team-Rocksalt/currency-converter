import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A simple application that converts amount values between different currencies.
 */
public class CurrencyConverterApplication {

    private static InputStream reader = System.in;
    private static PrintStream output = System.out;

    private static Map<String, Double> currencyConversionMap = new HashMap<>();

    static {
        currencyConversionMap.put("EUR->USD", 1.14d);
        currencyConversionMap.put("USD->EUR", 0.87d);
        currencyConversionMap.put("EUR->GBP", 0.85d);
        currencyConversionMap.put("GBP->USD", 1.34d);
        currencyConversionMap.put("USD->GBP", 0.74d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(reader);

        output.println("$$$ Welcome to the Currency Converter application $$$");
        output.print("1. Enter the SOURCE currency code (allowed values: USD, EUR or GBP): ");
        String sourceCurrency = scanner.next();

        output.print("2. Enter the TARGET currency code (allowed values: USD, EUR or GBP): ");
        String targetCurrency = scanner.next();

        output.print("3. Enter the AMOUNT in source currency code to be converted (use '.' as a decimal separator): ");
        String amount = scanner.next();

        double conversionFactor = currencyConversionMap.get(sourceCurrency + "->" + targetCurrency);

        double convertedAmount = Double.valueOf(amount);

        output.println(amount + " " + sourceCurrency + " = " + convertedAmount + " " + targetCurrency);
    }
}
