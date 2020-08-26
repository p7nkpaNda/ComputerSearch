import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;

public class Inventory {
    private List<Computer> inventory;
    public Inventory(){
        inventory = new LinkedList<>();
    }
    public void addComputer(String serialNumber,double price,ComputerSpec spec){
        Computer computer =new Computer(serialNumber,price,spec);
        inventory.add(computer);
    }

    public Computer get(String serialNumber){
        for (Iterator i = inventory.iterator();i.hasNext();){
            Computer computer = (Computer) i.next();
            if(computer.getSerialNumber().equals(serialNumber)){
                return computer;
            }
        }
        return null;

    }

    public List search(ComputerSpec searchSpec){
        List matchingComputers = new LinkedList();
        for (Iterator i = inventory.iterator();i.hasNext();){
            Computer computer = (Computer) i.next();
            if(computer.getSpec().matches(searchSpec)){
                matchingComputers.add(computer);
            }
        }
        return matchingComputers;
    }
}
