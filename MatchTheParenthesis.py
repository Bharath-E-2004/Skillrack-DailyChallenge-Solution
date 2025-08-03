a = input().strip()
b = input().strip()

depth = max_depth = index = 0

for j, ch in enumerate(a):
    depth += 1 if ch == '(' else -1
    if depth > max_depth:
        max_depth = depth
        index = j

# Insert string `b` after the deepest open parenthesis
print(a[:index + 1] + b + a[index + 1:])

# The program must accept two string values S1 and S2 as the input. Both S1 and S2 contain only parentheses, where each open parenthesis '(' has a matching close parenthesis ). The program must find the pair of parentheses P having the maximum depth(Le, the pair of parentheses with the maximum nesting level) in the string S1. If two or more pairs of parentheses have the same maximum depth, then consider the first occurring pair. Then the program must insert the string S2 into the pair of parentheses P. Finally, the program must print the revised string S1 as the output.

# Boundary Condition(s):

# 2 <= Length of S1, S2 <= 100

# Input Format:

# The first line contains S1.

# The second line contains S2.

# Output Format:

# The first line contains the revised string S1.

# Example Input/Output 1:

# Input:

# 0(0(0)X(0)X000)

# (0(0)0)

# Output:

# 0(0(((0(0)0))))(0) 000)

# Explanation:

# The first occurring pair of parentheses with the maximum depth 3 is highlighted below.

# 0(0(0)(0X000)

# After inserting S2 into the above highlighted parentheses, the string S1 becomes

# 0(0(((0(0)0))))((0)(000)
