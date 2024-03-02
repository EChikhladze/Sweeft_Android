class MyCollection {
    private val valuesIndices = mutableListOf<Pair<Int, Int>>()
    private val valueOccurrencesMap = HashMap<Int, MutableList<Int>>()

    fun add(value: Int): Boolean {
        val index = valuesIndices.size
        valuesIndices.add(Pair(value, index))
        valueOccurrencesMap.getOrPut(value) { mutableListOf() }.add(index)

        return true
    }

    fun remove(value: Int): Boolean {
        if (!valueOccurrencesMap.containsKey(value)) return false

        val indexToRemove = valueOccurrencesMap[value]!!.last()
        val lastIndex = valuesIndices.size - 1
        val (lastValue, lastValueIndex) = valuesIndices[lastIndex]
        valuesIndices[indexToRemove] = Pair(lastValue, lastValueIndex)
        valueOccurrencesMap[value]!!.removeAt(valueOccurrencesMap[value]!!.lastIndex)

        if (valueOccurrencesMap[value]!!.isEmpty()) {
            valueOccurrencesMap.remove(value)
        }

        if (indexToRemove != lastIndex) {
            valueOccurrencesMap[lastValue]!!.remove(lastIndex)
            valueOccurrencesMap[lastValue]!!.add(indexToRemove)
        }

        valuesIndices.removeAt(lastIndex)

        return true
    }

    fun print() {
        for ((value, _) in valuesIndices) {
            print("$value ")
        }
        println()
    }
}