import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmenyek
{
    private List<Festmeny> festmenyek;

    public Festmenyek(Festmeny[] festmenyTomb)
    {
        this.festmenyek = new ArrayList<>();
        this.festmenyek.addAll(Arrays.asList(festmenyTomb));
    }


}
