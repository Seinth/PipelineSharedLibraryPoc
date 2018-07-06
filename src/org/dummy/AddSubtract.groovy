package org.dummy;

class AddSubtract implements Serializable {
  private Integer a;
  private Integer b;
  private Integer sum;
  private Integer sub;
  
  AddSubtract(a, b) {
    this.a=a
    this.b=b
    this.sum=a+b
    this.sub=a-b
  }

  def isSumBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no";
  }

  def isSumBiggerThan100() {
    return (this.sum > 100) ? "yes" : "no";
  }

  def isSubBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no";
  }

  def isSubmBiggerThan100() { 
    return (this.sub > 100) ? "yes" : "no";
  }

  def geta() {
    return this.a
  }
  
  def getb() {
    return this.b
  }
}

