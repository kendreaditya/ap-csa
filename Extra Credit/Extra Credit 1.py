import math
import time


num = int(input("Enter a number: "))
start_time = time.time()
pow3 = int(math.log(num, 3))
remain = num - (3**pow3)
sub5 = 0

if remain % 5 == 0:
    while remain >= 0:
        remain -= 5
        sub5 += 1
    print("First take 3 to the power of " + str(pow3))
    print("Then add 5, " + str(sub5-1) + " times")

elif (num-1) % 5 == 0:
    while num >= 0:
        num -= 5
        sub5 += 1
    print("Add 5, " + str(sub5-1) + " times")
else:
    print("Not possible to reach")

print("--- %s seconds ---" % (time.time() - start_time))
