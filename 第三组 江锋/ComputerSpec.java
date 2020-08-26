import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ComputerSpec {
    private Map<String,Object> properties;
    public ComputerSpec(Map Properties){
        if (Properties == null){
            this.properties = new HashMap<>();
        }else{
            this.properties = new HashMap<>(Properties);
        }
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map getProperties(){
        return properties;
    }

    public boolean matches(ComputerSpec otherSpec){
        for(Iterator i=otherSpec.getProperties().keySet().iterator();i.hasNext();){
            String propertyName = (String) i.next();
            if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
                return false;
            }
        }
        return true;
    }

}
