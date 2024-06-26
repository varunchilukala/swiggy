package pagination;

import java.util.ArrayList;
import java.util.List;

public class Dataservice {

    public List <String> getnames() {
        List<String> names = new ArrayList<>();

        for (int i=0; i<102; i++){
            names.add(String.valueOf(i));
        }
        return names;
    }
}
