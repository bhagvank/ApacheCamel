import numpy as nump
import matplotlib.pyplot as plot
def SingleDimensionRandomWalk(n): 
   x = 0
   y = 0
   xposition = [0]
   yposition = [0] 

   for i in range (1,n+1):
       step = nump.random.uniform(0,1)

       if step < 0.5:   
           x += 1
           y += 1  

       if step > 0.5:  
           x += 1
           y += -1 
 
       xposition.append(x)
       yposition.append(y)

   return [xposition,yposition]

OneDRandomWalk = SingleDimensionRandomWalk(2345) 
plot.plot(OneDRandomWalk[0],OneDRandomWalk[1],'r-', label = "RandomWalk1D") 
plot.title("One Dimensional Random Walks")
plot.show()