package kate.feb.second

import java.util.*

class Solution120913 {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer= mutableListOf<String>();
        var start = 0
        var end = n.coerceAtMost(my_str.length)
        for(i in start until  my_str.length step n) {
            answer.add(my_str.substring(start, end))
            start=end
            end +=n
            end = end.coerceAtMost(my_str.length)
        }
        return answer
    }
}