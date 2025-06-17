from datetime import datetime, timedelta

m, n = map(int, input().split())
y = int(input())

a, b = [], []
d = datetime(y, 1, 1)
c = 0

while d.year == y:
    if c % 20 != 0:
        s = d
        e = s + timedelta(days=m - 1)
        if e.year != y:
            e = datetime(y, 12, 31)
        a.append((s, e))
        d = e + timedelta(days=1)
    else:
        s = d
        e = s + timedelta(days=n - 1)
        if e.year != y:
            e = datetime(y, 12, 31)
        b.append((s, e))
        d = e + timedelta(days=1)
    c += 1

print("City A:")
for i in a:
    print(i[0].strftime("%d-%b-") + f"{i[0].year:04d}" + " to " + i[1].strftime("%d-%b-") + f"{i[1].year:04d}")

print("City B:")
for j in b:
    print(j[0].strftime("%d-%b-") + f"{j[0].year:04d}" + " to " + j[1].strftime("%d-%b-") + f"{j[1].year:04d}")

# Input:

# 30 30

# 2021

# Output:

# City A:

# 01-Jan-2021 to 30-Jan-2021

# 02-Mar-2021 to 31-Mar-2021

# 01-May-2021 to 30-May-2021

# 30-Jun-2021 to 29-Jul-2021

# 29-Aug-2021 to 27-Sep-2021

# 28-Oct-2021 to 26-Nov-2021

# 27-Dec-2021 to 31-Dec-2021

# City B:

# 31-Jan-2021 to 01-Mar-2021

# 01-Apr-2021 to 30-Apr-2021

# 31-May-2021 to 29-Jun-2021

# 30-Jul-2021 to 28-Aug-2021

# 28-Sep-2021 to 27-Oct-2021

# 27-Nov-2021 to 26-Dec-2021

# Explanation:

# Here M-30, N-30 and Y-2021.

# The doctor visiting slots in the city A for the year 2021 is given below.

# 01-Jan-2021 to 30-Jan-2021

# 02-Mar-2021 to 31-Mar-2021

# 01-May-2021 to 30-May-2021

# 30-Jun-2021 to 29-Jul-2021

# 29-Aug-2021 to 27-Sep-2021

# 28-Oct-2021 to 26-Nov-2021

# 27-Dec-2021 to 31-Dec-2021

# The doctor visiting slots in the city B for the year 2021 is given below.

# 31-Jan-2021 to 01-Mar-2021

# 01-Apr-2021 to 30-Apr-2021

# 31-May-2021 to 29-Jun-2021

# 30-Jul-2021 to 28-Aug-2021

# 28-Sep-2021 to 27-Oct-2021

# 27-Nov-2021 to 26-Dec-2021
