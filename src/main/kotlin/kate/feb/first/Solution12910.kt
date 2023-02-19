package kate.feb.first

class Solution12910 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = ArrayList<Int>()
        var divisor = 1
        for (i in 0 until arr.size) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i])
            }
        }
        answer.sort()
        return answer
    }
}