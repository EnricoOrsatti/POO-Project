/* data class DataSet(val data: List<Double>)
fun DataSet.mean(): Double {
    return if (data.isNotEmpty()) {
        data.sum() / data.size
    } else {
        0.0
    }
}
fun DataSet.median(): Double {
    return if (data.isNotEmpty()) {
        val sortedData = data.sorted()
        val middle = sortedData.size / 2
        if (sortedData.size % 2 == 0) {
            (sortedData[middle - 1] + sortedData[middle]) / 2.0
        } else {
            sortedData[middle].toDouble()
        }
    } else {
        0.0
    }
}
fun main() {
    val dataSet = DataSet(listOf(1.0, 2.0, 3.0, 4.0, 5.0))
    println("Média: ${dataSet.mean()}")
    println("Mediana: ${dataSet.median()}")
}
