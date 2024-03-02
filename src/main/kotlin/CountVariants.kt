fun countVariants(stairCount: Int): Int {
    if (stairCount <= 2) {
        return stairCount
    }

    return countVariants(stairCount - 1) + countVariants(stairCount - 2)
}