fun main(args: Array<String>) {
    println("Unique number is ${singleNumber(intArrayOf(1, 1, 2, 2, 2, 3, 4, 4))}")
    println("-----------------------------------")
    println("Minimum number of coins needed is ${minSplit(86)}")
    println("-----------------------------------")
    println("Longest prefix is \"${longestPrefix(arrayOf("extract", "exhale", "excavate"))}\"")
    println("-----------------------------------")
    println("1010 + 1011 = ${binarySum("1010", "1011")}")
    println("-----------------------------------")
    println("Number of variants to climb 6 stairs is ${countVariants(6)}")
    println("-----------------------------------")

    val myCollection = MyCollection()
    myCollection.add(0)
    myCollection.add(1)
    myCollection.add(2)
    print("Original contents: ")
    myCollection.print()
    myCollection.remove(1)
    print("Contents after removal: ")
    myCollection.print()
}