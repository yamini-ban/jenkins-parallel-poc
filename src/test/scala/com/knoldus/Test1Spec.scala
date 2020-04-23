package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Test1Spec extends AnyFlatSpec{
  "The giveOne" should "return one" in {
    assert(1 == new Test1().giveOne())
  }

}
