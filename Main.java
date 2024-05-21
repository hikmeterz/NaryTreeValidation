import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int nAry= Integer.parseInt(args[1]);//Treenin 	 cocuk sayisi Nsize.	
		String s= "";
		Scanner k = new Scanner(System.in);
		s=k.nextLine();//Root icin.
		
		Tree tree=null;
		
		
		//Node iterator1=iterator.getChild(0);
		
		if( s.indexOf('|')> 0 || s.indexOf(' ')>0  || s.indexOf('$')>0){//Rootun satir kontrolu...
			System.out.println("Tree olusturulamaz.");
			System.exit(0);
			
		}else{
			tree = new Tree(nAry,Integer.parseInt(s));//nary sizeinde agac olusturuldu...
		
		}
		Node iterator=tree.getRoot();//iterator rootu gosteriyor.
		int index=0;
		s=k.nextLine();
		if(!s.equals("$")) {
			while(s.length()>0) {
				if(s.indexOf('|')>=0 ){
					iterator.addChild(index,Integer.parseInt(s.substring(0,s.indexOf(' ') ) ) , nAry);
					s=s.substring(s.indexOf('|')+2);
					index++;
				}else {
					iterator.addChild(index,Integer.parseInt(s.substring(0)) , nAry);
					s="";
				}
			}
		}else{
			System.out.println(tree.getRoot().getValue());
			System.exit(0);
		}
		
		
		if(iterator.numberOfChild()>nAry) {
			System.out.println("Tree olusturulamaz.");
			System.exit(0);
		}
		int kontrol=0;
		int parentk=0;
		index=0;
		int deger=0;
		int parent_index=0;
		int value_sayisi=0;
		int sayi=iterator.numberOfChild();
		while(!s.equals("$")) {
			s=k.nextLine();
			if(s.equals("$"))
				break;
			value_sayisi=numberOfValues(s);
			
			if(value_sayisi<=nAry*sayi) {
				sayi=0;
				index=0;
				while(s.length()!=0) {
					
						
					if(s.indexOf('|') >=0) {
						deger=Integer.parseInt(s.substring(0,s.indexOf(' ')));
						s=s.substring(s.indexOf('|')+2);
						
					}else{
						deger=Integer.parseInt(s);
						s="";
						
					}
					
					if(index!=0 && index%nAry!=0) {
						iterator.getChild(parent_index).addChild(index%nAry, deger, nAry);
							
					}else if(index!=0 && index%nAry==0) {
						parent_index++;
						if(parent_index!=0 && parent_index % nAry==0){
							parentk++;
							iterator=iterator.getParent().getChild(parentk);
							kontrol=1;		
						}
						
						iterator.getChild(parent_index%nAry).addChild(index%nAry, deger,nAry);
						
					}else if(index==0) {
						iterator.getChild(parent_index).addChild(index&nAry, deger, nAry);
					}	
						
					index++;
					sayi++;
							
				}
				
			}else {
				System.out.println("Tree olusturulamaz.");
				System.exit(0);
				
			}	
			parent_index=0;
			parentk=0;
			if(kontrol==0) {//null pointerlar gerekebilir.
				iterator=iterator.getChild(0);
			}else
				iterator=iterator.getParent().getChild(0).getChild(0);
		}
		
		//Tree traverse in order.....
		
		
		tree.inorder(tree.getRoot());
		
		
	}
	
	public static int numberOfValues(String s){
		int num=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='|')
				num++;
			
		}
		
		return num+1;
	}
	
	
	
	
	
	

}
