package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Test2Spec extends AnyFlatSpec{
  "The giveTwo" should "return two" in {
    assert(2 == new Test2().giveTwo())
  }
}
