package Classes
import  java.io.File

class ReadCSV(CSVHere: File) {
        fun CSVreader(){
            val filePath = "CSVHere"
            val file = File(filePath)

        file.forEachLine { line ->
            val tokens = line.split(",")

            println(tokens)
        }
    }
}