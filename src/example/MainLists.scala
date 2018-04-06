package example

//import java.util.NoSuchElementException

object MainLists {
  def main(args: Array[String]) {
    println("Testing the fonction sum et max for the lists")
    println(Lists.max(List(3,7,6)))
    println(Lists.sum(List(3,7,6)))
    println(Lists.max(List(-5,-8,4)), Lists.sum(List(-5,-8,4)))
    println(Lists.max(List(9)),Lists.sum(List(9)))
    println(Lists.max(List(-5,-33)),Lists.sum(List(-5,-33)))
  }
}