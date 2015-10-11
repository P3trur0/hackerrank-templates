import scala.io.StdIn

object Solution extends App {
  val n = StdIn.readInt
  (1 to n).map(_ => StdIn.readLine.split(" ").map(_.toInt).sum).foreach(println)
}
