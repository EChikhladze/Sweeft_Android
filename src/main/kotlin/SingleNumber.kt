fun singleNumber(nums: IntArray): Int {
    var res = 0
    val numTrackerMap = HashMap<Int, Int>()

    for (num in nums) {
        numTrackerMap[num] = numTrackerMap.getOrDefault(num, 0) + 1
    }

    for ((num, count) in numTrackerMap) {
        if (count == 1) {
            res = num
        }
    }

    return res
}