fun longestPrefix(array: Array<String>): String {
    var prefix = ""

    outer@ for (ch in array[0]) {
        prefix += ch
        for (str in array) {
            if (!str.startsWith(prefix)) {
                prefix = prefix.dropLast(1)
                break@outer
            }
        }
    }

    return prefix
}