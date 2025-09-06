import java.util.*;

class Address {
    private int doorNumber = 100;
    private String streetName = "ABC";
    private String cityName = "XYZ";
    private String stateName = "MNO";
    private int pinCode = 666666;

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }

    public void setState(String stateName) {
        this.stateName = stateName;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return cityName;
    }

    public String getState() {
        return stateName;
    }

    public int getPinCode() {
        return pinCode;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address addr = new Address();

        int X = sc.nextInt();
        sc.nextLine(); // consume newline

        if (X != 0) {
            addr.setDoorNumber(sc.nextInt());
            sc.nextLine(); // consume newline
            addr.setStreetName(sc.nextLine());
            addr.setCity(sc.nextLine());
            addr.setState(sc.nextLine());
            addr.setPinCode(sc.nextInt());
        }

        System.out.println(addr.getDoorNumber());
        System.out.println(addr.getStreetName());
        System.out.println(addr.getCity());
        System.out.println(addr.getState());
        System.out.println(addr.getPinCode());
    }
}
/*
The program accepts an integer X as the input. If the value of X is a nonzero value, then the address(door number, street name, city name, state name and pincode) of person is passed as the input. Else the default address must be as given below.

Door Number: 100

Street Name: ABC Street

City Name: XYZ City

State Name: MNO State

Pincode: 666666

Finally, the program prints the address(door number, street name, city name, state name and pincode) of the person.

Your task is to define the class Address so that the program runs successfully.

Example Input/Output 1:

Input

1

Jacob Road

241 Jaipur Rajasthan

302001

Output

241 Jacob Road

Jaipur Rajasthan

302001

Example Input/Output 2:

Input

0

Output:

100

ABC Street

XYZ City MNO State

666666
*/
