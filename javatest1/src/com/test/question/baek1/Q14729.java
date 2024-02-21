package com.test.question.baek1;

import java.io.*;
import java.util.*;

public class Q14729 {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Scanner 보다 BufferedReader가 더 빠름

        int n = Integer.parseInt(br.readLine());		//학생 수 입력 받는 변수
        List<Double> list = new ArrayList<>();			//리스트 선언


        for (int i = 0; i < n; i++) { // 학생 수 만큼 반복문 실행
            double data = Double.parseDouble(br.readLine()); // 학생 성적 입력 받는 변수	
            if (list.size() == 7) {
                //list 사이즈가 7보다 클 경우 들어오는 값과 리스트의 값들을 비교하여 작을 경우에 교환
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) >= data) {	
                        list.remove(list.size() - 1);
                        list.add(data);
                        break;
                    }
                }
            } else {
                list.add(data);
            }
            Collections.sort(list); //리스트 정렬
//        list = list.stream().sorted().collect(Collectors.toList()); //리스트 정렬한것
        }
        for (double item : list) {
            System.out.printf("%.3f\n", item);
        }

    }
}