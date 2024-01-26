package com.test.java;

import java.util.Arrays;
//역 13개
public class alt {
    private static final int INF = 1000;
    private static final int VERTEX_COUNT = 13;  
    private static int[][] adj = {
        {INF, 9, INF, 8, INF, INF, 6, 10, INF, INF, INF, INF, INF},              //0 종로3가 : 종로 5가, 종각, 을지로3가, 을지로4가
        {9, INF, 8, INF, INF, INF, INF, INF, INF, INF, INF, INF, INF},           //1 종로5가 : 종로 3가, 동대문
        {INF, 8, INF, INF, INF, INF, INF, INF, 7, INF, INF, INF, INF},           //2 동대문 : 
        {8, INF, INF, INF, 10, INF, INF, INF, INF, INF, INF, INF, INF},
        {INF, INF, INF, 10, INF, 7, INF, INF, INF, 11, INF, INF, INF},
        {INF, INF, INF, INF, 7, INF, 8, INF, INF, INF, INF, INF, INF},
        {6, INF, INF, INF, INF, 8, INF, 6, INF, INF, INF, INF, 7},
        {10, INF, INF, INF, INF, INF, 6, INF, 10, INF, INF, INF, INF},
        {INF, INF, 7, INF, INF, INF, INF, 10, INF, INF, INF, INF, 13},
        {INF, INF, INF, INF, 11, INF, INF, INF, INF, INF, 9, INF, INF},
        {INF, INF, INF, INF, INF, INF, INF, INF, INF, 9, INF, 7, INF},
        {INF, INF, INF, INF, INF, INF, INF, INF, INF, INF, 7, INF, 7},
        {INF, INF, INF, INF, INF, INF, 7, INF, 13, INF, INF, 7, INF}
    };
    
    private static String[] stationNames = {
        "종로3가", "종로5가", "동대문", "종각", "시청",
        "을지로입구", "을지로3가", "을지로4가", "동대문역사문화공원",
        "서울역", "회현", "명동", "충무로"
    };
    
    private static void dijkstra(int startV, int endV) {
        boolean[] visited = new boolean[VERTEX_COUNT];
        int[] distance = new int[VERTEX_COUNT];
        int[] routePairs = new int[VERTEX_COUNT];
        
        Arrays.fill(distance, INF);
        distance[startV] = 0;
        
        for (int i = 0; i < VERTEX_COUNT; i++) {
            int min = INF;
            int minIdx = -1;
            
            for (int j = 0; j < VERTEX_COUNT; j++) {
                if (!visited[j] && distance[j] < min) {
                    min = distance[j];
                    minIdx = j;
                }
            }
            
            visited[minIdx] = true;
            
            for (int j = 0; j < VERTEX_COUNT; j++) {
                if (!visited[j] && adj[minIdx][j] != INF && distance[minIdx] + adj[minIdx][j] < distance[j]) {
                    distance[j] = distance[minIdx] + adj[minIdx][j];
                    routePairs[j] = minIdx;
                }
            }
        }
        
        int[] routeStack = new int[VERTEX_COUNT];
        int routeCount = 0;
        for (int i = endV; i != startV; i = routePairs[i]) {
            routeStack[routeCount++] = i;
        }
        routeStack[routeCount++] = startV;
        
        for (int i = routeCount - 1; i >= 0; i--) {
            String status = (i == routeCount - 1) ? "시작" : (i == 0) ? "도착" : "방문";
            System.out.printf("%s %s\n", stationNames[routeStack[i]], status);
        }
    }
    
    public static void main(String[] args) {
        dijkstra(0, 10);  // 종로3가에서 회현까지의 최단 경로 배열에 있는거 순서대로 숫자
    }
}
