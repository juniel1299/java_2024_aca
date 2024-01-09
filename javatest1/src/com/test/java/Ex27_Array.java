package com.test.java;

import java.util.Arrays;
import java.util.Calendar;

import javax.naming.ldap.SortControl;
import javax.swing.RowSorter;

public class Ex27_Array {
	public static void main(String[] args) {

		// 배열, Array
		// -자료구조 > 데이터를 저장하는 물리적인 구조
		// -데이터 집합 > 변수들을 모아놓은 집합
		// 같은 자료형을 저장하는 데이터의 집합
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		m13();
	}// main

	private static void m13() {
		// TODO Auto-generated method stub

		int[] nums = { 5, 1, 4, 2, 7 };
		int temp;
		System.out.print(Arrays.toString(nums));

		for (int i = 0; i < nums.length - 1; i++) {// 사이클 (0123)
			for (int j = 0; j < nums.length - i - 1; j++) {

				// 오름차순
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		String[] names = { "홍길동", "아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리" };

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < names.length - 1 - i; j++) {
				if (names[j].compareTo(names[j + 1]) > 0) {
					String temp2 = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp2;
				}
			}
		}
		//Quick Sort 사용
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		
		
	}

	private static void m12() {
		// TODO Auto-generated method stub

		// 정렬
		// - 크기 비교 후 > 재배치

		// 1. 오름차순
		// a. 숫자 : 작은수 > 큰수
		// b. 문자열 : 문자코드값 순
		// c. 날짜시간 : 과거 > 미래

		// 2. 내림차순
		// a. 숫자 : 큰수 > 작은수
		// b. 문자열 : 문자코드값 순
		// c. 날짜시간 : 미래 > 과거

		// 정렬구현
		// 1. 직접 구현 > 정렬 알고리즘
		// 2. JDK 구현된 기능
		// 3.

		// 버블정렬 + swap

		// swap > 두 공간의 데이터를 서로 바꾸는 작업
		// 빈 공간이 필요함 (3 공간 다 자료형이 모두 같아야함)
		int a = 10;
		int b = 5;

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

		/*
		 * int[] nums = {5,1,4,2,7};
		 * 
		 * System.out.print(Arrays.toString(nums));
		 * 
		 * for(int i=0; i<nums.length-1; i++) {//사이클 (0123) for(int j=0;
		 * j<nums.length-i-1; j++) {
		 * 
		 * //오름차순 if(nums[j] > nums[j+1]) { temp = nums[j]; nums[j] = nums[j+1];
		 * nums[j+1] = temp; } } }
		 * 
		 * 
		 * System.out.println(Arrays.toString(nums));
		 */

		String[] names = { "홍길동", "아무개", "테스트", "유재석", "강아지", "고양이", "도깨비", "박명수", "조세호", "병아리" };

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < names.length - 1 - i; j++) {
				if (names[j].compareTo(names[j + 1]) > 0) {
					String temp2 = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp2;
				}
			}
		}
		System.out.println(Arrays.toString(names));

		/*
		 * String name1= "홍길동"; String name2 = "홍길순";
		 * System.out.println(name1.compareTo(name2));
		 * 
		 * 
		 * 
		 * System.out.println((int)'홍'); System.out.println((int)'아');
		 * 
		 * 
		 */
	}

	private static void m11() {
		// TODO Auto-generated method stub

		// 배열 초기화 리스트

		int[] nums1 = new int[5];
		nums1[0] = 95;
		nums1[1] = 88;
		nums1[2] = 67;
		nums1[3] = 89;
		nums1[4] = 64;

		System.out.println(Arrays.toString(nums1));

		int[] nums2 = new int[] { 95, 88, 67, 89, 64 };
		System.out.println(Arrays.toString(nums2));

		int[] nums3 = { 95, 88, 67, 89, 64 }; // 많이 사용
		System.out.println(Arrays.toString(nums3));

		String[] names1 = new String[3];

		names1[0] = "홍길동";
		names1[1] = "임꺽정";
		names1[2] = "도깨비";
		String[] names2 = { "홍길동,임꺽정,도깨비" };
		System.out.println(Arrays.toString(names1));

		System.out.println(Arrays.toString(names2));

	}

	private static void m10() {
		// TODO Auto-generated method stub
		// 배열 자동 초기화
		// 배열은 생성 직후 모든 요소(방)가 초기화가 된다

		// 츄기화 규칙
		// 1. 정수배열 >0
		// 2. 실수배열 > 0.0
		// 3. 문자열 > null [\0(u0000)
		// 4. 논리배열 > false
		// 5. 참조형배열 > null

		int[] list1 = new int[3];
		System.out.println(Arrays.toString(list1));
		double[] list2 = new double[3];
		System.out.println(Arrays.toString(list2));
		char[] list3 = new char[3];
		System.out.println(Arrays.toString(list3));
		boolean[] list4 = new boolean[3];
		System.out.println(Arrays.toString(list4));
		String[] list5 = new String[3];
		System.out.println(Arrays.toString(list5));

	}

	private static void m9() {
		// TODO Auto-generated method stub

		// Array 클래스
		// 배열과 관련된 여러가지 기능을 구현한 클래스
		// 배열을 조작하는 편리한 기능을 제공하는 역할
		// 유틸리티 클래스

		int[] nums = new int[3];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		// 배열의 상태를 확인?
		// - [I > int[]
		// - @ > 구분자
		// - 2ff4acd0 > 메모리 주소
		System.out.println(nums); // 쓸모없음

		printArray(nums);
		System.out.println();
		System.out.println(Arrays.toString(nums)); // for문을 안쓰고 똑같은 형태로 가능 . dump (덤프)

		// *** C계열의 언어들은 범위를 나타낼때,
		// 시작 위치(inclusive) ~ 끝위치(exclusive)
		int[] copy;
		// 깊은 복사
		copy = Arrays.copyOfRange(nums, 0, nums.length);

		nums[0] = 100;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));

	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d", nums[i]);
		}
	}

	private static void m8() {
		// TODO Auto-generated method stub
		// 배열복사
		// 1.얕은 복사 shallow copy
		// 주소값 복사
		// side effect 발생

		// 2. 깊은 복사
		// deep copy
		// 실제 배열 복사
		// side effecat 발생 x

		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int[] copy = new int[3]; // 공간을 분리해서 만들면 실제 배열을 복사하여 얕은 복사와 달리 side effect 발생하지 않음

		for (int i = 0; i < nums.length; i++) {

			// 방과 방끼리의 복사 . 요소끼리의 복사
			// int = int
			copy[i] = nums[i]; // [i]를 통해 실제 넣는 위치를 작성하여 깊은 복사가 동작함
		}

		nums[0] = 100;
		System.out.println(copy[0]);
	}

	private static void m7() {
		// TODO Auto-generated method stub

		int a = 10;
		changeValue(a);
		System.out.println(a);

		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		changeArray(nums);
		System.out.println(nums[0]);

	}

	private static void changeArray(int[] nums) {
		// TODO Auto-generated method stub
		nums[0] = 123;
		System.out.println(nums[0]);
	}

	private static void changeValue(int a) {
		// TODO Auto-generated method stub
		a = 20;
		System.out.println(a);
	}

	private static void m6() {
		// TODO Auto-generated method stub
		// 배열 복사(=참조형 복사)

		// 값형의 복사
		int a = 10;
		int b;

		b = a;
		// 값형의 특징 > 원본을 수정해도 복사본에 영향을 주지 않음 . > side effect 발생하지 않음
		a = 20;// 원본수정

		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println();

		// 원본을 수정하면 복사본도 수정이 됨 .
		// 복사본 수정해도 원본이 수정이 됨 .
		// side effect 발생한다.

		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		int[] copy;

		// int[] = int[]
		// 앞에서 말한대로 개발자가 Heap에 접근을 할 수 없음 .
		// 참조형에서 = 을 하게 되면 Stack 에서 삽입을 하는데
		// 참조형은 Stack에 주소값이 있어 주소값을 넣어주었기 때문에(주소값복사) 안에 값이 동시에 변함. (서로 연결이 됨)
		//
		copy = nums;

		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);

		nums[0] = 100;
		System.out.println(copy[0]);

		copy[1] = 200;

		System.out.println(nums[1]);

	}

	private static void m5() {
		// TODO Auto-generated method stub

		// 값형 vs 참조형
		// ******값형 > Stack 안에 직접 값을 넣음
		// ******참조형 > 데이터는 Heap에 Stack에는 Heap 주소를 작성함 (간접적) ,
		// *** 원인
		// - 데이터 크기가 고정 -> 값형 , 데이터 크기가 일정하지 않음 -> 참조형

		// ***변수만 보고 데이터의 길이를 추측 할 수 있으면 값형, 아니면 참조형

		int a1 = 10;
		// a1의 메모리 크기는 ? -> 4byte

		int a2 = 100000000;
		// a2의 메모리 크기 -> 4byte

		String s1 = "홍길동";
		// s1의 메모리 크기 -> 6byte (2*3) , Stack에서의 참조변수 메모리 크기 4byte (int와 같음)

		String s2 = "안녕하세요";
		// s2의 메모리 크기 -> 10byte (2*5) , Stack에서의 참조변수 메모리 크기 4byte (int와 같음)

		// 개발자는 heap에 접근권한 x , 주소를 알더라도 접근을 못함. 그러므로 Stack 을 통해 지나가야함

		int[] nums1 = new int[3];
		// 12byte (4*3)

		int[] nums2 = new int[5];
		// 20byte (4*5)

	}

	private static void m4() {
		// TODO Auto-generated method stub

		// 자료형 > 배열

		// 정수
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);

		// 실수
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);

		// 문자
		char[] list3 = new char[5];
		list3[0] = 'a';
		System.out.println(list3[0]);

		// 논리배열
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);

		// 참조형
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);

		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);

	}

	private static void m3() {
		// TODO Auto-generated method stub

		// 참조형의 특징
		// 모든 참조형들은 공간을 초기화하지 않아도 자동으로 초기화가 된다
		// 배열의 길이 = 10
		// 첨자 범위 0~9
		// 첨자의 범위: 길이 - 1
		int[] nums = new int[10];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		// ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		// 길이 10인데 10을 넣어 오류
		// System.out.println(nums[10]);
		// 배열탐색 > for문 사용
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}

	}

	private static void m2() {
		// TODO Auto-generated method stub
		// 요구사항) 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항) 학생수 증가 > 300명

		// 배열(참조형) 선언
		// 배열타입 배열명 = new 배열타입[배열의길이];
		// 자료형[] 변수명 = new 자료형[길이];

		int[] kors = new int[300]; // index 첨자

		// 배열의 방(요소,element)에 접근 > 방 번호(첨자,index) 사용

		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;

		// int total = kors[0] + kors[1] + kors[2];
		int total = 0;
		for (int i = 0; i <= kors.length; i++) {
			total += kors[i];
		}
		double avg = (double) total / kors.length; // 속성 ,필드
		System.out.printf("총점:%d점 평균%.1f점", total, avg);
	}

	private static void m1() {
		// TODO Auto-generated method stub

		// 요구사항) 학생 3명 > 국어 점수 > 총점, 평균
		// 추가사항) 학생수 증가 > 300명
		int kor1;
		int kor2;
		int kor3;
		// +297 선언

		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		// +297 선언

		int total = kor1 + kor2 + kor3; // +297합
		double avg = total / 3; // /300

		System.out.printf("총점:%d점,평균:%.1f점", total, avg);

	}// m1

}
