import collection.mutable.Stack
import org.scalatest._

class ExampleSpec extends FunSpec with Matchers {

  describe("A stack") {
    it("pops values in last-in-first-out order") {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() should be (2)
      stack.pop() should be (1)
    }

    it("throws NoSuchElementException if an empty stack is popped") {
      val emptyStack = new Stack[Int]
      a [NoSuchElementException] should be thrownBy {
        emptyStack.pop()
      }
    }
  }

}
