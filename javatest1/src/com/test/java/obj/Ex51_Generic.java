package com.test.java.obj;



public class Ex51_Generic {
public static void main(String[] args) {
	
	//1. 제네릭 클래스 > O 
	//제네릭 메서드 (나중에)
	
	//요구사항) 클래스 설계 중 ..
	
	//1. 멤버 변수 > int 1개 
	//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 선언
	
	//추가) String 을 중심으로 하는 클래스를 추가 설계 
	//추가) boolean 을 중심으로 하는 클래스 추가 설계
	//추가 double을 중심으로 하는 클래스
	
	//전용 클래스
	WrapperInt n1 = new WrapperInt(100);
	System.out.println(n1);
	System.out.println(n1.getData() * 2 );
	System.out.println();
	//범용 클래스
//	WrapperObject n2 = new WrapperObject(200);
//	System.out.println(n2.toString());
//	System.out.println((int)n2.getData()*2);
//	System.out.println();
//	
	
	
	
	
	WrapperString s1 = new WrapperString("홍길동");
	
	System.out.println(s1);
	System.out.println(s1.getData().length());
	
//	WrapperObject s2 = new WrapperObject("홍길동");
//	System.out.println(s2);
//	System.out.println(((String)s2.getData()).length());
//	System.out.println();
	
	WrapperBoolean b1 = new WrapperBoolean(true);
	System.out.println(b1);
	System.out.println(b1.getData() ? "참" : "거짓");
	System.out.println();
	
	
//	WrapperObject b2 = new WrapperObject(true);
//	System.out.println(b2);
//	System.out.println(((boolean)b2.getData() ? "참": "거짓"));
//	System.out.println();
//

	//***제네릭 클래스
	//JDK에서 제공되는 기능 중 일부가 제네릭으로 제공됨 
	//예시) 컬렉션의 기능들 , 
	
	
	//꺼낼 때 참조형의 형태를 작성하기 때문에 범용 + 전용의 형태로 사용 할 수 있음. 
	Wrapper<Integer> n3 = new Wrapper<>(300);
	System.out.println(n3.toString());
	System.out.println((int)n3.getData()*2);
	System.out.println();
	Wrapper<String> n4 = new Wrapper<>("홍길동");
	System.out.println(n4);
	System.out.println(((String)n4.getData()).length());
	System.out.println(n4);
	Wrapper<Boolean> n5 = new Wrapper<>(true);
	System.out.println(n5);
	System.out.println(n5.getData() ? "참" : "거짓");
	System.out.println(n5);

	
}//main
}
class WrapperInt {
	
	private int data; // 1. 클래스 중심 
	
	//2. data 중심 > 메서드 
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String toString() {
		return "[data=" + data + "]";
	}
}
class WrapperString {
	
	private String data; // 1. 클래스 중심 
	
	//2. data 중심 > 메서드 
		
	public WrapperString(String data) {
		this.setData(data);
	}
		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String toString() {
			return "[data=" + data + "]";
		}
	}
	
	class WrapperBoolean {
		
		private Boolean data; // 1. 클래스 중심 
		
		//2. data 중심 > 메서드 
			
		public WrapperBoolean(Boolean data) {
			this.setData(data);
		}
			public Boolean getData() {
				return data;
			}

			public void setData(Boolean data) {
				this.data = data;
			}

			public String toString() {
				return "[data=" + data + "]";
			}
	}
//class WrapperObject {
//				
//				private Object data; // 1. 클래스 중심 
//				
//				//2. data 중심 > 메서드 
//					
//				public WrapperObject(Object data) {
//					this.setData(data);
//				}
//					public Object getData() {
//						return  data;
//					}
//
//					public void setData(Object data) {
//						this.data = data;
//					}
//
//					public String toString() {
//						return "[data=" + data + "]";
//					}	
//	
//	
//			}

	
//제네릭 클래스
	class Wrapper<T>{
		private T data;

		public Wrapper(T data) {
			
			 // 1. 클래스 중심 
			
			//2. data 중심 > 메서드 
				
			 
				this.setData(data);
			}
				public T getData() {
					return  data;
				}

				public void setData(T data) {
					this.data = data;
			}

				public String toString() {
					return "[data=" + data + "]";
				}	
		
			
		}
	