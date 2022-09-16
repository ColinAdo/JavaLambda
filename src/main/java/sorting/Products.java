package sorting;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Products {
    int id;
    String name;
    float price;
    Products(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        List<Products> goods = new ArrayList<>();
        goods.add(new Products(2, "soap", 1500));
        goods.add(new Products(3, "oil", 2000));
        goods.add(new Products(1, "tissue", 500));
// formula one
        Collections.sort(goods,(s,p)->{
            return s.name.compareTo(p.name);
        });
        for (Products product: goods) {
            System.out.println(product.id+","+ product.price+","+product.name);
        }
        Stream<Products> object = goods.stream()
                .filter(p->p.price > 1000);
                object.forEach( good -> System.out.println(good.name));

//formula two
         goods.stream()
                .filter(p->p.price > 1000)
                 .forEach( good -> System.out.println(good.name));
    }
}
