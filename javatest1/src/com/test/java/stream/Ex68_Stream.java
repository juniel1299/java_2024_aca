package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

import com.test.data.Item;
import com.test.java.collection.Member;
import com.test.java.obj.User;
import com.test.util.Myutil;

public class Ex68_Stream {
public static void main(String[] args) {
	
	
	/*
	 
	 자바 스트림
	 
	 1. 입출력 스트림 
	 	- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등 
	 	
	 2. 스트림
	 	- Java 8(1.8) + 람다식과 같이 출시 
	 	- 배열(컬렉션)의 탐색(조작) 기술
	 	- 파일 입출력도 지원
	 	- 디렉토리 탐색 지원 
	 	- 기타 등등 여러곳에서 시도 중 
	 	- 익명 객체(적극적으로 사용) > 람다식을 통해 줄임 + 함수형 인터페이스 사용 
	 	
	 	
	 	표준 API 함수형 인터페이스 
	 	1. Consumer
	 		- (매개변수) -> {}
	 	2. Supplier
	 		- () -> {return 값;}
	 	3. Function
	 		- (매개변수) -> {return 값;}
	 	4. Operator
	 		- (매개변수) -> {return 값;}
	 		- 매개변수 반환값이 모두 동일한 타입 
	  	5. Predicate
	 		- (매개변수) -> {return 값;}
	 		- 반환값이 boolean
	 	
	 	
	 	
	 */
	/*
	 
	 스트림, Stream
	 - 데이터 소스로부터 생성
	 - list.stream().forEach()
	 
	 파이프, Pipe
	 - 스트림 객체의 메서드 
	 1. 중간 파이프
	 
	 2. 최종 파이프
	 
	 
	 최종 처리 
	 - forEach()
	 - 최종 파이프 
	 - 앞의 스트림으로부터 요소를 받아 최종 처리하는 메서드
	 
	 필터링
	 - filter()
	 - 중간 파이프
	 - 앞의 스트림으로부터 요소를 받아 조건에 맞는 요소만 남기고 맞지 않는 요소는 버림 
	
	중복 제거
	- distinct()
	- 중간 파이프
	- 앞의 스트리멩서 중복 요소를 제거한다
	- 유일한 요소만 남아있는 스트림을 반환한다.
	- Set 성질
	 
	
	 변환
	 - map(),mapXXX()
	 - 중간 파이프
	 - 앞의 스트림의 요소를 다른 형태로 변환 후 새로운 스트림 반환한다.
	 
	 정렬
	 - sorted()
	 - 중간 파이프
	 - 정렬하는 역할
	 - 사용법이 배열,컬렉션의 sort()와 같음 >Comparator
	
	 매칭
	 - allMatch(), anyMatch(), noneMatch()
	 - 최종 파이프
	 - 리턴이 boolean으로 나옴 
	 - boolean allMatch(Predicate) : 모든 요소가 조건을 만족하는지
	 - boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는지
	 - boolean noneMatch(Predicate) : 모든 요소가 조건을 불만족하는지
	 
	 
	 집계 , Reduce
	 - count()
	 - max()
	 - min()
	 - sum()
	 - avg()
	 - 최종 파이프
	 - 앞의 스트림의 요소를 취합해서 하나의 통계값을 생성
	 
	 
	 
	 */
	
	
	//m1();
	//m2();
	//m3();
	//m4();
	//m5();
	//m6();
	//m7();
	//m8();
	//m9();
	m10();
}

private static void m10() {
	// TODO Auto-generated method stub
	
	//count()
	Data.getIntList().stream()
	.count();
	System.out.println(count);
	
	System.out.println(Data.getUserList().stream().filter(user -> user.getGender()==1).count());
	System.out.println(Data.getUserList().stream().filter(user -> user.getGender()==2).count());
	
	
	//max(),min()
	List<Integer> nums = Data.getIntList();
	
	int max = -1; //nums 안의 모든 숫자 가장 작은 숫자 -1 
	int min = 101; //nums 안의 모든 숫자 중 가장 큰 숫자+1
	
	for(int n: nums) {
		if(n>max) {
			max=n;
			
		}
	
	if(n<min) {
		min = n;
	}
	}
	System.out.println(max);
	System.out.println(min);
	
	//Optional<Integer>
	// Integer or int 타입과 동일한 자료형 
	// 값형은 null을 가질 수 없다 
	// 참조형은 null을 가질 수 있다.
	// null을 가질 수 있는 int 
	System.out.println(nums.stream().max((a,b) -> a - b)); //최대 값 리턴
	
	//nums.clear();
	
	Optional<Integer> result = nums.stream().max((a,b) -> a - b);
	
	System.out.println(result.get());
	
	Optional<User> user = Data.getUserList().stream().max((user1, user2)-> user1.getHeight() - user2.getHeight());
	
	System.out.println(user.get());
	
	
	Optional<User> user3 = Data.getUserList().stream().min((user1, user2)-> user1.getHeight() - user2.getHeight());
	
	System.out.println(user3.get());
	
	//스트림 요소 타입 > 숫자 or 숫자 x
	// count(),max(),min() -> Stream<Type> > 모든 자료형에 적용 가능함
	
	//스트림 요소 타입이 숫자일때만 가능 
	//sum(),average() -> IntStream , DoubleStream -> 숫자 전용 스트림에서만 사용 가능
	
	
	//nums.stream() ==Stream<Integer>
	
	System.out.println(nums.stream().mapToInt(n->n).sum()); //== IntStream
	
	
	Optional avg = nums.stream().mapToInt(n->n).average();
	
	System.out.println(nums.stream().mapToInt(n->n).average());
	
	System.out.println(avg.getAsDouble);
	
	//남자 평균 키 
	
	Data.getUserList().stream()
	.filter(u->u.getGender()==1)
	.mapToInt(u -> u.getHeigth()
	.average()
	.getAsDouble();
	
	getAsDouble(Integer);

	
	
	
}

private static void m9() {
	
	int[] nums = {2,4,6,8,10};
	
	//요구사항) 배열안에 짝수만 있는지
	boolean result = false;
	
	for(int n : nums ) {
		if(n%2==1) {
			result = true;
			break;
		}
	}
	if(!result) {
		System.out.println("짝수만 존재");
	}else {
		System.out.println("홀수 존재");
	}
	
	
	result = Arrays.stream(nums).allMatch(n -> n%2==0);
	System.out.println(result);
	
	result = Data.getUserList().stream()
			.filter(user -> user.getHeight()>=178)
			.allMatch(user-> user.getGender()==1);
	System.out.println(result);
	
	
	//nums > 홀수가 존재하는지 ?
	
	Arrays.stream(nums).anyMatch(n-> n % 2 ==1);
	System.out.println(result);
	
	
	result=Data.getUserList().stream()
			.filter(user -> user.getHeight()>=178)
			.anyMatch(user -> user.getGender()==2);
	System.out.println(result);
	
	nums =new int[] {2,4,6,8,10};
	
	result = Arrays.stream(nums).noneMatch(n-> n % 2 !=0);
	System.out.println(result);
	
	
	result=Data.getUserList().stream()
			.filter(user -> user.getHeight()>=0)
			.noneMatch(user -> user.getGender()==2);
	System.out.println(result);
	
	
}

private static void m8() {
	
	Data.getIntList(10).stream()
	.sorted()
	.forEach(n -> System.out.println(n));
	
	System.out.println();
	
	Data.getIntList(10).stream()
	.sorted((a, b) -> b - a )
	.forEach(n -> System.out.println(n));
	
	System.out.println();
	
	Data.getIntList(10).stream()
	//.sorted(Comparator.naturalOrder()) // 오름차
	.sorted(Comparator.reverseOrder())   // 내림차
	.forEach(n -> System.out.println(n));
	
	System.out.println();
	
	System.out.println();
	Data.getIntList().stream()
	.distinct()
	.filter(n -> n%2==0)
	.sorted()
	.forEach(n -> System.out.println(n));
	
	
	
	
	
	
	
	
}

private static void m7() {
	
	List<String> list = Data.getStringList();
	System.out.println(list);
	System.out.println();
	
	list.stream()
	.map(word -> word.length()>=5 ? "긴단어" : "짧은단어")
	.forEach(word -> System.out.println(word));
	
	System.out.println();
	
	
	Data.getUserList().stream()
	//.map(user -> user.getName() )
	//.map(user->user.getAge())
	//.map(user-> user.getGender() == 1 ? "남자" : "여자")
	.forEach(temp -> System.out.println(temp));
	
	System.out.println();
	
	//names > Member 객체로 변환
	String[] names = {"홍길동","아무개","강아지","고양이","이순신"};
	
	Arrays.stream(names)
	.map(name -> new Member(name,20))
	.forEach(m -> System.out.println(m));
	System.out.println();
	
	//user > 변환 > member
	Data.getUserList().stream()
	.map(user -> new Member(user.getName(),user.getAge()))
	.forEach(m -> System.out.println(m));
	
	System.out.println();
	
	
	
}

private static void m6() {
	
	List<Integer> list = Data.getIntList();
	System.out.println(list);
	
	//위의 집합에서 중복값 제거하시오 -> Set
	//Case 1.
	HashSet<Integer> set = new HashSet<Integer>();
	
	for(int n : list) {
		set.add(n);
	}
	System.out.println(set.size());
	
	//Case 2.
	HashSet<Integer> set2 = new HashSet<Integer>(list);
	
	System.out.println(set2.size());
	
	System.out.println();
	
	//Case 3.
	System.out.println(list.stream().count());
	System.out.println(list.stream().distinct().count());
	
	System.out.println();
	
	
	Data.getStringList()
	.stream()
	.filter(word -> word.length()>=5)
	.distinct()
	.forEach(word -> System.out.println(word));
	
	System.out.println();
	
	ArrayList<Member> mlist = new ArrayList<Member>();
	
	mlist.add(new Member("홍길동",10));
	mlist.add(new Member("아무개",20));
	mlist.add(new Member("강아지",30));
	mlist.add(new Member("고양이",40));
	mlist.add(new Member("홍길동",10));
	
	System.out.println(mlist);
	System.out.println();
	
	mlist.stream()
	.distinct() 
	.forEach(m -> System.out.println(m));
	
	
}

private static void m5() {
	
	Data.getStringList().stream()
	.filter(word-> word.length()>=5)
	.filter(word-> word.startsWith("애"))
	.forEach(word -> System.out.println(word));
	System.out.println();
	
	Data.getUserList().stream()
	.filter(user->user.getGender()==1)
	.filter(user->user.getHeight()>=180)
	.filter(user->user.getWeight()>=80)
	.forEach(user -> System.out.println(user));
	System.out.println();
	
	
}

private static void m4() {
	
	List<Integer> list = Data.getIntList(20);
	//System.out.println(list);
	
	//짝수만 출력
	
	//1. for문 
	for(int i=0; i<list.size(); i++) {
		if(list.get(i)% 2 ==0) {
			System.out.printf("%4d",list.get(i));
		}
	}
	
	System.out.println();
	
	//2. forEach문
	
	
	for(int n:list) {
		if(n%2==0) {
			System.out.printf("%4d",n);
		}
	}
	System.out.println();
	
	//3. stream
	list.stream().forEach(n -> {
		if(n%2==0) {
			System.out.printf("%4d",n);
		}
	});
	
	System.out.println();
	
	list.stream().filter(n -> { // stream에 20개를 가지고
		//filter가 true만 가지고 나머지 버림 (또다른 스트림 리턴)
		if(n%2==0) { //forEach는 true만큼 반복됨 
			return true;
		}else {
			return false;
		}
	}).forEach(n->System.out.printf("%4d",n));
System.out.println();
	
	list.stream()
	.filter(n -> n % 2 ==0)
	.forEach(n->System.out.printf("%4d",n));
	System.out.println();
	
	list.stream()
	.filter(n -> n % 2 ==0)
	.filter(n -> n >=50)
	.forEach(n->System.out.printf("%4d",n));
	System.out.println();
	
	


}

private static void m3() {
	
	//스트림을 얻어오는 방법
	// stream() 메서드를 사용한다.
	//1. 배열로부터(*****)
	//2. 컬렉션으로부터*****
	//----------------------------------------------
	//3. 숫자 범위
	//4. 파일로부터
	//5. 디렉토리로 부터 가져옴
	
	//1. 배열
	int[] nums1 = {10,20,30,40,50};
	
	Arrays.stream(nums1).forEach(num -> System.out.println(num));
	
	//2. 컬렉션
	
	System.out.println();
	ArrayList<Integer> nums2 = new ArrayList<Integer>();
	nums2 .add(100);
	nums2 .add(200);
	nums2 .add(300);
	
	nums2.stream().forEach(num->System.out.println(num));
	
	System.out.println();
	LinkedList<Integer> nums3 = new LinkedList<Integer>();
	
	nums3 .add(100);
	nums3 .add(200);
	nums3 .add(300);

	nums3.stream().forEach(num->System.out.println(num));
	
	System.out.println();
	HashSet<Integer> nums4 = new HashSet<Integer>();
	nums4.add(100);
	nums4.add(200);
	nums4.add(300);
	
	nums4.stream().forEach(num -> System.out.println(num));
	
	System.out.println();
	//3.
	//Stream<Integer>
	IntStream.range(1, 11).forEach(num -> System.out.println(num));
	System.out.println();
	
	try {
		//4. 파일 > 읽기 작업 지원
//		Path path = Paths.get("dat\\score.txt");
//		Files.lines(path).forEach(str -> System.out.println(str));
		
		//5. 디렉토리 > dir.listFiles()
	
		Path dir = Paths.get("c:\\class\\dev\\eclipse");
	
		Files.list(dir).forEach(p -> {
			System.out.println(p.getFileName());
		});
	
	
	
	
	} catch (Exception e) {
		System.out.println("Ex68_Stream.m3");
		e.printStackTrace();
	}
	
	
	
	
	
	
}


private static void m2() {
	
	List<String> list = Data.getStringList(10);
	
	//System.out.println(list);
	
	//1. for문 (while문)
	for(int i=0; i<list.size(); i++) {
		System.out.printf("%s\t",list.get(i));
	}
	System.out.println();
	System.out.println();
	
	//2. 향상된 for문 == foreach
	
	for(String word : list) {
		System.out.printf("%s\t",word);
	}
	System.out.println();
	System.out.println();
	
	//3. Iterator 
	Iterator<String> iter = list.iterator();
	
	while(iter.hasNext()) {
		System.out.printf("%s\t",iter.next());
	}
	
	System.out.println();
	//4. Stream
	
	//4.1 list.stream() > ArrayList로 부터 스트림 객체 생성하라 
	//4.2 stream 객체 > ArrayList 참조
	//4.3 forEach 실행
	// - stream을 통해서 ArrayList 요소 접근(하나씩 , 순서대로)
	Stream<String> stream = list.stream(); 
	
	stream.forEach(word -> System.out.println(word)) ; //향상된 for문 동작
	
	
	List<Integer> nums = Data.getIntList(10);
	
	System.out.println(nums);
	
	Stream<Integer> stream2 = nums.stream();
	
	//소비가 끝난 stream은 다시 못 씀 
	stream2.forEach(num -> System.out.println(num)); //한번 탐색하면 더이상 못 함
System.out.println();
//배열.stream.메서드,메서드,메서드 등등
	nums.stream().forEach(num->System.out.println(num)); //이렇게 많이 씀
	stream2.close();
	
	
	Data.getUserList().stream().forEach(user->System.out.println(user.getName()));
	Data.getUserList().stream().forEach(user->System.out.println(user.getAge()));

	

}

private static void m1() {
	
	int[] nums1 = Data.getIntArray();
	//System.out.println(Arrays.toString(nums1));
	
	int[] nums2 = Data.getIntArray(10);
	System.out.println(Arrays.toString(nums2));
	
	List<Integer> nums3 = Data.getIntList();
	System.out.println(nums3);
	List<Integer> nums4 = Data.getIntList(10);
	System.out.println(nums4);
	
	String[] txt1 = Data.getStringArray(5);
	System.out.println(Arrays.toString(txt1));
	
	User[] ulist = Data.getUserArray(10);
	System.out.println(Arrays.toString(ulist));
	
	Item[] ilist = Data.getItemArray();
	System.out.println(Arrays.toString(ilist));
	
	Myutil util = new Myutil();
	
	System.out.println(util.sum(100,200));
	
	
	
}//main
}






















