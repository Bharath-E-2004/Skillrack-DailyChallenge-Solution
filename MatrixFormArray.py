n = int(input())
a = list(map(int, input().split()))
r, c = map(int, input().split())

m = [[0] * c for _ in range(r)]

i = 0
while i < n:
    for x in range(r - 1, -1, -1):
        y_range = range(c - 1, -1, -1) if (r - 1 - x) % 2 == 0 else range(c)
        for y in y_range:
            if i == n:
                break
            m[x][y] = a[i]
            i += 1
        if i == n:
            break

for row in m:
    print(row
         
# The program must accept N integers and two integers R, C as the input. The program must form an integer matrix of size R°C based on the following conditions.

# - Initially, the matrix must be filled with zeroes.

# - Then the program must fill the matrix with the given integers in horizontal zig-zag direction starting from the bottom-right cell. If N is greater than R*C, then the program must refill the matrix in horizontal zig-zag direction starting from the bottom-right cell till all the given integers are used.

# Finally, the program must print the integer matrix as the output.

# Boundary Condition(s):

# 1 <= N <= 10^4

# 1 <= Each integer value <= 10^5

# 2 <= R C <= 50

# Input Format:

# The first line contains N.

# The second line contains N integers separated by a space.

# The third line contains R and C separated by a space.

# Output Format:

# The first R lines, each contains C integers separated by a space.

# Example Input/Output 1:

# Input:

# 11

# 10 20 30 40 11 22 33 44 50 60 70

# 33

# Output:

# 50 44 33

# 40 11 22

# 30 70 60

# Explanation:

# Here N = 11 R = 3 and C = 3

# The size of the integer matrix is 3*3.

# After filling the matrix based on the given conditions, the matrix becomes

# 50 44 33

# 40 11 22

# 30 70 60
