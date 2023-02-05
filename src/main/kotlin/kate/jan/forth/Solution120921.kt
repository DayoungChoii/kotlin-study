package kate.jan.forth

class Solution120921 {
    fun solution(stringA: String, stringB: String): Int {
        var listA: List<Char> = stringA.toList()
        var t_stringBuilder = StringBuilder()
        var count =0

        if(stringA.equals(stringB))  return count;
        for (j in 0..stringA.length){
            t_stringBuilder.append(listA[listA.size-1])
            for (i in 1..listA.size-1){
                t_stringBuilder.append(listA[i-1])
            }
            count++
            if(t_stringBuilder.toString().equals(stringB)) {
                return count
            } else {
                listA = t_stringBuilder.toList()
                t_stringBuilder.setLength(0);
                if(j==stringA.length-1) {
                   return count
                }
            }

        }
        return -1;
    }
}