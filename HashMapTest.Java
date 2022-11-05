import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<String, String> album = new HashMap<String, String>();
        HashMapClass mappy = new HashMapClass();

mappy.makeTrackHash(album,"Bawitdaba", "Bawidtaba a banga dang diggy diggy...");
mappy.makeTrackHash(album, "Holy Diver", "Holy Diver you've been down too long in the midnight sea oh...");
mappy.makeTrackHash(album, "Heart of Glass", "something something soon found out had a heart of glass");
mappy.makeTrackHash(album, "Bobby Brown Goes Down", "..My car is fast my teeth are shiny I tell all the girls they can kiss my hiney..");
System.out.println(album.get("Holy Diver"));

Set<String> keylist = album.keySet();
for (String key: keylist){
    System.out.println(key);
    System.out.println(album.get(key));
}


    }
}