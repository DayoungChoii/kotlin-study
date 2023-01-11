package tina.jan.second

class Solution120824 {

    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = IntArray(2)

        for (i: Int in 0 until num_list.size) {
            if (num_list[i] % 2 == 0) answer[0]++
            else answer[1]++
        }

        return answer
    }
}