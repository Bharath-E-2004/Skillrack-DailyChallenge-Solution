import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        char[][] port = new char[r][c];
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                port[i][j] = sc.next().charAt(0);
            }
        }
        
        int minutes = 0;
        
        while(hasShipOrBoat(port)) {
            minutes++;
            
            if(minutes % 2 == 1) {
                // Odd minute → process columns (North)
                for(int j = 0; j < c; j++) {
                    for(int i = 0; i < r; i++) {
                        
                        if(port[i][j] == '#') {
                            
                            // Check if path north is clear
                            boolean blocked = false;
                            for(int k = 0; k < i; k++) {
                                if(port[k][j] == '#') {
                                    blocked = true;
                                    break;
                                }
                            }
                            
                            if(!blocked) {
                                // Check if vertical ship
                                if(i + 1 < r && port[i+1][j] == '#') {
                                    port[i+1][j] = '*';
                                }
                                
                                port[i][j] = '*';
                            }
                            break;
                        }
                    }
                }
            } else {
                // Even minute → process rows (West)
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < c; j++) {
                        
                        if(port[i][j] == '#') {
                            
                            // Check if path west is clear
                            boolean blocked = false;
                            for(int k = 0; k < j; k++) {
                                if(port[i][k] == '#') {
                                    blocked = true;
                                    break;
                                }
                            }
                            
                            if(!blocked) {
                                // Check if horizontal ship
                                if(j + 1 < c && port[i][j+1] == '#') {
                                    port[i][j+1] = '*';
                                }
                                
                                port[i][j] = '*';
                            }
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.println(minutes);
    }
    
    public static boolean hasShipOrBoat(char[][] port) {
        for(char[] row : port) {
            for(char ch : row) {
                if(ch == '#') return true;
            }
        }
        return false;
    }
}
/*
The program must accept a character matrix of size R°C representing a port as the input. The character asterisk (*) represents water. The character hash symbol (#) represents a boat. Two consecutive hash symbols (vertically or horizontally) represent a ship. The vertical ships can move only towards the north. The horizontal ships can move only towards the west. The boats can move towards north or west. The boats and ships leave the port based on the following conditions.

- Every odd minute, the first occurring boat or the vertical ship in each column leave the port (towards north).

- Every even minute, the first occurring boat or the horizontal ship in each row leave the port (towards west).

- A boat or ship cannot move if there is another boat or ship on its way.

The program must print the number of minutes it takes to empty the port as the output.

Boundary Condition(s):

2 <= R, C <= 25

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C characters separated by a space.

Output Format:

The first line contains the number of minutes it takes to empty the port.
*/
