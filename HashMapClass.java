import java.util.HashMap;

public class HashMapClass{
    public HashMap<String, String> makeTrackHash(HashMap<String, String> myHash, String track, String lyrics) {
        myHash.put(track, lyrics);
        return myHash;

    }


}