package com.test.question.obj;

public class Packer {

	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수 : %s입니다.\n",pencil.info());
		
		if(pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B") || pencil.getHardness().equals("2B") || pencil.getHardness().equals("B") || pencil.getHardness().equals("HB") || pencil.getHardness().equals("H") || pencil.getHardness().equals("2H") || pencil.getHardness().equals("3H") || pencil.getHardness().equals("4H")) {
			Packer.pencilCount++;
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			
		}
	}
	
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s입니다.\n",eraser.info());
		
		if(eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") || eraser.getSize().equals("Small") ) {
			Packer.ballPointPenCount++;
		
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 실패했습니다.");
	}
	}

	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s입니다.\n",ballPointPen.info());
	
		if((ballPointPen.getThickness()==0.3 ||ballPointPen.getThickness()==0.5 || ballPointPen.getThickness()==0.7 ||ballPointPen.getThickness()==1.0 ||ballPointPen.getThickness()==1.5) && (ballPointPen.getColor().equals("red") || ballPointPen.getColor().equals("blue") || ballPointPen.getColor().equals("green") ||ballPointPen.getColor().equals("black"))) {
			Packer.ballPointPenCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 실패했습니다.");
		}
		}
		
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %s입니다.\n",ruler.info());

		if((ruler.getLength()==30 || ruler.getLength()==50 || ruler.getLength()==100 )&& (ruler.getShape().equals("줄자") || ruler.getShape().equals("운형자") || ruler.getShape().equals("삼각자"))){
			Packer.rulerCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("포장을 실패했습니다.");
			
		}
		}

	public void countPacking (int type) {
		System.out.println("=================");
		System.out.println("포장 결과");
		System.out.println("=================");
		
		
		if(type ==0 ) {
			System.out.printf("연필 %d회\n",Packer.pencilCount);
			System.out.printf("지우개 %d회\n",Packer.eraserCount);
			System.out.printf("볼펜 %d회\n",Packer.ballPointPenCount);
			System.out.printf("자 %d회\n",Packer.rulerCount);
			
			
		}else if (type ==1) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
		}else if (type ==2) {

			System.out.printf("지우개 %d회\n", Packer.eraserCount);
		}else if(type==3) {

			System.out.printf("볼펜 %d회\n", Packer.ballPointPenCount);
		}else if (type ==4) {

			System.out.printf("자 %d회\n", Packer.rulerCount);
		}
	}
	
	}



