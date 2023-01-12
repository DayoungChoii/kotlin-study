package tina.jan.second

import java.lang.StringBuilder

class Solution12922 {
    fun solution(n: Int):String {
        val sb = StringBuilder()

        for(i:Int in 1..n){
            if(i % 2 == 0) sb.append("박") else sb.append("수")
        }

        return sb.toString()
    }
}