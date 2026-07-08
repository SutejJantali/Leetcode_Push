class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key = lambda x: (x[0], -x[1]))

        res = len(intervals)

        start = intervals[0][0]
        end = intervals[0][1]

        for i in range(1, len(intervals)):
            if intervals[i][0] >= start and intervals[i][1] <= end:
                res -= 1
            else:
                start = intervals[i][0]
                end = intervals[i][1]
        
        return res