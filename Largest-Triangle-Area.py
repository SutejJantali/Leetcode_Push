class Solution:
    def largestTriangleArea(self, points: List[List[int]]) -> float:
        res = 0
        def area(P, Q, R):
            return 0.5 * abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
                             -P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0])
        for i in range(len(points)):
            for j in range(i+1, len(points)):
                for k in range(j+1, len(points)):
                    
                    res = max(res, area(points[i], points[j], points[k]))
        
        return res