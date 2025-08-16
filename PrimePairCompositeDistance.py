def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def find_prime_pair(N):
    if is_prime(N):
        print(-1)
        return

    # Sieve up to 2*N to find all primes
    limit = 2 * N + 1
    sieve = [True] * limit
    sieve[0] = sieve[1] = False
    for i in range(2, int(limit**0.5)+1):
        if sieve[i]:
            for j in range(i*i, limit, i):
                sieve[j] = False

    primes = [i for i, is_p in enumerate(sieve) if is_p]

    # Check consecutive primes
    for i in range(len(primes) - 1):
        x, y = primes[i], primes[i+1]
        if (x + y) // 2 == N and y - x == 2 * (N - x):
            print(x, y)
            return

    print(-1)

# Read input
N = int(input())
find_prime_pair(N)


# The program must accept an integer N as the input. The program must find two consecutive prime integers X and Y, where the middle integer in the range (X, Y) is equal to N (ie, N is a composite integer which is equidistant from two consecutive primes X and Y). If there is no such prime pair, then the program must print -1 as the output

# Boundary Condition(s):

# 2 <= N <= 10^5

# Input Format:

# The first line contains N.

# Output Format:

# The first line contains X and Y separated by a space or -1.

# Example Input/Output 1:

# Input 6

# Output 57

# Explanation:

# Here N = 6, which is a composite integer. So the prime pair is (5, 7). 6-5-7-6-1.

# Example Input/Output 2:

# Input: 473

# Output 467 479

# Example Input/Output 3:

# Input: 10

# Output:-1
