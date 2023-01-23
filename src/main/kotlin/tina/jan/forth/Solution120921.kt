package tina.jan.forth

import java.lang.StringBuilder

class Solution120921 {
    fun solution(A: String, B: String): Int {
    var sizeA: Int = A.length;
        for(i in sizeA downTo  1){
            var sb = StringBuilder()
            var start = i % sizeA;
            for (j in start until sizeA + start) {
               sb.append(A[j % sizeA])
            }
            if(B.equals(sb.toString())){
                return sizeA - i;
            }
        }
        return -1;
    }
}