package polymorphism;

public class ProductSearch {
public void search(int pid) {
	System.out.println("product search by the id:"+pid);
}
public void search(String pname) {
	System.out.println("product search by pname:"+pname);
}
public void search(int pid,String pname) {
	System.out.println("product search by pname "+pname+" and pid "+pid );
}
public static void main(String[] args) {
	ProductSearch ps=new ProductSearch();
	ps.search(1234);
}
}
