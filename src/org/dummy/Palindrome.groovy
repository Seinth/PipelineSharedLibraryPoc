package org.dummy;

def isPalindrome(word) {
  result = (word[-1..0] == word[0..-1]) ? "yes" : "no";
  return result
}
