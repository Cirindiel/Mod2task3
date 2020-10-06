public class ProductsDisplay {
    public static void main(String[] args) {
        Products product1 = new Products();
        product1.productName = "Mleko";
        product1.manufacturer = "Mlekovita";
        product1.price = 2.5;

        Products product2 = new Products();
        product2.productName = "Czekolada";
        product2.manufacturer = "Wedel";
        product2.price = 2.19;

        System.out.print(product1.productName + " ");
        System.out.print(product1.manufacturer + " ");
        System.out.println(product1.price + "zł");
        System.out.print(product2.productName + " ");
        System.out.print(product2.manufacturer + " ");
        System.out.println(product2.price + "zł");
    }
}
