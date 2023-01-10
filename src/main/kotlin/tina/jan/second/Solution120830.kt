package tina.jan.second

class Solution120830 {
    fun solution(n: Int, k: Int): Int {
        //양꼬치 12000 음료수 2000
        val lamp = 12_000
        val beverage = 2000

        return n * lamp + if((k - n/10) <= 0)  0 else (k - n/10) * beverage
    }
}