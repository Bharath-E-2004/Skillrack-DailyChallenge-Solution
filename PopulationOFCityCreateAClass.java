import java.util.*;

class City implements Comparable<City> {
    String cityName;
    int men;
    int women;
    int total;

    public City(String cityName, int men, int women) {
        this.cityName = cityName;
        this.men = men;
        this.women = women;
        this.total = men + women;
    }

    @Override
    public int compareTo(City other) {
        if (this.total != other.total) {
            return other.total - this.total;
        }
        if (this.men != other.men) {
            return other.men - this.men;
        }
        return this.cityName.compareTo(other.cityName);
    }

    @Override
    public String toString() {
        return cityName + " " + men + " " + women;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        List<City> cities = new ArrayList<>();
        for (int ctr = 1; ctr <= N; ctr++) {
            String[] currCity = sc.nextLine().trim().split("\\s+");
            cities.add(new City(currCity[0], Integer.parseInt(currCity[1]), Integer.parseInt(currCity[2])));
        }

        Collections.sort(cities);

        for (City city : cities) {
            System.out.println(city);
        }
    }
}

/*
  import java.util.*;

class City implements Comparable<City> {
    String cityName;
    int men;
    int women;
    int total;

    public City(String cityName, int men, int women) {
        this.cityName = cityName;
        this.men = men;
        this.women = women;
        this.total = men + women;
    }

    @Override
    public int compareTo(City other) {
        if (this.total != other.total) {
            return other.total - this.total;
        }
        if (this.men != other.men) {
            return other.men - this.men;
        }
        return this.cityName.compareTo(other.cityName);
    }

    @Override
    public String toString() {
        return cityName + " " + men + " " + women;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        List<City> cities = new ArrayList<>();
        for (int ctr = 1; ctr <= N; ctr++) {
            String[] currCity = sc.nextLine().trim().split("\\s+");
            cities.add(new City(currCity[0], Integer.parseInt(currCity[1]), Integer.parseInt(currCity[2])));
        }

        Collections.sort(cities);

        for (City city : cities) {
            System.out.println(city);
        }
    }
}
  
*/
