fun binarySum(num1: String, num2: String): String {
    val intNum1 = num1.toInt(2)
    val intNum2 = num2.toInt(2)
    val intSum = intNum1 + intNum2

    return intSum.toString(2)
}