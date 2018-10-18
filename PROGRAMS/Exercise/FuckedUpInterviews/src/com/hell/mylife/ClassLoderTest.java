package com.hell.mylife;

class LoadingClassCustom{
	static{
		System.out.println("LoadingClassCustom is loading!!!");
	}
}
public class ClassLoderTest {

	public static void main(String[] args) {
		
		System.out.println("ClassLoderTest is started executing....");
		/*// TODO Auto-generated method stub
		System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
                + ClassLoderTest.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
		
		try {
			Class.forName("com.hell.mylife.ClassLoderTest", true, ClassLoderTest.class.getClassLoader().getParent());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		ClassLoader classLoder = ClassLoderTest.class.getClassLoader();
		Class l;
		try {
			l = classLoder.loadClass("com.hell.mylife.LoadingClassCustom");
			classLoder.loadClass("com.hell.mylife.LoadingClassCustom");//It does not load it, since already loaded. No exception
			
			System.out.println(l.getName());
			try {
				l.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
