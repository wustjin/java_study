//每个java项目中系统默认导入了java.lang包  

public class hello//类名和文件名相同
{
	public static void main(String[] args){//main函数为程序入口通常在public类中
		//args 为命令行参数
		System.out.println("hello java");//控制台输出

		A a = new A();
		a.f1();
	}
}

class A
{
	public void f1(){
		System.out.println("f1 called");
	}
}

/*
命令行使用
编译： javac *.java 
运行： java *            //* 为文件名，不带后缀
1.Java程序都是以类来组织，一个文件中可以有多个类。
 2.每个类编译完成后会生成各自的字节码文件。
 //不管类是否是在不同文件中定义，最终每个类都会生成一个字节码文件
 //这是由于最终程序通过jvm中由类装载器交与执行引擎调用主机系统执行
 3.类名前可加public也可不加，加了以后保存的文件名必须要跟这个类的名字相同。
 4.一个源文件中只能含有一个标记为public的类。
 5.main函数通常应放在public类中。

 对于大型项目不建议直接运行class文件
 通常采用jar包形式运行 java -jar *. jar
 JAR文件是一种按Java格式压缩的类包，包含内容 class、properties文件等，是Java文件封装的最小单元。
JAR文档很类似 ZIP 或 RAR 文档。
主要区别是：在JAR文档中，包含了一个 META-INF/MANIFEST.MF 文档（自动创建），该文档存放的是关于系统运行的一些配置信息，
例如Main-Class信息。

*/