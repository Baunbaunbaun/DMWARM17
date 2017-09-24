# DMWARM17
This is my answer to the Pathfinder problem at the DM Warmup coding competition at DIKU :-) Took me a while, but I managed.
The solution needed to be able to show the way through a maze of #'s and we should plot the solution as *'s through the maze - from top left corner to the low right corner. 

The algorithmic a approach I chose was pac man style. Fill up the whole maze with *'s and let the algorithm eat everyone with only one neighbour. This removes all the deadends.  
