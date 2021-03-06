package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c > r || c < 0) 0
    else if ( r == 0 ) 1
    else {
      return pascal(c,r-1) + pascal(c-1,r-1) 
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def balanced(charas: List[Char], status: Int): Int = {
      if (charas.isEmpty) status
      else if (charas.head == '(') balanced(charas.tail,status+1)
      else if (charas.head == ')') balanced(charas.tail,status-1)
      else balanced(charas.tail,status)
    }
    
    if (balanced(chars,0) == 0) true
    else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
