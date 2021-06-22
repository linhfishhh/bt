package Arraylst;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLst<String> a=new MyLst<String>();
		a.add(0, "abcd");
		a.add(1, "sdsf");
		a.add(2, "ads");
		a.remove(1);
		a.show();
	}

}
