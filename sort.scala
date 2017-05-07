import io.Source
val allLines = Source.fromFile("ComputerScienceGlossary.csv").getLines().toList
val sorted = allLines match {
  case head :: tail =>
    head :: tail.sorted
  case _ =>
    List.empty
}

import java.io.File
import java.io.PrintWriter
val pw = new PrintWriter(new File("ComputerScienceGlossary.csv"))
sorted.foreach(line => pw.write(line + "\n"))
pw.close()
