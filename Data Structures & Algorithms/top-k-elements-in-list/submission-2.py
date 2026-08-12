import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = {}

        for num in nums:
            hashmap[num] = hashmap.get(num, 0) + 1

        heap = []

        for num, frequency in hashmap.items():
            heapq.heappush(heap, (frequency, num))

            if len(heap) > k:
                heapq.heappop(heap)

        result = []

        for frequency, num in heap:
            result.append(num)

        return result