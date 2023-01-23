package kate.jan.second

class Solution120830 {
    fun solution(n: Int, k: Int): Int {
        var drink = k
        var mok = n / 10

        if(mok >=k)  drink = 0
        else drink -=mok

        return n * 12000 + drink * 2000
    }
}