import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Список актёров");
        System.out.println("Jackie Chan");
        System.out.println("Michel Rodriges");
        System.out.println("Dwayne Douglas Johnson");

    }
    private static void film(){
       Films[] films = new Films[3];
       readJson();
    }
    public static void readJson(){
        String read = "";
        try{
            Path path = Paths.get("data/film.json");
            read = Files.readAllLines(path).get(0);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(read);

    }
    private static void listOfJackie(){
        System.out.println("Час пик 1-3");
        System.out.println("Шпион по соседству");
        System.out.println("Вокруг света за 80 дней");
    }
    private static void listMichel(){
        System.out.println("Avatar");
        System.out.println("Forsage 3");
        System.out.println("Forsage 4");
        System.out.println("Forsage 5");
        System.out.println("Forsage 6");
        System.out.println("Forsage 9");
    }
    private static void listDwayne(){
        System.out.println("Геракл");
        System.out.println("Forsage 3");
        System.out.println("Forsage 4");
        System.out.println("Forsage 5");
        System.out.println("Forsage 6");
    }
    private static void director(){
        System.out.println("Джеймс Кемерон");
    }
    private static void filmJames(){
        System.out.println("Avatar");
        System.out.println("Avatar 2");
        System.out.println("Titanic");
        System.out.println("Terminator");
        System.out.println("Abyss");
    }
    private static void filmLin(){
        System.out.println("Forsage 3");
        System.out.println("Forsage 4");
        System.out.println("Forsage 5");
        System.out.println("Forsage 6");
        System.out.println("Forsage 9");
    }
    private static void filmBret(){
        System.out.println("Час пик 1");
        System.out.println("Час пик 2");
        System.out.println("Час пик 3");
        System.out.println("Геракл");

    }
}