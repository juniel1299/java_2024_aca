package com.test.question.obj;

class Box {

	private Macaron[] list = new Macaron[10];

	public void cook() {
		String[] color = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" };

		for (int i = 0; i < list.length; i++) {
			Macaron m = new Macaron();

			m.setSize((int) (Math.random() * 11) + 5); //마카롱 크기
			m.setColor(color[(int) (Math.random() * color.length)]); //색깔 랜덤
			m.setThickness((int) (Math.random() * 20) + 1); //크림 랜덤

			this.list[i] = m;

		}

		System.out.printf("마카롱을 %d개 만들었습니다.\n", this.list.length);
		System.out.println();
	}

	public void check() { //최종 결과 
		int pass = 0; //합격
		int failed = 0; //불합격
		for (int i = 0; i < list.length; i++) {
			Macaron m = this.list[i]; // 

			if (check(m)) { //m 조건이 부합할 때 통과 1개 증가식
				pass++;
			} else {
				failed++; //부합하지 않을 때 증가식
			}
		}

		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n", failed);
		System.out.println();

	}

	public void list() { //랜덤 결과값 
		System.out.println("[마카롱 목록]");

		for (int i = 0; i < list.length; i++) { //
			Macaron m = this.list[i];

			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n", i, m.getSize(), m.getColor(), m.getThickness(),
					check(m) ? "합격" : "불합격"); //size color thickness 모두 만족시 합격

		}

		System.out.println();

	}

	private boolean check(Macaron m) {
		if (!(m.getSize() >= 8 && m.getSize() <= 14)) { //크기 범위 밖일 때 false
			return false;
		}

		if (m.getColor().equals("black")) { //블랙일때 false
			return false;
		}

		if (!(m.getSize() >= 3 && m.getSize() <= 18)) { //크림 크기 범위 밖일때 false 
			return false;
		}

		return true;
	}
}
