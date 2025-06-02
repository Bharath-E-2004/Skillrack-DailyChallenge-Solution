import java.util.;

public class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int size=sc.nextInt();

int rooms[]=new int[size];

int minutes=0;

for(int i=0;i<size;i++)

rooms[i]=sc.nextInt();

int i=0;

while(i<size){

while(i<size && rooms [i]==0){

i++;

}

minutes++;

for(int j=0;j<size;j++){(

rooms[j]^=1;

} System.out.println(minutes-1);

}

}
  /*
    N rooms are constructed in a row, which are numbered from 1 to N. Each room has a door on the left side. A boy wants to reach the Nth room starting from the 1st room. Every minute, the doors are open and close automatically. The program must accept N integers representing the initial state of the N doors as the input. O indicates that the door is opened and 1 indicates that the door is closed. The boy can cross any number of rooms in a minute if the doors of the rooms are opened. Else he must wait till the door opens. The program must print the minimum number of minutes required to reach the Nth room as the output.

Boundary Condition(s):

1 <= N <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the minimum number of minutes required to reach the Nth room.

Example Input/Output 1:

Input:

5

10110

Output: 4
   */
