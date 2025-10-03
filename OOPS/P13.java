package OOPS;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
public class P13 {
    public static void main(String[] args) {       
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Prasat", 92);
        studentScores.put("Harsh", 85);
        studentScores.put("gyan", 98);
        studentScores.put("david", 77);
     
        System.out.println("Map Contents: " + studentScores);
        
        int mapSize = studentScores.size();
        
        System.out.println("Number of key-value mappings (size): " + mapSize);
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Mango");
        originalSet.add("Apple");
        originalSet.add("Banana");
        System.out.println("Original TreeSet (Set A): " + originalSet);
        @SuppressWarnings("unchecked")
        TreeSet<String> clonedSet = (TreeSet<String>) originalSet.clone();
        System.out.println("Cloned TreeSet (Set B): " + clonedSet);       
        originalSet.add("Grape");        
        System.out.println("\nAfter adding 'Grape' to Original Set A:");
        System.out.println("Original Set A: " + originalSet);
        System.out.println("Cloned Set B (unchanged): " + clonedSet);
    }
}
