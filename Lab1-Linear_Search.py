import random 
import time
import numpy as np
import matplotlib.pyplot as plt

def search(myList, k):
    for x in range(len(myList)):
        if myList[x] == k:
            return True
    return False


#generate a list of size n 
def generateRandos(n):

    myList = []

    for i in range(n):
        k = random.randint(0,1000000)
        if (search(myList,k) == False):
            myList.append(k) 
        else:
            while (True):
                k = random.randint(0,1000000)
                if (search(myList, k) == False):
                    myList.append(k)
                    break
                else:
                    k = random.randint(0,1000000)
    return myList

#general case experiment function
def runExperiment(n,key):
    myNumbers = generateRandos(n)
    myNumbers.insert(0,1)
    start = time.perf_counter_ns()
    search(myNumbers, key)
    end = time.perf_counter_ns()
    differnce = end - start
    return differnce

#Experiments, best case when the key is the first item in the list
bestCase_100 = runExperiment(100,1)
print(bestCase_100)
bestCase_1000 = runExperiment(1000,1)
print(bestCase_1000)
bestCase_10000 = runExperiment(10000,1)
print(bestCase_10000)

#Experiments, worst case case when the key is not in the list.
worstCase_100 = runExperiment(100,-1)
print(worstCase_100)
worstCase_1000 = runExperiment(1000,-1)
print(worstCase_1000)
worstCase_10000 = runExperiment(10000,-1)
print(worstCase_10000)

#Experiments, average case, using a random index int the array
x = random.randint(0,1000000)
averageCase_100 = runExperiment(100,x)
print(averageCase_100)
averageCase_1000 = runExperiment(1000,x)
print(averageCase_1000)
averageCase_10000 = runExperiment(10000,x)
print(averageCase_10000)

xBest = np.array([100,1000,10000])
yBest = np.array([bestCase_100,bestCase_1000,bestCase_10000])

xWorst = np.array([100,1000,10000])
yWorst = np.array([worstCase_100,worstCase_1000,worstCase_10000])

xAverage = np.array([100,1000,10000])
yAverage = np.array([averageCase_100,averageCase_1000,averageCase_10000])

plt.xlabel("Input size (n)")
plt.ylabel("Time in nanoseconds")
plt.title("Performance of Linear Search")

plt.grid(True)

plt.plot(xBest,yBest,label="Best Case", color='green')
plt.plot(xWorst,yWorst,label="Worst Case", color='red')
plt.plot(xAverage,yAverage,label="Average Case",color= 'blue')

plt.legend(title="Cases")

plt.show()


#My goal is to run the experiment with lists of 100,1000,10000