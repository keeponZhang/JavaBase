package com.zhang.javabase.day21.chario;

public class Demo6_Wrap {

	/**
	 * @param args 装饰设计模式的好处是:
	 *             耦合性不强,被装饰的类的变化与装饰类的变化无关
	 */
	public static void main(String[] args) {
		HeiMaStudent hms = new HeiMaStudent(new Student());
		hms.code();
	}


	interface Coder {
		public void code();
	}

	static  class Student implements Coder {

		@Override
		public void code() {
			System.out.println("javase");
			System.out.println("javaweb");
		}

	}

	static class HeiMaStudent implements Coder {
		//1,获取被装饰类的引用
		private Student s;                        //获取学生引用

		//2,在构造方法中传入被装饰类的对象
		public HeiMaStudent(Student s) {
			this.s = s;
		}

		//3,对原有的功能进行升级
		@Override
		public void code() {
			s.code();
			System.out.println("ssh");
			System.out.println("数据库");
			System.out.println("大数据");
			System.out.println("...");
		}
	}


//	static Direction findDirection(int row, int col) {
//		Direction direction = lastDirection;
//		switch (direction) {
//			case Right: {
//				//如果到右边界或者当前位置右方已经填充过数字，则转弯向下
//				if ((col == length - 1) || (arr[row][col + 1] != 0))
//					direction = direction.Down;
//				break;
//			}
//			case Down: {
//				//如果到下边界或者当前位置下方已经填充过数字，则转弯向左
//				if ((row == length - 1) || (arr[row + 1][col] != 0))
//					direction = direction.Left;
//				break;
//			}
//			case Left: {
//				//如果到左边界或者当前位置左方已经填充过数字，则转弯向上
//				if ((col == 0) || (arr[row][col - 1] != 0))
//					direction = direction.Up;
//				break;
//			}
//			case Up: {
//				//如果当前位置上方已经填充过数字，则转弯向右
//				if (arr[row - 1][col] != 0)
//					direction = direction.Right;
//				break;
//			}
//		}
//		return direction;
//	}


}
