package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Practice7 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner userImput = new Scanner(System.in);

        int N = 3;

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= N; i++){
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Common, imported or used (c/i/u)? ");
            char response = userImput.next().charAt(0);
            userImput.nextLine();
            System.out.print("Name: ");
            String name = userImput.nextLine();
            System.out.print("Price: ");
            double price = userImput.nextDouble();
            userImput.nextLine();

            switch (response){
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = userImput.nextDouble();
                    userImput.nextLine();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String stringDate = userImput.nextLine();
                    SimpleDateFormat format = new SimpleDateFormat("(dd/mm/yyyy)");
                    try{
                        Date manufactureDate = format.parse(stringDate);
                        products.add(new UsedProduct(name, price, manufactureDate));
                    }
                    catch (Exception e) {
                        System.out.println("Error!");
                    }
                    break;
                default:
                    System.out.println("Invalid char!");
                    break;
            }

            System.out.println("Price Tags:");
            for (Product product : products){
                product.priceTag();
            }
        }
    }
}
