package csdn_equals;

public class EqualsMethod {
	private  int age;
	//定义一个方法，判断两个对象是否是同一个
	//判断的依据是年龄，如果年龄相同，视为同一个人
	
	/*
	 * 不同再自定义方法，object父类中，已经定义了这样的方法
	 * 直接使用，覆盖（函数名称，类型和参数一样），不同于重载
	 * 保留父类的功能声明，定义子类功能的特有内容
	 */
	
	public boolean equals(Object obj) {
		//提高效率，如果两个引用指向的同一个对象，直接判断地址，不转换并比较内容了
		if(this==obj)
			return true;
		//object 中没有age属性,EqualsMethod是他的子类
		//object必须向下转型
		if(!(obj instanceof EqualsMethod))
			throw new ClassCastException("类型错误");
		EqualsMethod p=(EqualsMethod) obj;
		return this.age==p.age;	
	}

	public static void main(String[] args) {
		EqualsMethod em1=new EqualsMethod();
		EqualsMethod em2=new EqualsMethod();
		System.out.println(em1.equals(em2));//判断年龄是否相等
		System.out.println(em1==em2);//判断地址是否相等
		
		//栈中存储的是地址，局部变量在里边，地址指向堆中的值
		//堆中存储的是值，实体对象在里边
		//所以比较两个new对象是否相等，比的是两个的首地址是否相等
	}

}
