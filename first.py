#1.	Create a NumPy array of integers from 1 to 10 and print its data type and shape

# import python file 

import numpy as np 
for i in range(0,11):
    print(np.array(i))


# type of array
print(type(np.array(i)))


# shape of array 

print(np.array(i).shape)



#2.	Generate a 5×5 array filled with zeros and change the data type to int

arr = np.array(0).resize(5,5)
print(arr)






