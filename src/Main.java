import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Festmeny f1 = new Festmeny("proba1", "NiggaTron", "Transniggas");
        Festmeny f2 = new Festmeny("proba2", "OptimusPrimNigga", "Transniggas");
        Festmenyek festmenyek = new Festmenyek(new Festmeny[]{f1, f2});
        Scanner sc = new Scanner(System.in);
        Festmenyek festmenyek2 = null;

        System.out.print("Hany darab festmeny szeretnel hozzaadni?\n");
        int db = sc.nextInt();
        for (int i = 0 ; i < db; i++)
        {
            System.out.print("add meg a festmeny cimet\n");
            String ujcim =  sc.next();
            System.out.print("add meg a festmeny festojet\n");
            String ujfesto =  sc.next();
            System.out.print("add meg a festmeny stilusat\n");
            String ujstilus =  sc.next();
            Festmeny ujFestmeny = new Festmeny(ujcim, ujfesto, ujstilus);
            festmenyek.getFestmenyek().add(ujFestmeny);
        }

        try
        {
            festmenyek2 = new Festmenyek("festmenyek.txt");
            festmenyek.getFestmenyek().addAll(festmenyek2.getFestmenyek());
        }
        catch (FileNotFoundException e)
        {
            System.out.println("hiba festmenyek.txt nem talalhato");
        }
        catch (IOException e)
        {
            System.err.println("hiba");
        }

        System.out.println(festmenyek2);
        for (int i = 0; i < 20; i++)
        {
            festmenyek2.getFestmenyek().get(i);
        }



    }
}
