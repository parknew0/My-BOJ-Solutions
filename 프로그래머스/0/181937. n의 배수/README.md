# [level 0] n의 배수 - 181937 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181937?language=java) 

### 성능 요약

메모리: 78.7 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 06일 17:42:18

### 문제 설명

<p style="user-select: auto !important;">정수 <code style="user-select: auto !important;">num</code>과 <code style="user-select: auto !important;">n</code>이 매개 변수로 주어질 때, <code style="user-select: auto !important;">num</code>이 <code style="user-select: auto !important;">n</code>의 배수이면 1을 return <code style="user-select: auto !important;">n</code>의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">num</code> ≤ 100</li>
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">n</code> ≤ 9</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">98</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">34</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">98은 2의 배수이므로 1을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">32는 3의 배수가 아니므로 0을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges