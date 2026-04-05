1class Solution:
2    def maximumPopulation(self, logs: List[List[int]]) -> int:
3        events = []
4        
5        # Create birth and death events
6        for birth, death in logs:
7            events.append((birth, 1))    # Birth increases population
8            events.append((death, -1))   # Death decreases population
9        
10        # Sort events by year
11        events.sort()
12        print(events)
13        
14        population = 0
15        max_population = 0
16        best_year = 0
17        
18        # Sweep through events and track maximum population
19        for year, change in events:
20            population += change
21            print(year)
22            print(change)
23            # Update only if we found a strictly greater population
24            # This ensures we get the earliest year with max population
25            if population > max_population:
26                max_population = population 
27                best_year = year
28                
29        return best_year