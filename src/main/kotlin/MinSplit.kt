fun minSplit(amount: Int): Int {
    val coins = arrayOf(1, 5, 10, 20, 50)
    val coinsSorted = coins.sortedArrayDescending()
    var remainingAmount = amount
    var count = 0

    for (coin in coinsSorted) {
        val coinCount = remainingAmount / coin
        remainingAmount -= coin * coinCount
        count += coinCount
    }

    return count
}