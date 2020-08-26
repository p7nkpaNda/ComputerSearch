import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//SRP Inventory、ComputerType、ComputerSpec三个类中用到
public class ComputerSearch {
    static void initialzeInventory(Inventory inventory){
        ComputerType computertype = ComputerType.Laptop;
        Brand brand = Brand.XIAOMI;
        SubType subtype = SubType.Frivolous;
        ScreenSize screensize = ScreenSize.Medium;
        CPU cpu = CPU.AMD;
        Price price = Price.Medium;
        Map<String,Object> properties =new HashMap<>();
        properties.put("ComputerType",computertype);
        properties.put("Brand",brand);
        properties.put("Price",price);
        properties.put("SubType",subtype);
        properties.put("ScreenSize",screensize);
        properties.put("CPU",cpu);
        ComputerSpec spec = new ComputerSpec(properties);
        inventory.addComputer("01",4999,spec);


    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialzeInventory(inventory);

        Map properties = new HashMap();
        properties.put("Brand",Brand.XIAOMI);
        ComputerSpec clientSpec = new ComputerSpec(properties);

        List matchingComputers = inventory.search(clientSpec);
        if(!matchingComputers.isEmpty()){
            System.out.println("You might like these computer: ");
            for(Iterator i= matchingComputers.iterator();i.hasNext();){
                Computer computer = (Computer) i.next();
                ComputerSpec spec = computer.getSpec();
                System.out.println("We have a "+ spec.getProperty("ComputerType")+
                        " with the following properties:");
                for(Iterator j= spec.getProperties().keySet().iterator();j.hasNext();){
                    String propertyName = (String) j.next();
                    if(propertyName.equals("ComputerType")){
                        continue;
                    }
                    System.out.println("   "+propertyName+": "+ spec.getProperties());

                }
                System.out.println("  You can have this "+ spec.getProperty("ComputerType")
                + " for $" + computer.getPrice() + "\n---");
            }
        }else{
            System.out.println("Sorry!!");
        }




    }


}
