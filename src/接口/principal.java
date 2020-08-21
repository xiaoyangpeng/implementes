package 接口;
/**
 * 接口不能用于实例化对象。
接口没有构造方法。

接口不能包含成员变量，除了 static 和 final 变量。
接口不是被类继承了，而是要被类实现。
接口支持多继承。
 * 
 *
 */
interface todo{
	
	public int a=111 ; //所有的属性都是public,static,final
	// 如果不写默认为public
	public int cc=33;
	static int dd=44;
	final int ff=55;
	
	// fallo
	//private int  b=0;
////////////////////////////////////////////////////////////////	
	
	//falllllo 
/*	 public void metodo(){
    System.out.println("不能神明具体的方法");
	 }*/
	//faaaallloooo
//	private void jaja();//接口中所有的方法都是抽象的和public的,因为只有public可以被全部的类llamar，private只能被自己的类调用，那么
	// 就不能实现接口了
	
	//接口中所有的方法必须是抽象方法。//一下没有但是默认为抽象方法
	public void metodo1();	//在接口中的所有方法都必须只声明方法标识，而不要去声明具体的方法体，因为具体的方法体的实现是由继承该接口的类来去实现的
	 void metodo2();// 等于public abstrac void metodo2();
	//如果在子类不写public来重写这个方法，那么会报错，因为子类什么都不写，不会默认为public ，那么权限就小于public 那么就不能重写
	public abstract void metodoabscracto();
}
interface todo2 { 
	int valortodo2=3333;
	public int todo2a=22;
	public abstract void metodotodo2();
}
interface todo3 extends todo,todo2{ // 接口的多继承
	public int todo3a=33;
	public abstract void metodotodo3();
}

////////////////////////////////////////////////////////////////////////////////////////////
class entrada1 implements todo3 { // 如果在todo3没有继承 todo 和todo1
	// 那么就要写 implements todo,todo2,todo3
 int cc=1111;
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		System.out.println("entrada重写了接口todo的metodo1");
	}

	@Override
	public void metodo2() {
		// TODO Auto-generated method stub
		System.out.println("entrada重写了接口todo的metodo2");
	}
	
	@Override
	public void metodoabscracto() {
		// TODO Auto-generated method stub
		System.out.println("entrada重写了接口todo的metodoabscracto");
	}
	

	@Override
	public void metodotodo2() {
		// TODO Auto-generated method stub
		System.out.println("entrada重写了接口todo222222的metodo");
	}

	@Override
	public void metodotodo3() {
		// TODO Auto-generated method stub
		System.out.println("entrada重写了接口todo3333333的metodo");
	}
	
	 public void metodo_entrada1() {
		 System.out.println("ese es metodo de entrada 1");
	 }

	

	
}

//////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class principal extends entrada1  {
//    官方解释：Java接口是一系列方法的声明，是一些方法特征的集合，一个接口只有方法的特征没有方法的实现，因此这些方法可以在不同的地方被不同的类实现，而这些实现可以具有不同的行为（功能）。

    //  我的解释：接口可以理解为一种特殊的类，里面全部是由全局常量和公共的抽象方法所组成。
    //接口是解决Java无法使用多继承的一种手段，但是接口在实际中更多的作用是制定标准的。或者我们可以直接把接口理解为100%的抽象类，既接口中的方法必须全部是抽象方法

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*		//falllo
		//todo prueba1=new todo();//我们不能直接去实例化一个接口，因为接口中的方法都是抽象的
		
		todo prueba=new entrada1();// 我们可以使用接口类型的引用指向一个实现了该接口的对象，并且可以调用这个接口中的方法
		prueba.metodo1();
		prueba.metodo2();
		todo prueba2=new principal();
		prueba2.metodo1();
		prueba2.metodo2();
		*/
		
		
///////////////////////////////////////////////////////////////////////////////////////////		
	/**
		
		principal objeto=new principal();//因为principal继承了entrada的全部所以它的全部办法可以用
		objeto.metodo1();
		objeto.metodo2();
		objeto.metodotodo2();
		objeto.metodotodo3();
		objeto.metodo_entrada1();
//////////////////////////////////////////////////		
		*/
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		todo a=new entrada1();// entrada 1 有todo，todo1，todo2,的接口，所以这个接收器可以接收全部的信号
		//但是我们用todo遥控器去 发送所以只能发送todo遥控器里有的metodo1 和metodo2
		// 但是我们在entrada重写了metodo1 和metodo 2 所以用的是entrada 里重写的
		a.metodo1();
		a.metodo2();
		System.out.println(a.dd); // 我们也可以调用todo的成员
		
		todo2 b=(todo2)a;// 我们用todo2 遥控器 来发送给 a que es 接收器de entrada1
		// 那么虽然entrada1 可以接收全部的信号
		//但是todo2 只能发送 信号metodotodo2
		b.metodotodo2();
		System.out.println(b.valortodo2);//我们也可以调用todo2的成员
		
		todo3 c=(todo3)b; 
		c.metodotodo3();
	
		
	}
	@Override // 必须重写todo里全部的办法，要不然就会出错
	// 如果我们在的类，没有重写全部的todo的类，可以变成一个抽象类
	public void metodo1() {
		// TODO Auto-generated method stub
		System.out.println("主类重写了接口todo的metodo1");

}
	@Override
	public void metodo2() {
		System.out.println("主类重写了接口todo的metodo2");
		
	}
	@Override
	public void metodoabscracto() {
		// TODO Auto-generated method stub
		System.out.println("主类重写了接口todo的metodoabscracto");
		
	}
}
