public class Tree {
    private Node root;
    
    
    public Tree(int size,int value) {
        
    	this.root = new Node(size,value);//Root constructori
    
    }

    public Node getRoot() {
        return root;
    }
    public void inorder(Node node){
    
    	Node iterator=node;
        int i=0;
    	while(i<node.getChildSize()) {
	        while(iterator.getChild(0)!=null) {
	        	
	        	iterator=iterator.getChild(0);
	        	
	        }
	        int index=1;
	        System.out.print(iterator.getValue()+" ");
	        iterator=iterator.getParent();
	        System.out.print(iterator.getValue()+" ");
	        while(index<iterator.getChildSize()){
	        	if(iterator.getChild(index)!=null) {
	        		System.out.print(iterator.getChild(index).getValue()+" ");
	        		index++;
	        	}else
	        		break;
	        	
	        }
	        iterator=iterator.getParent();
	        i++;
    	}
    }
    /*
    public boolean isEmpty() {
        return root.isEmpty();//bos mu?
    }*/
/*
    public void traverse() {
        if(!isEmpty())
            root.traverse();
    }

*/
}