package no.hib.dpf.text.scala.ct.test;

import no.hib.dpf.text.scala.ct._

import scala.collection.mutable.{ Map => MMap }
import scala.collection.mutable.{ Set => MSet }
import no.hib.dpf.text.scala.ct.mutable.MGraph

/**
 * Test cases for some constructions from category in category (typed) graph.
 * Unfortunately, the test cases have to be "manually" checked (by the printouts).
 * It would be nice to specify the necessary assertions and to transform all test-cases into JUnit tests.
 */
//TODO: Transform tests into JUNIT tests.
object TestCases {

  val print = false;

  def main(args: Array[String]) {
    val start = System.currentTimeMillis()
    val N = 100;
    for (i <- 1 to N) {
      testCase1
      testCase2
      testCase3
      testCase4
      testCase5
      testCase6
      testCase7
      testCase8
      testCase9
      testCase10
      testCase11
      testCase12
      testCase13
      testCase14
      testCase15
    }
    println("Needed for " + N + " executions:" + (System.currentTimeMillis() - start))
  }

  //Ids:
  private var i = 0;
  def gen() = {
    i += 1;
    RId(Set(1000 + i));
  }

  /**
   * Make node
   */
  private def node(i: Int): Node = Node(RId(Set(i)), Dpf.Graph.node);

  /**
   * Make arrow
   */
  private def arrow(i: Int, n1: Int, n2: Int): Arrow = Arrow(RId(Set(i)), Node(RId(Set(n1)), Dpf.Graph.node), Node(RId(Set(n2)), Dpf.Graph.node), Dpf.Graph.arrow)

  /**
   * Test Pushout (Fudamentals of Algebraic Graph Transformation, page. 31 )
   */
  private def testCase1: Unit = {

    //G_A
    val a10 = arrow(10, 1, 2)
    val a11 = arrow(11, 1, 3)

    //G_B
    val a12 = arrow(12, 4, 5)
    val a13 = arrow(13, 6, 7)

    //G_C
    val a14 = arrow(14, 8, 8)
    val a15 = arrow(15, 8, 9)

    val x = ArbitraryMorphism(Set(), Set(
      (Some(a10), a12),
      (Some(a11), a12),
      (None, a13)));

    val y = ArbitraryMorphism(Set(), Set(
      (Some(a10), a15),
      (Some(a11), a14)));

    val span = Span(x, y)

    val pushout: Cospan = span.pushout()

    if (print) println(pushout.left);
    if (print) println(pushout.right);
  }

  /**
   * Test Pushout Complement (Fudamentals of Algebraic Graph Transformation, page. 13 )
   */
  private def testCase2: Unit = {

    //G_L
    val a100 = arrow(100, 1, 2)
    val a101 = arrow(101, 1, 3)
    val a102 = arrow(102, 2, 3)

    //G_K
    val n21 = node(21)
    val n22 = node(22)

    //G_R
    val a300 = arrow(300, 31, 34)
    val a301 = arrow(301, 34, 32)
    val a302 = arrow(302, 31, 35)
    val a303 = arrow(303, 35, 32)

    //G_G
    val a400 = arrow(400, 41, 42)
    val a401 = arrow(401, 41, 43)
    val a402 = arrow(402, 42, 43)
    val a403 = arrow(403, 41, 46)
    val a404 = arrow(404, 46, 47)
    val a405 = arrow(405, 42, 47)

    val l = ArbitraryMorphism(Set((Some(n21), node(1)),
      (Some(n22), node(2))), Set((None, a100),
      (None, a101),
      (None, a102)));

    val r = ArbitraryMorphism(Set((Some(n21), node(31)),
      (Some(n22), node(32))), Set((None, a300),
      (None, a301),
      (None, a302),
      (None, a303)));

    val m = ArbitraryMorphism(Set(), Set(
      (Some(a100), a400),
      (Some(a101), a401),
      (Some(a102), a402),
      (None, a403),
      (None, a404),
      (None, a405)));

    val comp = Composition(l, m)

    val pushoutComplement: Composition = comp.pushoutComplement()

    if (print) println(pushoutComplement.m1);
    if (print) println(pushoutComplement.m2);

    val span = Span(pushoutComplement.m1, r)

    val pushout: Cospan = span.pushout()

    if (print) println(pushout.left);
    if (print) println(pushout.right);
  }

