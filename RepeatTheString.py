s = input()  # Read the input string
p = []
i = 0

while i < len(s):
    n = 0
    while i < len(s) and s[i].isdigit():
        n = n * 10 + int(s[i])
        i += 1
    if i < len(s) and s[i].isalpha():
        p.append((n, s[i]))
        i += 1

# Generate and print the final string
for count, char in p:
    print(char * count, end="")
