import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class program{

    public static void Wysw_pierwsze_el (ArrayList lista,int liczba){
        Collections.sort(lista);
        System.out.println("Wyswietlanie pierwszych elementów\n");
        for(int i = 0; i < liczba ; i++){
            System.out.println(lista.get(i));
        }
        System.out.println(" ");
    }

    public static void Wysw_ostatnie_el (ArrayList lista,int liczba){
        Collections.sort(lista);
        System.out.println("Wyswietlanie ostatnich elementów\n");
        for(int i = lista.size() - 1; i > liczba; i--)
        {
            System.out.println(lista.get(i));
        }
        System.out.println(" ");
    }

    public static ArrayList Sortowanie (ArrayList lista ){
        System.out.println("Sortowanie listy\n");
        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++){

            System.out.println(" nr " + (i+1) + " " + lista.get(i));
        }
        System.out.println(" ");
        return lista;
    }

    public static void  Wyswietlanie_elementu (ArrayList lista,int numer){
        System.out.println("Wyswietlanie elemntu\n");
        System.out.println(lista.get(numer));
        System.out.println(" ");

    }

    public static void  Wyswietlanie_wszystkiego (ArrayList imie,ArrayList oceny,ArrayList adres,ArrayList data,ArrayList nr_tel,ArrayList e_mail,ArrayList rok,ArrayList kierunek ,int numer){

        System.out.println(imie.get(numer));
        System.out.println(oceny.get(numer));
        System.out.println(adres.get(numer));
        System.out.println(data.get(numer));
        System.out.println(nr_tel.get(numer));
        System.out.println(e_mail.get(numer));
        System.out.println(rok.get(numer));
        System.out.println(kierunek.get(numer));
        System.out.println(" ");

    }

    public static void  Wyswietlanie_wszystkiego_Cala_Lista (ArrayList imie,ArrayList oceny,ArrayList adres,ArrayList data,ArrayList nr_tel,ArrayList e_mail,ArrayList rok,ArrayList kierunek){
        for(int numer = 0; numer <imie.size(); numer++) {
            System.out.println(imie.get(numer));
            System.out.println(oceny.get(numer));
            System.out.println(adres.get(numer));
            System.out.println(data.get(numer));
            System.out.println(nr_tel.get(numer));
            System.out.println(e_mail.get(numer));
            System.out.println(rok.get(numer));
            System.out.println(kierunek.get(numer));
            System.out.println(" ");
        }
    }


    public static void main(String[] args) throws IOException {

        ArrayList<String> imie = new ArrayList<>();
        ArrayList<String> oceny = new ArrayList<>();
        ArrayList<String> adres = new ArrayList<>();
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> nr_tel = new ArrayList<>();
        ArrayList<String> e_mail = new ArrayList<>();
        ArrayList<String> rok = new ArrayList<>();
        ArrayList<String> kierunek = new ArrayList<>();

        // rok 1 - Informatyka

        imie.add("Kamil Usicki");
        oceny.add("4,5,3,4");
        adres.add("Poznań ul.Mazurska 34");
        data.add("23.08.1999");
        nr_tel.add("897 897 678");
        e_mail.add("kamil.usicki@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Magdalena Konwalia");
        oceny.add("3,5,5,5");
        adres.add("Poznań ul.Krakowska 67");
        data.add("09.09.1999");
        nr_tel.add("789 234 876");
        e_mail.add("magdalena.konwalia@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Jakub Wilk");
        oceny.add("2,3,5,3");
        adres.add("Poznań ul.Maczka 20");
        data.add("08.07.1999");
        nr_tel.add("123 455 678");
        e_mail.add("jakub.wilk@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Julita Monkowska");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Kaczora 56");
        data.add("12.03.1999");
        nr_tel.add("234 678 990");
        e_mail.add("julita.monkowska@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Damian Monor");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Maczka 90");
        data.add("30.06.1999");
        nr_tel.add("567 880 880");
        e_mail.add("damian.monor@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Adrian Gownal");
        oceny.add("3,4,4,5");
        adres.add("Kielca ul.Centralna 101");
        data.add("30.06.1999");
        nr_tel.add("456 333 234");
        e_mail.add("adrian.gownal@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Bartosz Kuwik");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Walcewicza 12");
        data.add("28.09.1999");
        nr_tel.add("334 222 123");
        e_mail.add("bartosz.kuwik@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Ryszard Ozdoba");
        oceny.add("2,2,3,4");
        adres.add("Poznań ul.Warmińska 10");
        data.add("15.07.1999");
        nr_tel.add("234 556 745 ");
        e_mail.add("ryszard.ozdoba@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Emil Juczyn");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Ludowa 34");
        data.add("12.12.1999");
        nr_tel.add("123 678 679");
        e_mail.add("emil.juczyn@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Adam Duch");
        oceny.add("4,3,4,4");
        adres.add("Poznań ul.Emrata 9");
        data.add("26.05.1999");
        nr_tel.add("788 765 124");
        e_mail.add("adam.duch@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Jakub Owink");
        oceny.add("3,3,3,3");
        adres.add("Poznań ul.Dywizji 1");
        data.add("14.06.1999");
        nr_tel.add("678 999 090");
        e_mail.add("jakub.owink@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Aleksy Lis");
        oceny.add("4,4,4,5");
        adres.add("Poznań ul.Telińska 12");
        data.add("07.08.1999");
        nr_tel.add("178 888 990");
        e_mail.add("aleksy.lis@emial.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Mariusz Luk");
        oceny.add("2,2,2,3");
        adres.add("Poznań ul.Tulipanowa 15");
        data.add("15.09.1999");
        nr_tel.add("178 777 989");
        e_mail.add("mariusz.luk@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Karol Uchyka");
        oceny.add("4,5,5,5");
        adres.add("Szczecin ul.Maldowskiego 27");
        data.add("15.09.1999");
        nr_tel.add("123 786 753");
        e_mail.add("karol.uchyka@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Sylwia Kumna");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Jeżego 45");
        data.add("31.08.1999");
        nr_tel.add("777 296 619");
        e_mail.add("sylwia.kumna@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Patryk Tyczka");
        oceny.add("4,4,3,5");
        adres.add("Poznań ul.Lejkowska 22");
        data.add("01.01.1999");
        nr_tel.add("760 098 023");
        e_mail.add("patryk.tyczka@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Patryk Ul");
        oceny.add("3,3,4,5");
        adres.add("Poznań ul.Klinczowa 472");
        data.add("03.05.1999");
        nr_tel.add("592 209 978");
        e_mail.add("patryk.ul@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Przemek Wylik");
        oceny.add("2,2,3,2");
        adres.add("Poznań ul.Warszawska 16");
        data.add("07.10.1999");
        nr_tel.add("709 990 290");
        e_mail.add("przemek.wylik@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        imie.add("Joanna Tomczewska");
        oceny.add("4,4,5,5");
        adres.add("Poznań ul.Lwia 78");
        data.add("18.11.1999");
        nr_tel.add("820 029 186");
        e_mail.add("joanna.tomczewska@email.pl");
        rok.add("rok 1");
        kierunek.add("Informatyka");

        // rok 1 - Ekonomia

        imie.add("Iga Chorondewska ");
        oceny.add("3,4,5,5");
        adres.add("Poznań ul.Lipy 23");
        data.add("03.09.1999");
        nr_tel.add("789 890 000");
        e_mail.add("iga.chorondewska@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Wojciech Felka");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Kalinowska 33");
        data.add("09.08.1999");
        nr_tel.add("166 766 824");
        e_mail.add("wojciech.felka@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Jakub Tyczka");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Klonowa 2");
        data.add("21.09.1999");
        nr_tel.add("786 666 155");
        e_mail.add("jakub.tyczka@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Oliwia Tonkowska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Rybia 30");
        data.add("13.03.1999");
        nr_tel.add("344 111 555");
        e_mail.add("oliwia.tonkowska@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Agnieszka Duch");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Tychia 78");
        data.add("29.12.1999");
        nr_tel.add("234 788 122");
        e_mail.add("agnieszka.duch@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Damian Kilk");
        oceny.add("4,4,3,4");
        adres.add("Poznań ul.Moszadła 40");
        data.add("17.05.1999");
        nr_tel.add("466 444 000");
        e_mail.add("damian.kilk@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Krystian Matyk");
        oceny.add("2,2,3,4");
        adres.add("Poznań ul.Centralna 160");
        data.add("12.04.1999");
        nr_tel.add("567 129 333");
        e_mail.add("krystian.matyk@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Jakub Chych");
        oceny.add("5,5,4,3");
        adres.add("Kraków ul.Główna 89");
        data.add("07.06.1999");
        nr_tel.add("899 093 739");
        e_mail.add("jakub.chych@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Magdalena Cirkowska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Styczna 10");
        data.add("19.09.1999");
        nr_tel.add("789 655 000");
        e_mail.add("magdalena.cirkowska@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Adrian Lis");
        oceny.add("4,4,5,4");
        adres.add("Poznań ul.Kaczora 21");
        data.add("10.02.1999");
        nr_tel.add("127 788 020");
        e_mail.add("adrian.lis@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Mirek Olik");
        oceny.add("5,3,5,4");
        adres.add("Poznań ul.Mapia 40");
        data.add("19.05.1999");
        nr_tel.add("477 980 127");
        e_mail.add("mirek.olik@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Emil Krawtan");
        oceny.add("5,5,5,3");
        adres.add("Poznań ul.Uchyłka 50");
        data.add("21.06.1999");
        nr_tel.add("678 456 902");
        e_mail.add("emil.krawtan@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Krystyna Wierzba");
        oceny.add("4,4,5,3");
        adres.add("Poznań ul.Krawiecka 29");
        data.add("09.02.1999");
        nr_tel.add("234 678 222");
        e_mail.add("krystyna.wierzba@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Sebastian Milk");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Tykińksa 90");
        data.add("16.05.1999");
        nr_tel.add("478 098 999");
        e_mail.add("sebastian.milk@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Maja Ikowska");
        oceny.add("2,3,3,3");
        adres.add("Poznań ul.Liczbowska 67");
        data.add("18.08.1999");
        nr_tel.add("677 654 298");
        e_mail.add("maja.ikowska@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Grzegorz Rilski");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Urwińska 32");
        data.add("07.01.1999");
        nr_tel.add("098 872 322");
        e_mail.add("grzegorz.rilski@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Alicja Surna");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Maliowa 40");
        data.add("19.09.1999");
        nr_tel.add("876 000 002");
        e_mail.add("alicja.surna@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Krystian Duk");
        oceny.add("3,4,5,5");
        adres.add("Wrocław ul.Marszałkowska 8");
        data.add("08.02.1999");
        nr_tel.add("289 672 092");
        e_mail.add("krystian.duk@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Aleksander Kotowski");
        oceny.add("2,2,3,3");
        adres.add("Poznań ul.Wilcza 90");
        data.add("23.01.1999");
        nr_tel.add("578 289 678");
        e_mail.add("aleksander.kotowski@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        imie.add("Czarek Wojtkowski");
        oceny.add("5,5,5,2");
        adres.add("Poznań ul.Ryszardzcka 30");
        data.add("17.05.1999");
        nr_tel.add("289 078 777");
        e_mail.add("czarek.wojtkowski@email.pl");
        rok.add("rok 1");
        kierunek.add("Ekonomia");

        // rok 1 - Zarządzanie

        imie.add("Aleksander Minuseor");
        oceny.add("4,4,5,5");
        adres.add("Poznań ul.Gawina 52");
        data.add("04.07.1999");
        nr_tel.add("899 098 277");
        e_mail.add("aleksander.minuseor@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Wojciech Kruk");
        oceny.add("4,3,3,2");
        adres.add("Poznań ul.Lipowa 29");
        data.add("08.08.1999");
        nr_tel.add("627 999 999");
        e_mail.add("wojciech.kruk@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Maja Lisowska");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Kliska 60");
        data.add("23.07.1999");
        nr_tel.add("389 000 000");
        e_mail.add("maja.lisowska@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Emilia Grut");
        oceny.add("5,5,2,2");
        adres.add("Poznań ul.Tychalska 80");
        data.add("14.02.1998");
        nr_tel.add("267 876 000");
        e_mail.add("emilia.grut@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Paulina Pochecka");
        oceny.add("4,4,5,3");
        adres.add("Poznań ul.Czyżkowska 34");
        data.add("19.09.1999");
        nr_tel.add("720 290 289");
        e_mail.add("paulina.pochecka@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Henryk Balszczyk");
        oceny.add("5,5,3,4");
        adres.add("Poznań ul.Buddowska 98");
        data.add("20.01.1999");
        nr_tel.add("178 567 098");
        e_mail.add("henryk.balszczyk@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Ryszard Wawel");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Maczka 3");
        data.add("30.04.1999");
        nr_tel.add("892 299 290");
        e_mail.add("ryszard.wawel@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Alan Witolski");
        oceny.add("4,4,4,5");
        adres.add("Poznań ul.Wyczka 49");
        data.add("10.07.1999");
        nr_tel.add("678 099 280");
        e_mail.add("alan.witolski@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Karol Grzerka");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Maodlińska 11");
        data.add("19.09.1999");
        nr_tel.add("785 098 555");
        e_mail.add("karol.grzerka@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Wiktoria Parys");
        oceny.add("5,5,2,3");
        adres.add("Poznań ul.Ulikowska 45");
        data.add("20.10.1999");
        nr_tel.add("678 666 666");
        e_mail.add("wiktoria.parys@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Daria Juchin");
        oceny.add("3,4,5,5");
        adres.add("Poznań ul.Komińska 32");
        data.add("09.07.1999");
        nr_tel.add("768 555 246");
        e_mail.add("daria.juchin@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Weronika Kumina");
        oceny.add("5,5,3,2");
        adres.add("Poznań ul.Hykowksa 50");
        data.add("19.04.1999");
        nr_tel.add("290 982 378");
        e_mail.add("weronika.kumina@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Emil Modlik");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Rodkowska 30");
        data.add("12.04.1999");
        nr_tel.add("456 890 244");
        e_mail.add("emil.modlik@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Borys Iwkan");
        oceny.add("3,2,2,2");
        adres.add("Poznań ul.Matów 78");
        data.add("09.10.1999");
        nr_tel.add("678 378 009");
        e_mail.add("borys.iwkan@emial.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Tymon Ocelot");
        oceny.add("4,4,3,4");
        adres.add("Rzeszów ul.Łabędzia 96");
        data.add("13.06.1999");
        nr_tel.add("744 909 908");
        e_mail.add("tymon.ocelot@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Julia Tyczka");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Kilczka 5");
        data.add("20.07.1999");
        nr_tel.add("678 398 909");
        e_mail.add("julia.tyczka@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Dawid Golan");
        oceny.add("5,5,3,4");
        adres.add("Poznań ul.Maczka 57");
        data.add("30.09.1999");
        nr_tel.add("456 678 029");
        e_mail.add("dawid.golan@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Henryk Stos");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Lwia 70");
        data.add("20.12.1999");
        nr_tel.add("722 677 211");
        e_mail.add("henryk.stos@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Grzegorz Kot");
        oceny.add("5,4,4,3");
        adres.add("Poznań ul.Ptasia 49");
        data.add("30.03.1999");
        nr_tel.add("678 290 999");
        e_mail.add("grzegorz.kot@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        imie.add("Przemek Artyk");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Liwska 89");
        data.add("17.05.1999");
        nr_tel.add("472 878 000");
        e_mail.add("przemek.artyk@email.pl");
        rok.add("rok 1");
        kierunek.add("Zarządzanie");

        // rok 2 - Informatyka

        imie.add("Bartosz Ruk");
        oceny.add("3,2,2,2");
        adres.add("Poznań ul.Gdyńska 99");
        data.add("12.09.1998");
        nr_tel.add("098 780 023");
        e_mail.add("bartosz.ruk@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Alicja Mogda");
        oceny.add("4,4,3,5");
        adres.add("Poznań ul.Hyńska 78");
        data.add("19.06.1998");
        nr_tel.add("909 909 372");
        e_mail.add("alicja.mogda@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Krystian Mawin");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Ulinowksa 67");
        data.add("15.07.1998");
        nr_tel.add("178 675 897");
        e_mail.add("krystian.mawin@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Iga Dwiska");
        oceny.add("4,4,3,4");
        adres.add("Poznań ul.Liczkowska 78");
        data.add("18.09.1998");
        nr_tel.add("780 657 712");
        e_mail.add("iga.dwiska@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Jakub Ilkowski");
        oceny.add("5,3,3,3");
        adres.add("Poznań ul.Orińksa 90");
        data.add("04.02.1998");
        nr_tel.add("682 981 111");
        e_mail.add("jakub.ilkowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Damian Ulik");
        oceny.add("2,2,4,3");
        adres.add("Poznań ul.Agdowska 83");
        data.add("17.05.1998");
        nr_tel.add("629 981 190");
        e_mail.add("damian.ulik@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Bartosz Wilk");
        oceny.add("2,3,3,3");
        adres.add("Poznań ul.Palińska 97");
        data.add("18.12.1998");
        nr_tel.add("711 711 901");
        e_mail.add("bartosz.wilk@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Bogdan Markowski");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Tychowska 22");
        data.add("14.12.1998");
        nr_tel.add("890 897 126");
        e_mail.add("bogdan.markowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Maja Kalik");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Ucińksa 89");
        data.add("17.02.1998");
        nr_tel.add("456 782 909");
        e_mail.add("maja.kalik@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Filip Krzyk");
        oceny.add("3,2,3,4");
        adres.add("Poznań ul.Gruńska 60");
        data.add("03.08.1998");
        nr_tel.add("629 098 988");
        e_mail.add("filip.krzyk@email.pl");

        imie.add("Kacper Erych");
        oceny.add("5,5,4,3");
        adres.add("Poznań ul.Zielowska 91");
        data.add("30.04.1998");
        nr_tel.add("562 222 654");
        e_mail.add("kacper.erych@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Julia Wyk");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Nunska 40");
        data.add("13.09.1998");
        nr_tel.add("278 267 587");
        e_mail.add("julia.wyk@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Ewelina Folkr");
        oceny.add("5,3,4,5");
        adres.add("Poznań ul.Bartońskiego 58");
        data.add("07.08.1998");
        nr_tel.add("564 345 678");
        e_mail.add("ewelina.folkr@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Wiktoria Jyk");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Hycewicza 46");
        data.add("09.09.1998");
        nr_tel.add("382 727 257");
        e_mail.add("wiktoria.jyk@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Dawid Oski");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Wiczyńskiego 67");
        data.add("12.07.1998");
        nr_tel.add("728 827 289");
        e_mail.add("dawid.oski@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Weronika Ulska");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Elongiewicza 29");
        data.add("19.02.1998");
        nr_tel.add("278 567 245");
        e_mail.add("weronika.ulska@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Bartosz Guzin");
        oceny.add("3,3,3,3");
        adres.add("Poznań ul.Fryderyka 19");
        data.add("29.01.1998");
        nr_tel.add("367 728 099");
        e_mail.add("bartosz.guzin@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Iga Byk");
        oceny.add("2,2,3,4");
        adres.add("Poznań ul.Duńska 90");
        data.add("17.04.1998");
        nr_tel.add("282 267 209");
        e_mail.add("iga.byk@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Marcin Ducin ");
        oceny.add("3,3,3,3");
        adres.add("Poznań ul.Saczyńska 23");
        data.add("30.03.1998");
        nr_tel.add("278 567 267");
        e_mail.add("marcin.ducin@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        imie.add("Gracjan Halikowski");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Folkrorowa 12");
        data.add("12.06.1998");
        nr_tel.add("562 762 829");
        e_mail.add("gracjan.halikowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Informatyka");

        // rok 2 - Ekonomia

        imie.add("Adam Gochman");
        oceny.add("3,3,5,4");
        adres.add("Poznań ul.Ludowa 30");
        data.add("23.05.1998");
        nr_tel.add("348 289 278");
        e_mail.add("adam.gochman@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Alicja Kaliska");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Henrego 78");
        data.add("17.09.1998");
        nr_tel.add("178 176 268");
        e_mail.add("alicja.kaliska@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Jakub Mawilski");
        oceny.add("5,4,4,3");
        adres.add("Poznań ul.Tężyńska 62");
        data.add("02.05.1998");
        nr_tel.add("378 290 281");
        e_mail.add("jakub.mawilski@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Igor Rogowski");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Łękowska 20");
        data.add("08.06.1998");
        nr_tel.add("178 295 158");
        e_mail.add("igor.rogowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Paulina Pietrzak");
        oceny.add("5,4,5,5");
        adres.add("Poznań ul.Konwaliowa 29");
        data.add("01.01.1998");
        nr_tel.add("387 282 272");
        e_mail.add("paulina.pietrzak@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Klaudia Chorakowska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Rycińskiego 60");
        data.add("09.12.1998");
        nr_tel.add("476 278 879");
        e_mail.add("klaudia.chorakowska@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Karina Fyka");
        oceny.add("4,3,5,5");
        adres.add("Poznań ul.Saczyńska 72");
        data.add("23.01.1998");
        nr_tel.add("627 625 099");
        e_mail.add("karina.fyka@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Aleksander Hylk");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Hycla 29");
        data.add("17.06.1998");
        nr_tel.add("345 499 376");
        e_mail.add("aleksander.hylk@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Damian Polkaw");
        oceny.add("4,3,3,53");
        adres.add("Poznań ul.Kaktusowa 46");
        data.add("30.09.1998");
        nr_tel.add("388 292 378");
        e_mail.add("damian.polkaw@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Paulina Miwka");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Duskowska 30");
        data.add("12.04.1998");
        nr_tel.add("578 628 299");
        e_mail.add("paulina.miwka@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Przemek Kalski");
        oceny.add("3,4,5,5");
        adres.add("Poznań ul.Gołębiowa 48");
        data.add("30.02.1998");
        nr_tel.add("368 671 107");
        e_mail.add("przemek.kalski@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Wojciech Szlyk");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Karska 89");
        data.add("12.07.1998");
        nr_tel.add("198 176 167");
        e_mail.add("wojciech.szlyk@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Maciej Juwon");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Byka 7");
        data.add("18.02.1998");
        nr_tel.add("782 279 467");
        e_mail.add("maciej.juwon@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Emil Hyksa");
        oceny.add("3,3,3,3");
        adres.add("Poznań ul.Tulipanowa 21");
        data.add("29.05.1998");
        nr_tel.add("178 278 377");
        e_mail.add("emil.hyksa@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Magdalena Wazowska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Cicha 84");
        data.add("07.06.1998");
        nr_tel.add("456 378 189");
        e_mail.add("magdalena.wazowska@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Damian Skolski");
        oceny.add("4,4,3,5");
        adres.add("Poznań ul.Eliowa 37");
        data.add("20.04.1998");
        nr_tel.add("489 262 478");
        e_mail.add("damian.skolski@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Fryderyk Rolski");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Majowa 49");
        data.add("29.09.1998");
        nr_tel.add("672 536 278");
        e_mail.add("fryderyk.rolski@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Halina Wojtkowska");
        oceny.add("5,5,3,3");
        adres.add("Olsztyn ul.Hymańska 90");
        data.add("13.10.1998");
        nr_tel.add("378 478 650");
        e_mail.add("halina.wojtkowska@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Karina Mojtka");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Rulska 45");
        data.add("20.05.1998");
        nr_tel.add("587 578 230");
        e_mail.add("karina.mojtka@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        imie.add("Kacper Wit");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Dawidowa 29");
        data.add("16.08.1998");
        nr_tel.add("378 576 247");
        e_mail.add("kacper.wit@email.pl");
        rok.add("rok 2");
        kierunek.add("Ekonomia");

        // Rok 2 - Zarządzanie

        imie.add("Wiktoria Geska");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Fylka 69");
        data.add("12.07.1998");
        nr_tel.add("578 577 488");
        e_mail.add("wiktoria.geska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Aleksandra Lis");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Powańska 20");
        data.add("28.03.1998");
        nr_tel.add("184 638 444");
        e_mail.add("aleksandra.lis@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Ewelina Duska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Gąsiego 57");
        data.add("23.04.1998");
        nr_tel.add("478 267 288");
        e_mail.add("ewelina.duska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Mariusz Smylka");
        oceny.add("3,4,2,4");
        adres.add("Poznań ul.Grotowa 48");
        data.add("12.07.1998");
        nr_tel.add("638 229 076");
        e_mail.add("mariusz.smylka@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Dawid Kolka");
        oceny.add("4,4,5,5");
        adres.add("Poznań ul.Rosińska 72");
        data.add("28.04.1998");
        nr_tel.add("378 367 909");
        e_mail.add("dawid.kolka@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Marcin Uklak");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Toskowska 38");
        data.add("29.09.1998");
        nr_tel.add("238 736 529");
        e_mail.add("marcin.uklak@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Ewelina Gpolowska");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Polkowa 58");
        data.add("12.05.1998");
        nr_tel.add("478 279 278");
        e_mail.add("ewelina.gpolowska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Antoni Belkowski");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Tychińska 52");
        data.add("28.04.1998");
        nr_tel.add("367 598 211");
        e_mail.add("antoni.belkowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Krystian Gwik");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Smocza 30");
        data.add("21.08.1998");
        nr_tel.add("627 255 577");
        e_mail.add("krystian.gwik@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Wiktor Isowski");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Powiatowa 3");
        data.add("30.06.1998");
        nr_tel.add("367 483 260");
        e_mail.add("wiktor.isowski@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Maciej Adoski");
        oceny.add("3,3,3,3");
        adres.add("Poznań ul.Rudzka 61");
        data.add("29.09.1998");
        nr_tel.add("492 167 167");
        e_mail.add("maciej.adoski@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Adam Lubelski");
        oceny.add("4,3,3,5");
        adres.add("Poznań ul.Tywoska 29");
        data.add("17.05.1998");
        nr_tel.add("867 267 582");
        e_mail.add("adam.lubelski@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Julita Gelk");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Puska 88");
        data.add("28.04.1998");
        nr_tel.add("367 298 199");
        e_mail.add("julita.gelk@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Filip Hoska");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Dąbrowa 46");
        data.add("10.10.1998");
        nr_tel.add("478 298 277");
        e_mail.add("filip.hoska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Weronika Olkwia");
        oceny.add("5,5,5,3");
        adres.add("Poznań ul.Goda 28");
        data.add("13.09.1998");
        nr_tel.add("139 267 509");
        e_mail.add("weronika.olkwia@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Oliwia Silska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Lisowa 77");
        data.add("23.04.1998");
        nr_tel.add("999 466 288");
        e_mail.add("oliwia.silska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Mariusz Wojoch");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Kępowska 34");
        data.add("06.03.1998");
        nr_tel.add("381 199 378");
        e_mail.add("mariusz.wojoch@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Emilia Pomska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Dokowa 33");
        data.add("01.01.1998");
        nr_tel.add("234 582 199");
        e_mail.add("emilia.pomska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Damian Torch");
        oceny.add("4,3,4,3");
        adres.add("Poznań ul.Wolińska 90");
        data.add("30.07.1998");
        nr_tel.add("37 299 999");
        e_mail.add("damian.torch@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        imie.add("Magdalena Eliska");
        oceny.add("4,5,3,3");
        adres.add("Poznań ul.Wygdy 56");
        data.add("04.06.1998");
        nr_tel.add("768 467 698");
        e_mail.add("magdalena.eliska@email.pl");
        rok.add("rok 2");
        kierunek.add("Zarządzanie");

        // Rok 3 - Informatyka

        imie.add("Kamil Roliski");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Kępy 79");
        data.add("02.02.1997");
        nr_tel.add("578 278 555");
        e_mail.add("kamil.roliski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Ignacy Dork");
        oceny.add("3,3,4,4");
        adres.add("Poznań ul.Ewina 54");
        data.add("09.06.1997");
        nr_tel.add("566 282 299");
        e_mail.add("ignacy.dork@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Ula Cholka");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Bosińska 85");
        data.add("27.05.1997");
        nr_tel.add("329 288 748");
        e_mail.add("ula.cholka@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Karina Lwoska");
        oceny.add("4,5,3,3");
        adres.add("Poznań ul.Czapli 20");
        data.add("25.10.1997");
        nr_tel.add("649 287 199");
        e_mail.add("karina.lwoska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Adrian Glekowski");
        oceny.add("5,5,5,3");
        adres.add("Poznań ul.Komarowa 55");
        data.add("30.04.1997");
        nr_tel.add("278 188 408");
        e_mail.add("adrian.glekowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Maja Choliska");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Oliska 23");
        data.add("18.09.1997");
        nr_tel.add("387 222 522");
        e_mail.add("maja.choliska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Wiktor Poskowski");
        oceny.add("5,5,4,3");
        adres.add("Poznań ul.Gowicza 34");
        data.add("04.12.1997");
        nr_tel.add("499 278 468");
        e_mail.add("wiktor.poskowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Kamila Susowska");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Leśna 61");
        data.add("07.09.1997");
        nr_tel.add("738 268 506");
        e_mail.add("kamila.susowska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Konrad Julski");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Torowa 95");
        data.add("15.02.1997");
        nr_tel.add("467 299 726");
        e_mail.add("konrad.julski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Igor Krolski");
        oceny.add("4,5,3,3");
        adres.add("Poznań ul.Stopowa 45");
        data.add("30.05.1997");
        nr_tel.add("278 398 322");
        e_mail.add("igor.krolski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Anna Ekowska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Przystaniowa 2");
        data.add("05.08.1997");
        nr_tel.add("674 888 278");
        e_mail.add("anna.ekowska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Marta Forgowa");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Uliskowska 60");
        data.add("22.04.1997");
        nr_tel.add("387 333 333");
        e_mail.add("marta.forgowa@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Kamil Emolski");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Kępina 33");
        data.add("30.12.1997");
        nr_tel.add("444 728 126");
        e_mail.add("kamil.emolski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Marcin Lorelski");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Arktyczna 40");
        data.add("08.03.1997");
        nr_tel.add("826 904 647");
        e_mail.add("marcin.lorelski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Dominik Mak");
        oceny.add("3,3,3,5");
        adres.add("Poznań ul.Morska 64");
        data.add("03.01.1997");
        nr_tel.add("478 492 279");
        e_mail.add("dominik.mak@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Halina Dkowska");
        oceny.add("4,4,3,3");
        adres.add("Poznań ul.Belińska 88");
        data.add("30.05.1997");
        nr_tel.add("267 837 888");
        e_mail.add("halina.dkowska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Marzena Losowa");
        oceny.add("5,5,5,3");
        adres.add("Poznań ul.Goździkowa 32");
        data.add("29.08.1997");
        nr_tel.add("578 378 928");
        e_mail.add("marzena.losowa@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Sylwia Grutka");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Kołobrzegowa 72");
        data.add("21.05.1997");
        nr_tel.add("368 728 298");
        e_mail.add("sylwia.grutka@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Andrzej Rokski");
        oceny.add("5,3,3,4");
        adres.add("Poznań ul.Maciejów 1");
        data.add("13.02.1997");
        nr_tel.add("845 389 888");
        e_mail.add("andrzej.rokski@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        imie.add("Alicja Juska");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Torowicza 50");
        data.add("07.07.1997");
        nr_tel.add("222 888 368");
        e_mail.add("alicja.juska@email.pl");
        rok.add("rok 3");
        kierunek.add("Informatyka");

        // Rok 3 - Ekonomia

        imie.add("Henryk Gok");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Krukowa 29");
        data.add("14.03.1997");
        nr_tel.add("582 478 278");
        e_mail.add("henryk.gok@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Jadwiga Purska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Saska 45");
        data.add("30.02.1997");
        nr_tel.add("493 279 958");
        e_mail.add("jadwiga.purska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Dawid Nolskowski");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Paryska 38");
        data.add("19.07.1997");
        nr_tel.add("583 664 267");
        e_mail.add("dawid.nolskowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Magdalena Kosolska");
        oceny.add("5,5,3,3");
        adres.add("Gdańsk ul.Rozewicza 57");
        data.add("18.04.1997");
        nr_tel.add("573 928 290");
        e_mail.add("magdalena.kosolska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Wiktoria Mochilska");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Ludowa 94");
        data.add("31.05.1997");
        nr_tel.add("583 228 293");
        e_mail.add("wiktoria.mochilska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Karol Madwig");
        oceny.add("5,4,4,4");
        adres.add("Poznań ul.Wolska 30");
        data.add("04.07.1997");
        nr_tel.add("482 694 285");
        e_mail.add("karol.madwig@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Renata Holko");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Morska 40");
        data.add("16.06.1997");
        nr_tel.add("387 843 277");
        e_mail.add("renata.holko@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Wojciech Ochski");
        oceny.add("5,3,3,3");
        adres.add("Poznań ul.Dworowa 77");
        data.add("20.04.1997");
        nr_tel.add("222 530 281");
        e_mail.add("wojciech.ochski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Kacper Sachalski");
        oceny.add("5,4,5,5");
        adres.add("Poznań ul.Krasnowa 87");
        data.add("25.08.1997");
        nr_tel.add("583 299 764");
        e_mail.add("kacper.sachalski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Anna Gukska");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Morsa 20");
        data.add("21.05.1997");
        nr_tel.add("478 298 444");
        e_mail.add("anna.gukska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Wiktor Olwik");
        oceny.add("3,2,4,4");
        adres.add("Poznań ul.Kacprowicza 34");
        data.add("05.02.1997");
        nr_tel.add("478 222 836");
        e_mail.add("wiktor.olwik@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Sylwia Wrotewicz");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Harcewicza 21");
        data.add("18.05.1997");
        nr_tel.add("736 247 826");
        e_mail.add("sylwia.wrotewicz@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Oliwia Doskowska");
        oceny.add("4,4,5,5");
        adres.add("Poznań ul.Ulrańska 39");
        data.add("05.08.1997");
        nr_tel.add("274 367 299");
        e_mail.add("oliwia.doskowska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Emil Ikowski");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Fryderyka 71");
        data.add("30.11.1997");
        nr_tel.add("378 565 276");
        e_mail.add("emil.ikowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Damian Ailski");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Dębowa 63");
        data.add("23.05.1997");
        nr_tel.add("566 298 466");
        e_mail.add("damian.ailski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Mirek Kafrok");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Gęsiego 4");
        data.add("07.03.1997");
        nr_tel.add("444 433 275");
        e_mail.add("mirek.kafrok@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Joanna Cuscha");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Fokowa 55");
        data.add("24.06.1997");
        nr_tel.add("289 222 120");
        e_mail.add("joanna.cuscha@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Dominik Kwarlski");
        oceny.add("3,4,4,4");
        adres.add("Poznań ul.Tokowska 39");
        data.add("30.04.1997");
        nr_tel.add("389 444 567");
        e_mail.add("dominik.kwarlski@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Joanna Koralowa");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Niedźwiedzia 40");
        data.add("05.02.1997");
        nr_tel.add("385 446 288");
        e_mail.add("joanna.koralowa@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        imie.add("Anna Lowiska");
        oceny.add("4,5,3,3");
        adres.add("Poznań ul.Kadrowska 29");
        data.add("09.04.1997");
        nr_tel.add("856 367 576");
        e_mail.add("anna.lowiska@email.pl");
        rok.add("rok 3");
        kierunek.add("Ekonomia");

        // Rok 3 - Zarządzanie

        imie.add("Adam Rodski");
        oceny.add("4,5,5,3");
        adres.add("Poznań ul.Makowa 49");
        data.add("03.02.1997");
        nr_tel.add("372 738 488");
        e_mail.add("adam.rodski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Maciej Falski");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Ludowa 78");
        data.add("24.05.1997");
        nr_tel.add("239 455 929");
        e_mail.add("maciej.falski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Igor Nokalski");
        oceny.add("5,5,3,3");
        adres.add("Poznań ul.Kusowicza 40");
        data.add("17.07.1997");
        nr_tel.add("178 367 287");
        e_mail.add("igor.nokalski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Monika Wachska");
        oceny.add("4,5,5,3");
        adres.add("Poznań ul.Elfowa 35");
        data.add("04.06.1997");
        nr_tel.add("567 287 466");
        e_mail.add("monika.wachska@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Irena Sokolska");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul. Tarzyńska 96");
        data.add("08.11.1997");
        nr_tel.add("443 446 288");
        e_mail.add("irena.sokolska@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Tomasz Dwik");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Gochlińska 84");
        data.add("02.05.1997");
        nr_tel.add("174 366 277");
        e_mail.add("tomasz.dwik@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Robert Gachlik");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Pawłowicza 23");
        data.add("28.09.1997");
        nr_tel.add("578 846 466");
        e_mail.add("robert.gachlik@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Magdalena Sochlin");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Zotkowska 57");
        data.add("16.05.1997");
        nr_tel.add("222 472 583");
        e_mail.add("magdalena.sochlin@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Igor Tachowski");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Domańska 33");
        data.add("19.10.1997");
        nr_tel.add("735 376 566");
        e_mail.add("igor.kalcyk@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Gracjan Tachowski");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Hycla 66");
        data.add("12.12.1997");
        nr_tel.add("452 777 356");
        e_mail.add("gracjan.tachowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Jadwiga Gryk");
        oceny.add("5,3,2,3");
        adres.add("Poznań ul.Maciechowska 22");
        data.add("04.05.1997");
        nr_tel.add("746 288 455");
        e_mail.add("jadwiga.gryk@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Piotr Juschin");
        oceny.add("4,3,3,3");
        adres.add("Poznań ul.Daszyńskiego 58");
        data.add("04.06.1997");
        nr_tel.add("275 645 455");
        e_mail.add("piotr.juschin@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Dorota Jawik");
        oceny.add("4,5,5,5");
        adres.add("Poznań ul.Grochowska 34");
        data.add("08.03.1997");
        nr_tel.add("672 457 644");
        e_mail.add("dorota.jawik@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Fryderyk Malwikowski");
        oceny.add("5,3,3,3");
        adres.add("Poznań ul.Gwilska 57");
        data.add("15.05.1997");
        nr_tel.add("467 567 290");
        e_mail.add("fryderyk.malwikowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Grzegorz Salkowski");
        oceny.add("5,5,5,5");
        adres.add("Poznań ul.Rukowska 48");
        data.add("10.11.1997");
        nr_tel.add("987 367 254");
        e_mail.add("grzegorz.salkowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Justyna Zytkiewicz");
        oceny.add("4,4,4,4");
        adres.add("Poznań ul.Warchowicza 21");
        data.add("30.11.1997");
        nr_tel.add("308 268 555");
        e_mail.add("justyna.zytkiewicz@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Klaudia Murska");
        oceny.add("5,3,3,3");
        adres.add("Poznań ul.Salowska 64");
        data.add("16.04.1997");
        nr_tel.add("356 487 736");
        e_mail.add("klaudia.murska@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Wojciech Marowski");
        oceny.add("4,4,4,5");
        adres.add("Poznań ul.Wolicza 20");
        data.add("11.05.1997");
        nr_tel.add("456 224 444");
        e_mail.add("wojciech.marowski@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Weronika Kliaska");
        oceny.add("5,4,3,3");
        adres.add("Poznań ul.Dawilska 92");
        data.add("16.02.1997");
        nr_tel.add("333 654 888");
        e_mail.add("weronika.kliaska@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        imie.add("Radek Jelchin");
        oceny.add("5,4,4,3");
        adres.add("Poznań ul.Maczkowa 47");
        data.add("10.05.1997");
        nr_tel.add("756 278 888");
        e_mail.add("radek.jelchin@email.pl");
        rok.add("rok 3");
        kierunek.add("Zarządzanie");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Cześc, wybierz liczbe\n" +
                "1. Wyswietlanie pierwszych elementów\n" +
                "2. Wyswietlanie ostatnich elementów\n" +
                "3. Wyswietlanie pojedyńczego elementu\n" +
                "4. Wyswietlanie wszystkich informacji na temat jednej osoby\n" +
                "5. Wyjdz z programu\n" +
                "6. Dodaj osobe\n"+
                "7. Wyświetlanie całej listy\n" +
                "Twoj wybor to: \n");

        int Liczba = Integer.parseInt(reader.readLine());
        switch (Liczba) {
            case 1: {
                System.out.println("Wyswietlanie pierwszych elementów");
                System.out.println("Ile chcesz elementów wyświetlić: ");
                int Liczba_1 = Integer.parseInt(reader.readLine());
                Wysw_pierwsze_el(imie, Liczba_1);
                break;
            }
            case 2: {
                System.out.println("Wyswietlanie ostatnich elementów");
                System.out.println("Ile chcesz elementów wyświetlić:");
                int Liczba_1 = Integer.parseInt(reader.readLine());
                Wysw_ostatnie_el(imie, Liczba_1);
                break;
            }
            case 3: {
                System.out.println("Wyswietlanie pojedynczego elementów");
                System.out.println("Ile chcesz elementów wyświetlić: ");
                int Liczba_1 = Integer.parseInt(reader.readLine());
                Wyswietlanie_elementu(imie, Liczba_1);
                break;
            }
            case 4: {
                System.out.println("Wyswietlanie wszystkiego na temat jednej osoby: ");
                System.out.println("Podaj numer osoby");
                int Liczba_1 = Integer.parseInt(reader.readLine());
                Wyswietlanie_wszystkiego(imie, oceny, adres, data, nr_tel, e_mail, rok, kierunek, Liczba_1);
                break;
            }
            case 5: {
                System.out.println("Wychodzisz z programu.");
                break;
            }
            case 6: {
                System.out.println("Podaj imie i nazwisko");
                String Liczba_1 = reader.readLine();
                imie.add(Liczba_1);
                System.out.println("Podaj oceny");
                String Liczba_2 = reader.readLine();
                oceny.add(Liczba_2);
                System.out.println("Podaj adres");
                String Liczba_3 = reader.readLine();
                adres.add(Liczba_3);
                System.out.println("Podaj date urodzenia");
                String Liczba_4 = reader.readLine();
                data.add(Liczba_4);
                System.out.println("Podaj numer telefonu");
                String Liczba_5 = reader.readLine();
                nr_tel.add(Liczba_5);
                System.out.println("Podaj e_mail");
                String Liczba_6 = reader.readLine();
                e_mail.add(Liczba_6);
                System.out.println("Podaj rok studiów");
                String Liczba_7 = reader.readLine();
                rok.add(Liczba_7);
                System.out.println("Podaj kierunek");
                String Liczba_8 = reader.readLine();
                kierunek.add(Liczba_8);
                Wyswietlanie_wszystkiego_Cala_Lista(imie,oceny,adres,data,nr_tel,e_mail,rok,kierunek);
                break;
            }
            case 7:{
                Wyswietlanie_wszystkiego_Cala_Lista(imie,oceny,adres,data,nr_tel,e_mail,rok,kierunek);
                break;
            }
        }

    }
}

// Baza danych uczniów
/*
Rok 1 - Informatyka
Uczniowie              Oceny         Adresy zamiekszania               Data urodzenia       Telefon        E-mail
Kamil Usicki           4,5,3,4       Poznań ul.Mazurska 34             23.08.1999           897 897 678    kamil.usicki@email.pl
Jakub Wilk             2,3,5,3       Poznań ul.Maczka 20               08.07.1999           123 455 678    jakub.wilk@email.pl
Julita Monkowska       3,3,4,4       Poznań ul.Kaczora 56              12.03.1999           234 678 990    julita.monkowska@email.pl
Damian Monor           5,5,5,5       Poznań ul.Maczka 90               29.08.1999           567 880 880    damian.monor@email.pl
Adrian Gownal          3,4,4,4       Kielca ul.Centralna 101           30.06.1999           456 333 234    adrian.gownal@email.pl
Bartosz Kuwik          4,5,5,5       Poznań ul.Walcewicza 12           28.09.1999           334 222 123    bartosz.kuwik@email.pl
Ryszard Ozdoba         2,2,3,4       Poznań ul.Warmińska 10            15.07.1999           234 556 745    ryszard.ozdoba@email.pl
Emil Juczyn            5,5,5,5       Poznań ul.Ludowa 34               12.12.1999           123 678 679    emil.juczyn@email.pl
Adam Duch              4,3,4,4       Poznań ul.Emrata 9                26.05.1999           788 765 124    adam.duch@email.pl
Jakub Owink            3,3,3,3       Poznań ul.Dywizji 1               14.06.1999           678 999 090    jakub.owink@email.pl
Aleksy Lis             4,4,4,5       Poznań ul.Telińska 12             07.08.1999           178 888 990    aleksy.lis@emial.pl
Mariusz Luk            2,2,2,3       Poznań ul.Tulipanowa 15           15.09.1999           178 777 989    mariusz.luk@email.pl
Anita Duczek           3,4,5,5       Poznań ul.Uliego 46               27.10.1999           122 657 779    anita.duczek@email.pl
Karol Uchyka           4,5,5,5       Szczecin ul.Maldowskiego 27       30.07.1999           897 560 196    karol.uchyka@email.pl
Sylwia Kumna           3,3,4,4       Poznań ul.Jeżego 45               31.08.1999           777 296 619    sylwia.kumna@email.pl
Patryk Tyczka          4,4,3,5       Poznań ul.Lejkowska 22            01.01.1999           760 098 023    patryk.tyczka@email.pl
Patryk Ul              3,3,4,5       Poznań ul.Klinczowa 47            03.05.1999           592 209 978    patryk.ul@email.pl
Przemek Wylik          2,2,3,2       Poznań ul.Warszawska 16           07.10.1999           709 990 290    przemek.wylik@email.pl
Joanna Tomczewska      4,4,5,5       Poznań ul.Lwia 78                 18.11.1999           820 029 186    joanna.tomczewska@email.pl

Rok 1 - Ekonomia
Iga Chorondewska       3,4,5,5       Poznań ul.Lipy 23                 03.09.1999           789 890 000    iga.chorondewska@email.pl
Wojciech Felka         3,3,4,4       Poznań ul.Kalinowska 33           09.08.1999           166 766 824    wojciech.felka@email.pl
Jakub Tyczka           5,5,5,5       Poznań ul.Klonowa 2               21.09.1999           786 666 155    jakub.tyczka@email.pl
Oliwia Tonkowska       5,5,5,5       Poznań ul.Rybia 30                13.03.1999           344 111 555    oliwia.tonkowska@email.pl
Agnieszka Duch         5,5,3,3       Poznań ul.Tychia 78               29.12.1999           234 788 122    agnieszka.duch@email.pl
Damian Kilk            4,4,3,4       Poznań ul.Moszadła 40             17.05.1999           466 444 000    damian.kilk@email.pl
Krystian Matyk         2,2,3,4       Poznań ul.Centralna 160           12.04.1999           567 129 333    krystian.matyk@email.pl
Jakub Chych            5,5,4,3       Kraków ul.Główna 89               07.06.1999           899 093 739    jakub.chych@email.pl
Magdalena Cirkowska    5,5,5,5       Poznań ul.Styczna 10              19.09.1999           789 655 000    magdalena.cirkowska@email.pl
Adrian Lis             4,4,5,4       Poznań ul.Kaczora 21              10.02.1999           127 788 020    adrian.lis@email.pl
Mirek Olik             5,3,5,4       Poznań ul.Mapia 40                19.05.1999           477 980 127    mirek.olik@email.pl
Emil Krawtan           5,5,5,3       Poznań ul.Uchyłka 50              21.06.1999           678 456 902    emil.krawtan@email.pl
Krystyna Wierzba       4,4,5,3       Poznań ul.Krawiecka 29            09.02.1999           234 678 222    krystyna.wierzba@email.pl
Sebastian Milk         4,3,3,3       Poznań ul.Tykińksa 90             16.05.1999           478 098 999    sebastian.milk@email.pl
Maja Ikowska           2,3,3,3       Poznań ul.Liczbowska 67           18.08.1999           677 654 298    maja.ikowska@email.pl
Grzegorz Rilski        3,4,4,4       Poznań ul.Urwińska 32             07.01.1999           098 872 322    grzegorz.rilski@email.pl
Alicja Surna           5,5,5,5       Poznań ul.Maliowa 40              19.09.1999           876 000 002    alicja.surna@email.pl
Krystian Duk           3,4,5,5       Wrocław ul.Marszałkowska 8        08.02.1999           289 672 092    krystian.duk@email.pl
Aleksander Kotowski    2,2,3,3       Poznań ul.Wilcza 90               23.01.1999           578 289 678    aleksander.kotowski@email.pl
Czarek Wojtkowski      5,5,5,2       Poznań ul.Ryszardzcka 30          17.05.1999           289 078 777    czarek.wojtkowski@email.pl

Rok 1 - Zarządzanie
Aleksander Minuseor    4,4,5,5       Poznań ul.Gawina 52               04.07.1999           899 098 277    aleksander.minuseor@email.pl
Wojciech Kruk          4,3,3,2       Poznań ul.Lipowa 29               08.08.1999           627 999 999    wojciech.kruk@email.pl
Maja Lisowska          4,4,4,4       Poznań ul.Kliska 60               23.07.1999           389 000 000    maja.lisowska@email.pl
Emilia Grut            5,5,2,2       Poznań ul.Tychalska 80            14.02.1998           267 876 000    emilia.grut@email.pl
Paulina Pochecka       4,4,5,3       Poznań ul.Czyżkowska 34           19.09.1999           720 290 289    paulina.pochecka@email.pl
Henryk Balszczyk       5,5,3,4       Poznań ul.Buddowska 98            20.01.1999           178 567 098    henryk.balszczyk@email.pl
Ryszard Wawel          4,5,5,5       Poznań ul.Maczka 3                30.04.1999           892 299 290    ryszard.wawel@email.pl
Alan Witolski          4,4,4,5       Poznań ul.Wyczka 49               10.07.1999           678 099 280    alan.witolski@email.pl
Karol Grzerka          5,5,5,5       Poznań ul.Maodlińska 11           19.09.1999           785 098 555    karol.grzerka@email.pl
Wiktoria Parys         5,5,2,3       Poznań ul.Ulikowska 45            20.10.1999           678 666 666    wiktoria.parys@email.pl
Daria Juchin           3,4,5,5       Poznań ul.Komińska 32             09.07.1999           768 555 246    daria.juchin@email.pl
Weronika Kumina        5,5,3,2       Poznań ul.Hykowksa 50             19.04.1999           290 982 378    weronika.kumina@email.pl
Emil Modlik            5,5,5,5       Poznań ul.Rodkowska 30            12.04.1999           456 890 244    emil.modlik@email.pl
Borys Iwkan            3,2,2,2       Poznań ul.Matów 78                09.10.1999           678 378 009    borys.iwkan@emial.pl
Tymon Ocelot           4,4,3,4       Rzeszów ul.Łabędzia 96            13.06.1999           744 909 908    tymon.ocelot@email.pl
Julia Tyczka           5,5,3,3       Poznań ul.Kilczka 5               20.07.1999           678 398 909    julia.tyczka@email.pl
Dawid Golan            5,5,3,4       Poznań ul.Maczka 57               30.09.1999           456 678 029    dawid.golan@email.pl
Henryk Stos            4,4,3,3       Poznań ul.Lwia 70                 20.12.1999           722 677 211    henryk.stos@email.pl
Grzegorz Kot           5,4,4,3       Poznań ul.Ptasia 49               30.03.1999           678 290 999    grzegorz.kot@email.pl
Przemek Artyk          5,5,5,5       Poznań ul.Liwska 89               17.05.1999           472 878 000    przemek.artyk@email.pl

Rok 2 - Informatyka
Bartosz Ruk            3,2,2,2       Poznań ul.Gdyńska 99              12.09.1998           098 780 023    bartosz.ruk@email.pl
Alicja Mogda           4,4,3,5       Poznań ul.Hyńska 78               19.06.1998           909 909 372    alicja.mogda@email.pl
Krystian Mawin         5,5,5,5       Poznań ul.Ulinowksa 67            15.07.1998           178 675 897    krystian.mawin@email.pl
Iga Dwiska             4,4,3,4       Poznań ul.Liczkowska 78           18.09.1998           780 657 712    iga.dwiska@email.pl
Jakub Ilkowski         5,3,3,3       Poznań ul.Orińksa 90              04.02.1998           682 981 111    jakub.ilkowski@email.pl
Damian Ulik            2,2,4,3       Poznań ul.Agdowska 83             17.05.1998           629 981 190    damian.ulik@email.pl
Bartosz Wilk           2,3,3,3       Poznań ul.Palińska 97             18.12.1998           711 711 901    bartosz.wilk@email.pl
Bogdan Markowski       5,4,3,3       Poznań ul.Tychowska 22            14.12.1998           890 897 126    bogdan.markowski@email.pl
Maja Kalik             4,4,4,4       Poznań ul.Ucińksa 89              17.02.1998           456 782 909    maja.kalik@email.pl
Filip Krzyk            3,2,3,4       Poznań ul.Gruńska 60              03.08.1998           629 098 988    filip.krzyk@email.pl
Kacper Erych           5,5,4,3       Poznań ul.Zielowska 91            30.04.1998           562 222 654    kacper.erych@email.pl
Julia Wyk              5,4,3,3       Poznań ul.Nunska 40               13.09.1998           278 267 587    julia.wyk@email.pl
Ewelina Folkr          5,3,4,5       Poznań ul.Bartońskiego 58         07.08.1998           564 345 678    ewelina.folkr@email.pl
Wiktoria Jyk           5,5,5,5       Poznań ul.Hycewicza 46            09.09.1998           382 727 257    wiktoria.jyk@email.pl
Dawid Oski             4,4,3,3       Poznań ul.Wiczyńskiego 67         12.07.1998           728 827 289    dawid.oski@email.pl
Weronika Ulska         4,3,3,3       Poznań ul.Elongiewicza 29         19.02.1998           278 567 245    weronika.ulska@email.pl
Bartosz Guzin          3,3,3,3       Poznań ul.Fryderyka 19            29.01.1998           367 728 099    bartosz.guzin@email.pl
Iga Byk                2,2,3,4       Poznań ul.Duńska 90               17.04.1998           282 267 209    iga.byk@email.pl
Marcin Ducin           3,3,3,3       Poznań ul.Saczyńska 23            30.03.1998           278 567 267    marcin.ducin@email.pl
Gracjan Halikowski     4,5,5,5       Poznań ul.Folkrorowa 12           12.06.1998           562 762 829    gracjan.halikowski@email.pl

Rok 2 - Ekonomia
Adam Gochman           3,3,5,4       Poznań ul.Ludowa 30               23.05.1998           348 289 278    adam.gochman@email.pl
Alicja Kaliska         3,4,4,4       Poznań ul.Henrego 78              17.09.1998           178 176 268    alicja.kaliska@email.pl
Jakub Mawilski         5,4,4,3       Poznań ul.Tężyńska 62             02.05.1998           378 290 281    jakub.mawilski@email.pl
Igor Rogowski          3,3,4,4       Poznań ul.Łękowska 20             08.06.1998           178 295 158    igor.rogowski@email.pl
Paulina Pietrzak       5,4,5,5       Poznań ul.Konwaliowa 29           01.01.1998           387 282 272    paulina.pietrzak@email.pl
Klaudia Chorakowska    5,5,5,5       Poznań ul.Rycińskiego 60          09.12.1998           476 278 879    klaudia.chorakowska@email.pl
Karina Fyka            4,3,5,5       Poznań ul.Saczyńska 72            23.01.1998           627 625 099    karina.fyka@email.pl
Aleksander Hylk        4,3,3,3       Poznań ul.Hycla 29                17.06.1998           345 499 376    aleksander.hylk@email.pl
Damian Polkaw          4,3,3,5       Poznań ul.Kaktusowa 46            30.09.1998           388 292 378    damian.polkaw@email.pl
Paulina Miwka          5,5,5,5       Poznań ul.Duskowska 30            12.04.1998           578 628 299    paulina.miwka@email.pl
Przemek Kalski         3,4,5,5       Poznań ul.Gołębiowa 48            30.02.1998           368 671 107    przemek.kalski@email.pl
Wojciech Szlyk         5,5,5,5       Poznań ul.Karska 89               12.07.1998           198 176 167    wojciech.szlyk@email.pl
Maciej Juwon           4,3,3,3       Poznań ul.Byka 7                  18.02.1998           782 279 467    maciej.juwon@email.pl
Emil Hyksa             3,3,3,3       Poznań ul.Tulipanowa 21           29.05.1998           178 278 377    emil.hyksa@email.pl
Magdalena Wazowska     5,5,5,5       Poznań ul.Cicha 84                07.06.1998           456 378 189    magdalena.wazowska@email.pl
Damian Skolski         4,4,3,5       Poznań ul.Eliowa 37               20.04.1998           489 262 478    damian.skolski@email.pl
Fryderyk Rolski        5,5,3,3       Poznań ul.Majowa 49               29.09.1998           672 536 278    fryderyk.rolski@email.pl
Halina Wojtkowska      5,5,3,3       Olsztyn ul.Hymańska 90            13.10.1998           378 478 650    halina.wojtkowska@email.pl
Karina Mojtka          3,4,4,4       Poznań ul.Rulska 45               20.05.1998           587 578 230    karina.mojtka@email.pl
Kacper Wit             4,4,4,4       Poznań ul.Dawidowa 29             16.08.1998           378 576 247    kacper.wit@email.pl

Rok 2 - Zarządzanie
Wiktoria Geska         3,4,4,4       Poznań ul.Fylka 69                12.07.1998           578 577 488    wiktoria.geska@email.pl
Aleksandra Lis         5,5,5,5       Poznań ul.Powańska 20             28.03.1998           184 638 444    aleksandra.lis@email.pl
Ewelina Duska          5,5,5,5       Poznań ul.Gąsiego 57              23.04.1998           478 267 288    ewelina.duska@email.pl
Mariusz Smylka         3,4,2,4       Poznań ul.Grotowa 48              12.07.1998           638 229 076    mariusz.smylka@email.pl
Dawid Kolka            4,4,5,5       Poznań ul.Rosińska 72             28.04.1998           378 367 909    dawid.kolka@email.pl
Marcin Uklak           4,4,4,4       Poznań ul.Toskowska 38            29.09.1998           238 736 529    marcin.uklak@email.pl
Ewelina Gpolowska      5,4,3,3       Poznań ul.Polkowa 58              12.05.1998           478 279 278    ewelina.gpolowska@email.pl
Antoni Belkowski       4,4,3,3       Poznań ul.Tychińska 52            28.04.1998           367 598 211    antoni.belkowski@email.pl
Krystian Gwik          4,4,3,3       Poznań ul.Smocza 30               21.08.1998           627 255 577    krystian.gwik@email.pl
Wiktor Isowski         5,5,5,5       Poznań ul.Powiatowa 3             30.06.1998           367 483 260    wiktor.isowski@email.pl
Maciej Adoski          3,3,3,3       Poznań ul.Rudzka 61               29.09.1998           492 167 167    maciej.adoski@email.pl
Adam Lubelski          4,3,3,5       Poznań ul.Tywoska 29              17.05.1998           867 267 582    adam.lubelski@email.pl
Julita Gelk            3,3,4,4       Poznań ul.Puska 88                28.04.1998           367 298 199    julita.gelk@email.pl
Filip Hoska            4,4,4,4       Poznań ul.Dąbrowa 46              10.10.1998           478 298 277    filip.hoska@email.pl
Weronika Olkwia        5,5,5,3       Poznań ul.Godka 28                13.09.1998           139 267 509    weronika.olkwia@email.pl
Oliwia Silska          5,5,5,5       Poznań ul.Lisowa 77               23.04.1998           999 466 288    oliwia.silska@email.pl
Mariusz Wojoch         4,3,3,3       Poznań ul.Kępowksa 34             06.03.1998           381 199 378    mariusz.wojoch@email.pl
Emilia Pomska          5,5,5,5       Poznań ul.Dokowa 33               01.01.1998           234 582 199    emilia.pomska@email.pl
Damian Torch           4,3,4,3       Poznań ul.Wolińska 90             30.07.1998           378 299 999    damian.torch@email.pl
Magdalena Eliska       4,5,3,3       Poznań ul.Wygdy 56                04.06.1998           768 467 698    magdalena.eliska@email.pl

Rok 3 - Informatyka
Kamil Roliski          5,5,5,5       Poznań ul.Kępy 79                 02.02.1997           578 278 555    kamil.roliski@email.pl
Ignacy Dork            3,3,4,4       Poznań ul.Ewina 54                09.06.1997           566 282 299    ignacy.dork@email.pl
Ula Cholka             5,5,3,3       Poznań ul.Bosińska 85             27.05.1997           329 288 748    ula.cholka@email.pl
Karina Lwoska          4,5,3,3       Poznań ul.Czapli 20               25.10.1997           649 287 199    karina.lwoska@email.pl
Adrain Glekowski       5,5,5,3       Poznań ul.Komarowa 55             30.04.1997           278 188 408    adrian.glekowski@email.pl
Maja Choliska          4,4,4,4       Poznań ul.Oliska 23               18.09.1997           387 222 522    maja.choliska@email.pl
Wiktor Poskowski       5,5,4,3       Poznań ul.Gowicza 34              04.12.1997           499 278 468    wiktor.poskowski@email.pl
Kamila Susowska        5,4,3,3       Poznań ul.Leśna 61                07.09.1997           738 268 506    kamila.susowska@email.pl
Konrad Julski          4,4,3,3       Poznań ul.Torowa 95               15.02.1997           467 299 726    konrad.julski@email.pl
Igor Krolski           4,5,3,3       Poznań ul.Stopowa 45              30.05.1997           278 398 322    igor.krolski@email.pl
Anna Ekowska           5,5,5,5       Poznań ul.Przystaniowa 2          05.08.1997           674 888 278    anna.ekowska@email.pl
Marta Forgowa          5,4,3,3       Poznań ul.Uliskowska 60           22.04.1997           387 333 333    marta.forgowa@email.pl
Kamil Emolski          4,4,4,4       Poznań ul.Kępina 33               30.12.1997           444 728 126    kamil.emolski@email.pl
Marcin Lorelski        4,3,3,3       Poznań ul.Arktyczna 40            08.03.1997           826 904 647    marcin.lorelski@email.pl
Dominik Mak            3,3,3,5       Poznań ul.Morska 64               03.01.1997           478 492 279    dominik.mak@email.pl
Halina Dkowska         4,4,3,3       Poznań ul.Belińska 88             30.05.1997           267 837 888    halina.dkowska@email.pl
Marzena Losowa         5,5,5,3       Poznań ul.Goździkowa 32           29.08.1997           578 378 928    marzena.losowa@email.pl
Sylwia Grutka          5,5,5,5       Poznań ul.Kołobrzegowa 72         21.05.1997           368 728 298    sylwia.grutka@email.pl
Andrzej Rokski         5,3,3,4       Poznań ul.Maciejów 1              13.02.1997           845 389 888    andrzej.rokski@email.pl
Alicja Juska           4,3,3,3       Poznań ul.Torowicza 50            07.07.1997           222 888 368    alicja.juska@email.pl

Rok 3 - Ekonomia
Henryk Gok             4,3,3,3       Poznań ul.Krukowa 29              14.03.1997           582 478 278    henryk.gok@email.pl
Jadwiga Purska         5,5,5,5       Poznań ul.Saska 45                30.02.1997           493 279 958    jadwiga.purska@email.pl
Dawid Nolskowski       4,5,5,5       Poznań ul.Paryska 38              19.07.1997           583 664 267    dawid.nolskowski@email.pl
Magdalena Kosolska     5,5,3,3       Gdańsk ul.Rozewicza 57            18.04.1997           573 928 290    magdalena.kosolska@email.pl
Wiktoria Mochilska     4,4,4,4       Poznań ul.Ludowa 94               31.05.1997           583 228 293    wiktoria.mochilska@email.pl
Karol Madwig           5,4,4,4       Poznań ul.Wolska 30               04.07.1997           482 694 285    karol.madwig@email.pl
Renata Holko           5,5,3,3       Poznań ul.Morska 40               16.06.1997           387 843 277    renata.holko@email.pl
Wojciech Ochski        5,3,3,3       Poznań ul.Dworowa 77              20.04.1997          222 530 281    wojciech.ochski@email.pl
Kacper Sachalski       5,4,5,5       Poznań ul.Krasnowa 87             25.08.1997           583 299 764    kacper.sachalski@email.pl
Anna Gukska            5,5,5,5       Poznań ul.Morsa 20                21.05.1997           478 298 444    anna.gukska@email.pl
Wiktor Olwik           3,2,4,4       Poznań ul.Kacprowicza 34          05.02.1997           478 222 836    wiktor.olwik@email.pl
Sylwia Wrotewicz       3,4,4,4       Poznań ul.Harcewicza 21           18.05.1997           736 247 826    sylwia.wrotewicz@email.pl
Oliwia Doskowska       4,4,5,5       Poznań ul.Ulrańska 39             05.08.1997           274 367 299    oliwia.doskowska@email.pl
Emil Ikowski           4,4,4,4       Poznań ul.Fryderyka 71            30.11.1997           378 565 276    emil.ikowski@email.pl
Damian Ailski          5,4,3,3       Poznań ul.Dębowa 63               23.05.1997           566 298 466    damian.ailski@email.pl
Mirek Kafrok           4,4,4,4       Poznań ul.Gęsiego 4               07.03.1997           444 433 275    mirek.kafrok@email.pl
Joanna Cuscha          5,4,3,3       Poznań ul.Fokowa 55               24.06.1997           289 222 120    joanna.cuscha@email.pl
Dominik Kwarlski       3,4,4,4       Poznań ul.Tokowska 39             30.04.1997           389 444 567    dominik.kwarlski@email.pl
Joanna Koralowa        4,4,4,4       Poznań ul.Niedźwiedzia 40         05.02.1997           385 446 288    joanna.koralowa@email.pl
Anna Lowiska           4,5,3,3       Poznań ul.Kadrowska 29            09.04.1997           856 367 576    anna.lowiska@email.pl

Rok 3 - Zarządzanie
Adam Rodski            4,5,5,3       Poznań ul.Makowa 49               03.02.1997           372 738 488    adam.rodski@email.pl
Maciej Falski          4,4,4,4       Poznań ul.Ludowa 78               24.05.1997           239 455 929    maciej.falski@email.pl
Igor Nokalski          5,5,3,3       Poznań ul.Kusowicza 40            17.07.1997           178 367 287    igor.nokalski@email.pl
Monika Wachska         4,5,5,3       Poznań ul.Elfowa 35               04.06.1997           567 287 466    monika.wachska@email.pl
Irena Sokolska         4,5,5,5       Poznań ul.Tarzyńska 96            08.11.1997           443 446 288    irena.sokolska@email.pl
Tomasz Dwik            5,5,5,5       Poznań ul.Gochlińska 84           02.05.1997           174 366 277    tomasz.dwik@email.pl
Robert Gachlik         5,4,3,3       Poznań ul.Pawłowicza 23           28.09.1997           578 846 466    robert.gachlik@email.pl
Magdalena Sochlin      5,5,5,5       Poznań ul.Zotkowska 57            16.05.1997           222 472 583    magdalena.sochlin@email.pl
Igor Kalcyk            4,4,4,4       Poznań ul.Domańska 33             19.10.1997           735 376 566    igor.kalcyk@email.pl
Gracjan Tachowski      4,5,5,5       Poznań ul.Hycla 66                12.12.1997           452 777 356    gracjan.tachowski@email.pl
Jadwiga Gryk           5,3,2,3       Poznań ul.Maciechowska 22         04.05.1997           746 288 455    jadwiga.gryk@email.pl
Piotr Juschin          4,3,3,3       Poznań ul.Daszyńskiego 58         04.06.1997           275 645 455    piotr.juschin@email.pl
Dorota Jawik           4,5,5,5       Poznań ul.Grochowska 34           08.03.1997           672 457 644    dorota.jawik@email.pl
Fryderyk Malwikowski   5,3,3,3       Poznań ul.Gwilska 57              15.05.1997           467 567 290    fryderyk.malwikowski@email.pl
Grzegorz Salkowski     5,5,5,5       Poznań ul.Rukowska 48             10.11.1997           987 367 254    grzegorz.salkowski@email.pl
Justyna Zytkiewicz     4,4,4,4       Poznań ul.Warchowicza 21          30.11.1997           308 268 555    justyna.zytkiewicz@email.pl
Klaudia Murska         5,3,3,3       Poznań ul.Salowska 64             16.04.1997           356 487 736    klaudia.murska@email.pl
Wojciech Marowski      4,4,4,5       Poznań ul.Wolicza 20              11.05.1997           456 224 444    wojciech.marowski@email.pl
Weronika Kliaska       5,4,3,3       Poznań ul.Dawilska 92             16.02.1997           333 654 888    weronika.kliaska@email.pl
Radek Jelchin          5,4,4,3       Poznań ul.Maczkowa 47             10.05.1997           756 278 888    radek.jelchin@email.pl

 */
