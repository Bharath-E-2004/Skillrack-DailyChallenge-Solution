n=input().split()
r=[]
a=[]
for w in n:
  if w=="Ctrl+C":
    a=r[:]
  elif w=="Ctrl+V":
    r+=a
  else:
    r.append(w)
print(" ".join(r))

# Example Input/Output 1:

# Input:

# hi Ctrl+C Ctrl+V how are you

# Output:

# hi hi how are you

# Explanation:

# Ctrl+C copies the word hi. Ctrl+V pastes the word hi. Hence the output is hi hi how are you

# Example Input/Output 2:

# Input:

# Rat and Ctrl+V Cat Ctrl+C Ctrl+V Ctrl+C Ctrl+V

# Output:

# Rat and Cat Rat and Cat Rat and Cat Rat and Cat

# Example Input/Output 3:

# Input:

# apple mango Ctrl+C Ctrl+V Ctrl+V grapes banana

# Output

# apple mango apple mango apple mango grapes banana

# Example Input/Output 4:

# Input

# a Ctrl+C an Ctrl+C the Ctrl+V

# Output

# a an the a an
