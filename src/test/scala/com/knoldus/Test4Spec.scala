package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class Test4Spec extends AnyFlatSpec{
  "The giveFour" should "return four" in {
    assert(4 == new Test4().giveFour())
  }
}
