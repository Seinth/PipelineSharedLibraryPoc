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

  isSumBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no";
  }

  isSumBiggerThan100() {
    return (this.sum > 100) ? "yes" : "no";
  }

  isSubBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no";
  }

  isSubmBiggerThan100() { 
    return (this.sub > 100) ? "yes" : "no";
  }

  geta() {
    return this.a
  }
  
  getb() {
    return this.b
  }
}

