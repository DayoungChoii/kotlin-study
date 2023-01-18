package tina.jan.third

class Solution120814 {
    fun solution(n: Int): Int {
        var aPieceOfPizza: Int = 7
        return if (n % 7 == 0){
            n/7
        } else{
            n/7 + 1
        }
    }
}