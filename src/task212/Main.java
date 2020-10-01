package task212;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<>();

        for(int i = 0; i<100; i++){
            int rnd = 1 + (int) (Math.random() * 100);
            productsList.add(new Product(rnd, "Product"+rnd, "Product N"+i));
        }

        Product[] products = new Product[productsList.size()];
        products = productsList.toArray(products);
        for (Product p:products) {
            System.out.print(p.getName()+" ");
        }

        quickSort(products,0, products.length-1);
        System.out.println();
        for (Product p:products) {
            System.out.print(p.getName()+" ");
        }
    }

    public static void quickSort(Product[] products, int beg, int end){
        if(beg<end){
            int pivot = partition(products,beg,end);
            quickSort(products,beg,pivot-1);
            quickSort(products,pivot+1,end);
        }
    }

    public static int partition(Product[] products, int beg, int end){
       int pivot = products[end].getPrice();
       int i = beg;
       for(int j = beg; j<end;j++){
            if(products[j].getPrice()<=pivot){
                swap(products, j, i);
                i++;
            }
       }
        swap(products, end, i);
        return i;
    }

    private static void swap(Product[] products, int end, int i) {
        Product p = products[i];
        products[i] = products[end];
        products[end] = p;
    }
}
