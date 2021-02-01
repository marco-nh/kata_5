/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5_is2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author usuario
 */
public class Histogram <T>{
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key){
        return this.map.get(key);
    }
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T key){
        this.map.put(key, map.containsKey(key)? this.map.get(key) + 1: 1);
    }
}
