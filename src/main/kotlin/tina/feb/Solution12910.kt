package tina.feb

import java.util.Collections

class Solution12910 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var result = ArrayList<Int>()
        for(i in arr.indices){
            if(arr[i] % divisor == 0){
                result.add(arr[i])
            }
        }

        if(result.size ==0){
            result.add(-1)
        }
        return result.sorted().toIntArray()
    }
}