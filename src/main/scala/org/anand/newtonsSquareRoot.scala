package org.anand

/**
  * Sqare root algorithm with newtons method.
  */
object newtonsSquareRoot {

  def abs(x: Double) = if(x < 0) -x else x;

  def squareItr(guess: Double, x: Double) : Double =
    if (isGoodEnough(guess, x)) {
      guess
    } else {
      squareItr(improve(guess, x), x)
    }

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = squareItr(1.0, x);
}