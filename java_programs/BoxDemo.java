    class Box
   {
 	double height;
	double width;
	double depth;
	}
	class BoxDemo
	{
	public static void main(String args[])
	{
	Box b1= new Box();
	Box b2= new Box();

double vol1,vol2;

b1.height=20;
b1.width=15;
b1.depth=25;

b2.height=13;
b2.width=30;
b2.depth=24;

vol1=b1.height*b1.width*b1.depth;
System.out.println("Volume of the box is:"+vol1);

vol2=b2.height*b2.width*b2.depth;
System.out.println("Volume of the box is:"+vol2);

}
}