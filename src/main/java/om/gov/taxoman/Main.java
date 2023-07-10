package om.gov.taxoman;

import om.gov.taxoman.entity.Product;
import om.gov.taxoman.entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(12, "user", "pass");
        Product pro = new Product(11, "product", 12.550);

        System.out.println(user);
        System.out.println(pro);
    }
}