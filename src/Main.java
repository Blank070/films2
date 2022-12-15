import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Список актёров");
        System.out.println("Jackie Chan");
        System.out.println("Michel Rodriges");
        System.out.println("Dwayne Douglas Johnson");
        System.out.println("Список режиссёров");
        System.out.println("Lin Jastin");
        System.out.println("Brett Ratner");
        System.out.println("James Cameron");
        System.out.println("Сортировать фильм по году выпуска?");
        System.out.println("1 - да ");
        System.out.println("2 - нет");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        if(s==1){
            listYear();
        } else if (s == 2) {
            System.out.println("Желаете найти фильм по актеру?");
            System.out.println("1 - да ");
            System.out.println("2 - нет");
            BufferedReader ber = new BufferedReader(new InputStreamReader(System.in));
            int q = Integer.parseInt(br.readLine());
            if(q==1){
                search();
            } else if (q==2) {
                System.out.println("Желаете найти фильм по режиссёру?");
                System.out.println("1 - да ");
                System.out.println("2 - нет");
                BufferedReader er = new BufferedReader(new InputStreamReader(System.in));
                int w = Integer.parseInt(br.readLine());
                if (w==1){
                    director();
                } else if (w==2){

                }
            }
        }
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
    private static void search(){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if(Objects.equals(name, "Jackie")){
            listOfJackie();
        } else if (Objects.equals(name, "Michel")) {
            listMichel();
        } else if (Objects.equals(name, "Dwayne")) {
            listDwayne();
        } else {
            System.out.println("Неправильно ввели имя");
        }
        search();
    }
    private static void director() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if(Objects.equals(name, "Jastin")){
            filmLin();
        } else if (Objects.equals(name, "James")) {
            filmJames();
        } else if (Objects.equals(name, "Brett")) {
            filmBret();
        } else {
            System.out.println("Неправильно ввели имя");
        }
        director();
    }
        private static void listYear () {
            System.out.println("1984");
            System.out.println("Terminator");
            System.out.println("1989");
            System.out.println("Abyss");
            System.out.println("1997");
            System.out.println("Titanic");
            System.out.println("1998");
            System.out.println("Час пик 1");
            System.out.println("2001");
            System.out.println("Час пик 2");
            System.out.println("2004");
            System.out.println("Вокруг света за 80 дней");
            System.out.println("2006");
            System.out.println("Forsage 3");
            System.out.println("2007");
            System.out.println("Час пик 3");
            System.out.println("2009");
            System.out.println("Forsage 4");
            System.out.println("Avatar");
            System.out.println("2010");
            System.out.println("Шпион по соседству");
            System.out.println("2011");
            System.out.println("Forsage 5");
            System.out.println("2013");
            System.out.println("Forsage 6");
            System.out.println("2014");
            System.out.println("Геракл");
            System.out.println("2021");
            System.out.println("Forsage 9");
            System.out.println("2022");
            System.out.println("Avatar 2");

        }
}