package csdn_equals;

public class EqualsMethod {
	private  int age;
	//����һ���������ж����������Ƿ���ͬһ��
	//�жϵ����������䣬���������ͬ����Ϊͬһ����
	
	/*
	 * ��ͬ���Զ��巽����object�����У��Ѿ������������ķ���
	 * ֱ��ʹ�ã����ǣ��������ƣ����ͺͲ���һ��������ͬ������
	 * ��������Ĺ����������������๦�ܵ���������
	 */
	
	public boolean equals(Object obj) {
		//���Ч�ʣ������������ָ���ͬһ������ֱ���жϵ�ַ����ת�����Ƚ�������
		if(this==obj)
			return true;
		//object ��û��age����,EqualsMethod����������
		//object��������ת��
		if(!(obj instanceof EqualsMethod))
			throw new ClassCastException("���ʹ���");
		EqualsMethod p=(EqualsMethod) obj;
		return this.age==p.age;	
	}

	public static void main(String[] args) {
		EqualsMethod em1=new EqualsMethod();
		EqualsMethod em2=new EqualsMethod();
		System.out.println(em1.equals(em2));//�ж������Ƿ����
		System.out.println(em1==em2);//�жϵ�ַ�Ƿ����
		
		//ջ�д洢���ǵ�ַ���ֲ���������ߣ���ַָ����е�ֵ
		//���д洢����ֵ��ʵ����������
		//���ԱȽ�����new�����Ƿ���ȣ��ȵ����������׵�ַ�Ƿ����
	}

}
