package org.dummy

class AddSubtract implements Serializable {
  private Integer a
  private Integer b
  private Integer sum
  private Integer sub
  
  AddSubtract(a, b) {
    this.a=a
    this.b=b
    this.sum=a+b
    this.sub=a-b
  }


  String isSumBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no"
  }

  String isSumBiggerThan100() {
    return (this.sum > 100) ? "yes" : "no"
  }

  String isSubBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no"
  }

  String isSubmBiggerThan100() { 
    return (this.sub > 100) ? "yes" : "no"
  }

  Integer geta() {
    return this.a
  }
  
  Integer getb() {
    return this.b
  }
}

