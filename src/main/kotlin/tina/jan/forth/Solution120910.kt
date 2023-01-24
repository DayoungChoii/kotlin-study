package tina.jan.forth

import kotlin.math.pow

class Solution120910 {
    fun solution(n: Int, t: Int): Int = n * 2.toDouble().pow(t.toDouble()).toInt()
}