  private def testCase3: Unit = {

    //
    //Test Pushout (own Example)
    //

    //G_A
    val n1 = node(1)
    val n2 = node(2)
    val n3 = node(3)
    val n4 = node(4)

    //G_B
    val a9 = arrow(9, 5, 6)
    val a10 = arrow(10, 7, 8)

    //G_C
    //only non-reusable nodes: directly with node(x)

    val x = ArbitraryMorphism(Set(
      (Some(n1), node(5)),
      (Some(n2), node(6)),
      (Some(n3), node(7)),
      (Some(n4), node(8))), Set(
      (None, a9),
      (None, a10)));

    val y = ArbitraryMorphism(Set(
      (Some(n1), node(11)),
      (Some(n2), node(12)),
      (Some(n3), node(11)),
      (Some(n4), node(12))), Set());

    val span = Span(x, y)

    val pushout: Cospan = span.pushout()

    //println(pushout.left);
    //println(pushout.right);
  }

  /**
   * Test Pullback (Fudamentals of Algebraic Graph Transformation, page. 35 )
   */
  private def testCase4: Unit = {

    //G_C
    val a10 = arrow(10, 1, 2)
    val a11 = arrow(11, 2, 3)

    //G_B
    val a12 = arrow(12, 4, 5)
    val a13 = arrow(13, 4, 6)

    //G_D
    val a14 = arrow(14, 7, 8)
    val a15 = arrow(15, 7, 9)
    val a16 = arrow(16, 8, 9)

    val x = ArbitraryMorphism(Set(), Set(
      (Some(a12), a14),
      (Some(a13), a15)));

    val y = ArbitraryMorphism(Set(), Set(
      (Some(a10), a14),
      (Some(a11), a16)));

    val cospan = Cospan(x, y)

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  private def testCase5: Unit = {

    //
    //Test Pullback 2: Arrow 2 Node<-Arrow->Node (2 times)
    //

    //G_B
    val a101 = arrow(101, 4, 4)

    //G_C
    val a103 = arrow(103, 7, 8)
    val a104 = arrow(104, 7, 9)
    val a111 = arrow(111, 10, 7)
    val a112 = arrow(112, 11, 7)
    val a121 = arrow(121, 10, 8)
    val a122 = arrow(122, 11, 9)
    //loop ("new" with arrow-node-arrow):
    val a113 = arrow(113, 12, 7)
    val a123 = arrow(123, 12, 7)
    //loop ("old" only one arrow):
    val a105 = arrow(105, 7, 7)

    //G_D
    val a100 = arrow(100, 1, 1)
    val a110 = arrow(110, 3, 1)
    val a120 = arrow(120, 3, 1)

    val x = ArbitraryMorphism(Set(), Set(
      (Some(a101), a100),
      (None, a110),
      (None, a120)));

    val y = ArbitraryMorphism(Set(), Set(
      (Some(a103), a100),
      (Some(a104), a100),
      (Some(a111), a110),
      (Some(a112), a110),
      (Some(a121), a120),
      (Some(a122), a120),
      (Some(a113), a110),
      (Some(a123), a120),
      (Some(a105), a100)));

    val cospan = Cospan(x, y)

    if (print) println("is cospan: " + cospan.validate())
    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);
  }

