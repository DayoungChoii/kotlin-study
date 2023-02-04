package tina.feb

import java.util.*
import kotlin.Comparator

class Solution12915 {
    fun solution(strings: Array<String>, n :Int): Array<String> {
        Arrays.sort(strings, Comparator { str1: String, str2: String -> if(str1[n] == str2[n]) str1.compareTo(str2) else str1[n] - str2[n]})
        return strings
    }
}