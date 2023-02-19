package kate.feb.first

import java.util.stream.LongStream

class Solution12912 {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        answer =LongStream.rangeClosed(Math.min(a,b), Math.max(a,b)).sum();
        return answer;
    }
}