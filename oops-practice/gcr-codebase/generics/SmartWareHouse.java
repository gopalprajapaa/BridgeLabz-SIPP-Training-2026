import java.util.*;

abstract class WarehouseItem {

    String name;

    WarehouseItem(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}

class Electronics extends WarehouseItem{

    Electronics(String name){
        super(name);
    }
}

class Grocery extends WarehouseItem{

    Grocery(String name){
        super(name);
    }
}

class Furniture extends WarehouseItem{

    Furniture(String name){
        super(name);
    }
}

class Storage<T extends WarehouseItem>{

    List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}

class WarehouseUtil{

    public static void display(List<? extends WarehouseItem> list){

        for(WarehouseItem item:list)
            System.out.println(item);

    }
}

public class SmartWareHouse{

    public static void main(String[] args){

        Storage<Electronics> electronicStorage=new Storage<>();

        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Mobile"));

        WarehouseUtil.display(electronicStorage.getItems());

    }

}