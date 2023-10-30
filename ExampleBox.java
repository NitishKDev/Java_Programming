class Box{
	private int length,breadth,height;
	public void SetDimension(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void ShowDimension()
	{
		System.out.println("length of box= "+length);
		System.out.println("breadth of box= "+breadth);
		System.out.println("height of box= "+height);
	}
}
class ExampleBox{
	public static void main(String []args)
	{
		Box b1=new Box();
		b1.SetDimension(1,2,3);
		b1.ShowDimension();
		b1=new Box();
		b1.ShowDimension();
	}
}
