package com.three.baekjoon

import java.lang.StringBuilder
import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

data class Document(val important: Int, val index: Int)

fun main() = System.`in`.bufferedReader().use { br ->
    val t = br.readLine().toInt()
    val result = StringBuilder()

    repeat(t) {
        val (_, m) = br.readLine().split(" ").map { it.toInt() }
        // 문서 저장할 큐
        val queue: Queue<Document> = LinkedList()
        // 중요도 저장할 우선순위 큐
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        // 문서의 중요도 입력 받아, Document 객체 생성, 큐와 우선순위 큐에 각각 추가
        br.readLine().split(" ").map { it.toInt() }.forEachIndexed { index, important ->
            queue.offer(Document(important, index))
            pq.offer(important)
        }

        // 인쇄 횟수를 저장할 변수
        var count = 0

        // 큐가 빌 때까지 반복
        while (queue.isNotEmpty()) {
            // 큐에서 문서 하나 꺼내기
            val current = queue.poll()

            // 꺼낸 문서의 중요도 == 우선순위 큐의 최댓값
            if (current.important == pq.peek()) {
                // 우선순위 큐에서 중요도 제거
                pq.poll()
                // 인쇄 횟수 증가
                count++

                // if 꺼낸 문서가 목표 문서, 결과에 인쇄 횟수 추가 및 반복 종료
                if (current.index == m) {
                    result.append(count).append("\n")
                    break
                }
            } else {
                // 꺼낸 문서의 중요도가 우선순위 큐의 최대값보다 작다면 다시 큐에 추가
                queue.offer(current)
            }
        }
    }

    println(result)
}