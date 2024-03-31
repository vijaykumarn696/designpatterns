package prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    public Map<String,Student> map=new HashMap<>();

    public void add(String key,Student st)
    {
        map.put(key,st);
    }
    public Student get(String key)
    {
        return map.get(key);
    }

}
