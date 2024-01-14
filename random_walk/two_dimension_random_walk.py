import numpy as nump 
import pylab as pythonlab
import random as pyran
n = 2345 
x = nump.zeros(n) 
y = nump.zeros(n) 
steps=["NORTH","SOUTH","EAST","WEST"] 
for i in range(1, n): 
    step = pyran.choice(steps) 
    if step == "EAST": 
        x[i] = x[i - 1] + 1
        y[i] = y[i - 1] 
    elif step == "WEST": 
        x[i] = x[i - 1] - 1
        y[i] = y[i - 1] 
    elif step == "NORTH": 
        x[i] = x[i - 1] 
        y[i] = y[i - 1] + 1
    else: 
        x[i] = x[i - 1] 
        y[i] = y[i - 1] - 1
pythonlab.title("Two Dimensional Random Walk")
pythonlab.plot(x, y) 
pythonlab.show()