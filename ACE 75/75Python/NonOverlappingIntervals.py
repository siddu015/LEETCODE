from typing import List

class Solution(object):
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[1])
        count = 1
        ps, pe = intervals[0]
        for s, e in intervals:
            if s < pe:
                continue
            else:
                ps, pe = s, e
                count += 1
        return len(intervals) - count

