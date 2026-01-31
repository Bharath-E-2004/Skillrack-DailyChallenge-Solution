class Stick {
    private int StickLen;

    public Stick(int len) {
        this.StickLen = len;
    }

    public void combineStick(Stick s) {
        if (s.StickLen == 0) {
            System.out.println("Length of the stick cannot be zero");
            return;
        }
        this.StickLen += s.StickLen;
    }

    public void breakStick() {
        if (StickLen % 2 == 0) {
            StickLen = StickLen / 2;
        } else {
            System.out.println("Length of the stick cannot be odd");
        }
    }

    public int getLength() {
        return StickLen;
    }
}

/*
The program must accept the length of a stick and Q queries as the input. The query can be any one of the following two types.

- If the query type is 1, then the program must combine the stick with the given stick of length X (where X is a non-negative integer). If the length of the stick to be combined is 0, then the program must print "Length of the stick cannot be zero".

- If the query type is 2, then the program must break the stick by dividing the length by 2 only if the length is even. Else the program must print "Length of the stick cannot be odd". After performing the operation of each query, the program must print the revised length of the

stick.

Your task is to define the class Stick so that the program runs successfully.

Example Input/Output 1:

Input:

120

5

1 15

2

15

2

10

Output:

135

Length of the stick cannot be odd 135 140

70

Length of the stick cannot be zero 70
*/
