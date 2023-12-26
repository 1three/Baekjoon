// 1. 8*8 자르기
// 2. 시작점 색상이 B or W에 따라 색칠해야 할 정사각형 개수 계산
// 3. 시작점 색상이 B or W에 따른 최소 수 출력

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    
    val board = mutableListOf<String>()
    repeat(n) {
        board.add(br.readLine())
    }
    
    val patterns = arrayOf("WBWBWBWB", "BWBWBWBW")
    var min = 64
    
    fun calcRepaint(x: Int, y: Int): Int {
        var startWhite = 0
        var startBlack = 0
        
        for (i in 0 until 8) {
            for (j in 0 until 8) {
                if (board[x + i][y + j] != patterns[i % 2][j]) {
                    startWhite++
                }
                if (board[x + i][y + j] != patterns[(i + 1) % 2][j]) {
                    startBlack++
                }
            }
        }
        
        return minOf(startWhite, startBlack)
    }
    
    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            min = minOf(min, calcRepaint(i, j))
        }
    }
    
    println(min)
    br.close()
}