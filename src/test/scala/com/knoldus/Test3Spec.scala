package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Test3Spec extends AnyFlatSpec{
  "The giveThree" should "return three" in {
    assert(3 == new Test3().giveThree())
  }
}