  private def testCase6: Unit = {

    //
    //Test Pullback 3 (own Example):
    //

    val a3 = arrow(3, 1, 2)
    val a10 = arrow(10, 8, 9)

    val x = ArbitraryMorphism(Set(
      (Some(node(4)), node(1)),
      (Some(node(5)), node(2)),
      (Some(node(6)), node(1)),
      (Some(node(7)), node(2))), Set((None, a3)));

    val y = ArbitraryMorphism(Set(), Set((Some(a10), a3)));

    val cospan = Cospan(x, y)

    if (print) println("is cospan: " + cospan.validate())

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  private def testCase7: Unit = {

    //
    //Test Pullback 4 (own Example):
    //

    //D:
    val a1 = arrow(1, 7, 8)

    //B:
    val a2 = arrow(2, 9, 10)
    val a3 = arrow(3, 11, 12)
    val a4 = arrow(4, 9, 12)
    val a5 = arrow(5, 11, 10)

    //C:
    val a6 = arrow(6, 13, 14)

    val x = ArbitraryMorphism(Set(), Set((Some(a2), a1), (Some(a3), a1), (Some(a4), a1), (Some(a5), a1)));

    val y = ArbitraryMorphism(Set(), Set((Some(a6), a1)));

    val cospan = Cospan(x, y)

    if (print) println("is cospan: " + cospan.validate())

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  /**
   * Test Final Pullback Complement for Monic Matches: Sesqui-pushout rewriting (Andrea Corradini et. al.) Fig 3. Left-Part
   */
  private def testCase8: Unit = {

    //L:
    val n1 = node(1)

    //K:
    val n2 = node(2)
    val n3 = node(3)

    //A:
    val a11 = arrow(11, 4, 5);
    val a12 = arrow(12, 4, 6);
    val a13 = arrow(13, 4, 6);

    val alpha = ArbitraryMorphism(Set(
      (Some(n2), n1),
      (Some(n3), n1)), Set());

    val m = ArbitraryMorphism(Set(
      (Some(n1), node(4))), Set(
      (None, a11),
      (None, a12),
      (None, a13)));

    val comp = Composition(alpha, m)

    val pullbackComplement: Composition = comp.finalPullbackComplementMono();

    if (print) println(pullbackComplement.m1);
    if (print) println(pullbackComplement.m2);

  }

  private def testCase9: Unit = {

    //
    //Test Final Pullback Complement 1	  
    //

    //TL,I:
    val n1 = node(1)
    val n2 = node(2)
    val n3 = node(3)

    //TL,TI:
    val a11 = arrow(11, 1, 2);
    val a12 = arrow(12, 2, 3);

    //TI
    val a13 = arrow(13, 1, 3);

    //L
    //val n4 = node(4)   
    val n5 = node(5)
    val n6 = node(6)

    //val a14 = arrow(14,4,5);
    val a15 = arrow(15, 5, 6);

    val tl = ArbitraryMorphism(Set(
      (Some(n1), n1),
      (Some(n2), n2),
      (Some(n3), n3)), Set(
      (Some(a11), a11),
      (Some(a12), a12),
      (None, a13)));

    val tLi = ArbitraryMorphism(Set(
      //	 		  						 (Some(n4),node(1)),
      (Some(n5), node(2)),
      (Some(n6), node(3))), Set(
      //				  					  (Some(a14),a11),
      (Some(a15), a12)));

    val comp = Composition(tLi, tl)

    val pullbackComplement: Composition = comp.finalPullbackComplementMono();

    if (print) println(pullbackComplement.m1);
    if (print) println(pullbackComplement.m2);

  }

  private def testCase10: Unit = {

    //G_A
    val a13 = arrow(12, 4, 5)
    val a14 = arrow(14, 5, 6)

    //G_B
    val a10 = arrow(10, 1, 2)
    val a11 = arrow(11, 1, 3)
    val a12 = arrow(12, 2, 3)

    //G_C
    val a15 = arrow(15, 7, 7)
    val a16 = arrow(16, 7, 8)

    val x = ArbitraryMorphism(Set(), Set(
      (None, a11),
      (Some(a13), a10),
      (Some(a14), a12)));

    val y = ArbitraryMorphism(Set(), Set(
      (Some(a13), a15),
      (Some(a14), a16)));

    val span = Span(x, y)

    val pushout: Cospan = span.pushout()

    if (print) println(pushout.left);
    if (print) println(pushout.right);
  }

  private def testCase11: Unit = {

    //
    //Test Pullback: 
    //

    //G_B
    val a10 = arrow(10, 1, 2)
    val n3 = node(3)

    //G_C
    val a11 = arrow(11, 4, 5)

    //G_D
    val a12 = arrow(12, 6, 7)
    val a13 = arrow(13, 7, 8)
    val n8 = node(8)

    val x = ArbitraryMorphism(
      Set((Some(n3), n8)), Set(
        (Some(a10), a12),
        (None, a13)));

    val y = ArbitraryMorphism(Set(), Set(
      (None, a12),
      (Some(a11), a13)));

    val cospan = Cospan(x, y)

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  private def testCase12: Unit = {

    //
    //Test Pullback: 
    //

    //G_B
    val a10 = arrow(10, 1, 2)

    //G_C
    val n4 = node(4)

    //G_D
    val a11 = arrow(11, 3, 3)
    val n3 = node(3)

    val x = ArbitraryMorphism(
      Set(),
      Set((Some(a10), a11)));

    val y = ArbitraryMorphism(
      Set(((Some(n4), n3))),
      Set());

    val cospan = Cospan(x, y)

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  private def testCase13: Unit = {

    //
    //Test Pullback: 
    //

    //G_B
    val a10 = arrow(10, 1, 2)
    val n3 = node(3)

    //G_C
    val a11 = arrow(11, 4, 5)

    //G_D
    val a12 = arrow(12, 6, 7)
    val n6 = node(6)

    val x = ArbitraryMorphism(
      Set(((Some(n3), n6))),
      Set((Some(a10), a12)));

    val y = ArbitraryMorphism(
      Set(),
      Set((Some(a11), a12)));

    val cospan = Cospan(x, y)

    val pullback: Span = cospan.pullback()

    if (print) println(pullback.left);
    if (print) println(pullback.right);

  }

  private def testCase14: Unit = {

    //G_A
    val a10 = arrow(10, 1, 2)
    val n3 = node(3)

    //G_B
    val a11 = arrow(11, 4, 5)
    val n4 = node(4)

    //G_C
    val a12 = arrow(12, 6, 7)
    val n8 = node(8)

    val x = ArbitraryMorphism(
      Set((Some(n8), n3)),
      Set((Some(a12), a10)));

    val y = ArbitraryMorphism(
      Set((Some(n8), n4)),
      Set((Some(a12), a11)));

    val span = Span(x, y)

    val pushout: Cospan = span.pushout()

    if (print) println(pushout.left);
    if (print) println(pushout.right);
  }

  private def testCase15: Unit = {

    //PHD thesis Figure 6.4 

    //TL
    val a4 = arrow(4, 1, 2)

    //I (+L)
    val a9 = arrow(9, 5, 2)
    val a11 = arrow(11, 5, 3)
    val a10 = arrow(10, 6, 2)
    val a12 = arrow(12, 6, 4)

    //L
    val a7 = arrow(7, 2, 3)
    val a8 = arrow(8, 2, 4)
    val n1 = node(1)

    val x = ArbitraryMorphism(
      Set((Some(n1), n1)),
      Set((Some(a7), a7),
        (Some(a8), a8),
        (None, a9),
        (None, a10),
        (None, a11),
        (None, a12)));

    val y = ArbitraryMorphism(
      Set((Some(n1), n1)),
      Set((Some(a7), a4),
        (Some(a8), a4)));

    val span = Span(x, y)

    val pushout: Cospan = span.pushout()

    if (print) println(pushout.left);
    if (print) println(pushout.right);
  }

}
