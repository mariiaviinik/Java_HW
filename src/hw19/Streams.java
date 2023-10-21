package hw19;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) throws NoCategoryException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(130.99, "Furniture", false));
        products.add(new Product(330.99, "Book", true));
        products.add(new Product(45.98, "Cosmetics", true));
        products.add(new Product(1000.99, "Electronics", true));
        products.add(new Product(90.99, "Cosmetics", false));
        products.add(new Product(1.0, "Book", true));
        products.add(new Product(67.0, "Book", true));
        products.add(new Product(210.99, "Healthcare", false));
        products.add(new Product(420.99, "Book", false));

        System.out.println("--------BOOKS MORE EXPENSIVE THAN 250-------");
        List<Product> books = products
                .stream()
                .filter(product -> product.getPrice() > 250 && product.getType() == "Book")
                .peek(System.out::println)
                .toList();

        System.out.println();
        System.out.println("------------BOOKS ON SALE------------");
        List<Product> productsWithDiscount = products
                .stream()
                .filter(product -> product.getType() == "Book" && product.isDiscount())
                .map(product -> new Product(product.getPrice(), product.getType(), false))
//                .map(product -> dfZero.format(product.getPrice()-product.getPrice()*0.1) + ", " + product.getType())
                .peek(System.out::println)
                .toList();

        System.out.println();
        System.out.println("----------THE CHEAPEST BOOK----------");
        Optional<Product> cheapestBook = Optional.ofNullable(products
                .stream()
                .filter(product -> product.getType() == "Book")
//                .map(product ->product.useDiscount())
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new NoCategoryException("Book")));
        cheapestBook.ifPresent(System.out::println);

        System.out.println();
        System.out.println("-------LAST 3 ADDED PRODUCTS---------");
        List<Product> last3Products = products
                .stream()
                .sorted((p1, p2) -> p1.getDateOfCreation().compareTo(p2.getDateOfCreation()) == 1 ? -1 : 1)
                .limit(3)
                .peek(System.out::println)
                .toList();

        System.out.println();
        System.out.println("--GENERAL BOOK PRICE OF THIS YEAR THAT CHEAPER THAN 75--");
        double generalBooksPrice = Math.round(products
                .stream()
                .filter(product -> product.getPrice() < 75 && product.getType() == "Book" && product.getDateOfCreation().getYear() == 2023)
                .map(product -> product.getPrice())
                .reduce(0.0, (a, b) -> a + b) * 100) / 100.0;
        System.out.println(generalBooksPrice);

        System.out.println();
        System.out.println("----------GROUP BY CATEGORY----------");
        List<Dictionary> groupedByTypeProducts = products
                .stream()
                .collect(Collectors.groupingBy(product -> product.getType()))
                .entrySet()
                .stream()
                .map(p -> new Dictionary(p.getKey(), p.getValue()))
                .toList();

        groupedByTypeProducts.stream().forEach(System.out::println);
    }
}
