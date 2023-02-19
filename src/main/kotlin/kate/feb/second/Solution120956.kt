package kate.feb.second

class Solution120956 {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        answer = babbling.count {
            it.split("aya", "ye", "woo", "ma").none() {
                it.isNotEmpty()
            }
        }
        return answer
    }
}