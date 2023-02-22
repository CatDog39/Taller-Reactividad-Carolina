import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        City ciudad1 = new City(100,"Medellin","CO",4500);
        City ciudad2 = new City(101,"Bogota","CO",6500);
        City ciudad3 = new City(102,"Rosario","AR",3000);
        City ciudad4 = new City(103,"Buenos Aires","AR",1500);
        City ciudad5 = new City(104,"Madrid","ES",3200);
        City ciudad6 = new City(105,"Barcelona","ES",1062);
        City ciudad7 = new City(106,"Wuhan","CN",1085);
        City ciudad8 = new City(107,"Pekin","CN",2154);

        List<City> cities = Arrays.asList(ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,ciudad6,ciudad7,ciudad8);

        Country c1 = new Country("CO","Colombia","America",5152,1139,7,"Bogota");
        Country c2 = new Country("AR","Argentina","America",4581,278,4,"Buenos Aires");
        Country c3 = new Country("ES","España","Europa",4742,5059,8,"Madrid");
        Country c4 = new Country("CN","China","Asia",14125,9597,6,"Pekin");

        List<City> listColombia = Arrays.asList(ciudad1,ciudad2);
        List<City> listArgentina = Arrays.asList(ciudad3,ciudad4);
        List<City> listEspaña = Arrays.asList(ciudad5,ciudad6);
        List<City> listChina = Arrays.asList(ciudad7,ciudad8);

        c1.setCities(listColombia);
        c2.setCities(listArgentina);
        c3.setCities(listEspaña);
        c4.setCities(listChina);



        System.out.println("1. Ciudad mas poblada de cada pais ");
        c1.getCities()
                .stream()
                .max((n1,n2) ->n1.getPopulation()-n2.getPopulation())
                .ifPresent(System.out::println);
        c2.getCities()
                .stream()
                .max((n1,n2) ->(n1.getPopulation()-n2.getPopulation()))
                .ifPresent(System.out::println);
        c3.getCities()
                .stream()
                .max((n1,n2) ->(n1.getPopulation()-n2.getPopulation()))
                .ifPresent(System.out::println);
        c4.getCities()
                .stream()
                .max((n1,n2) ->(n1.getPopulation()-n2.getPopulation()))
                .ifPresent(System.out::println);
        System.out.println();

        System.out.println("2. Encontrar la ciudad más poblada de cada continente");
        //List<List<String>> America = Arrays.asList(listColombia,listArgentina);
        //America.stream().flatMap(lisAux -> lisAux.stream()).map(lista -> lista).forEach(System.out::println);

        c1.getCities()
                .stream()
                .max((n1,n2) -> (ciudad1.getPopulation() - ciudad2.getPopulation())-(ciudad3.getPopulation() - ciudad4.getPopulation()))
                .ifPresent(System.out::println);
        c3.getCities()
                .stream()
                .max((n1,n2) -> (ciudad5.getPopulation() - ciudad6.getPopulation()))
                .ifPresent(System.out::println);
        c4.getCities()
                .stream()
                .max((n1,n2) -> (ciudad7.getPopulation() - ciudad8.getPopulation()))
                .ifPresent(System.out::println);
        System.out.println();


        //c1.getCities().stream().max((n1,n2) -> (c2.getPopulation() - c1.getPopulation())).ifPresent(System.out::println);
       // c2.getCities().stream().max((n1,n2) -> (c4.getPopulation() - c3.getPopulation())).ifPresent(System.out::println);
        //c1.setContinent().stream;

       System.out.println("3. Encontrar la capital más poblada");
        List<Country> paises = Arrays.asList(c1,c2,c3,c4);
        paises.stream()
                .max((n1,n2) -> (c1.getPopulation() - c2.getPopulation() - c3.getPopulation() - c4.getPopulation()))
                .ifPresent(System.out::println);

        System.out.println();


        //c1.getCities().stream().max((n1,n2) -> (c2.))

        System.out.println("4. Lista de paises por cantidad de ciudades");

        paises.stream().sorted(new CompararPaises()).forEach(System.out::println);



    }
}