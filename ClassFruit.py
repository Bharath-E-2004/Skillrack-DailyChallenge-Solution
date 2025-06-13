class Fruit:
    count = 0
    totalQuantity = 0

    def __init__(self, name, quantity):
        self.name = name
        self.quantity = quantity
        Fruit.count += 1
        Fruit.totalQuantity += self.quantity

    def __del__(self):
        Fruit.totalQuantity -= self.quantity
        Fruit.count-=1

    def __str__(self):
        return self.name + " : " + str(self.quantity)


# The calling code Hello.py is given below.

# from fruit import Fruit

# N= int(input())

# fruits = []

# for ctr in range(N):

# name, quantity input().split()

# fruit Fruit(name, int (quantity))

# fruits.append(fruit)

# print(Fruit.count)

# print(Fruit.totalQuantity)

# X= int(input())

# del fruits[X-1]

# for fruit in fruits:

# print(fruit)

# print(Fruit.count)

# print(Fruit.totalQuantity)

# Example Input/Output 1:

# Input:

# 4

# Apple 10

# Orange 5

# Mango 15

# Banana 4

# 3

# Output:

# 4 34

# Apple: 10

# Orange: 5

# Banana: 4

# 3

# 19
