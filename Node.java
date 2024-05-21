import java.util.ArrayList;

public class Node {
    private int value;
    private Node parent;
    private int childSize;
    private Node[] children;

    public Node(int childSize,int value) {//ilk basta olusturulan nodeun (Yani rootun constructori.)
        children = new Node[childSize];
        this.childSize=childSize;
        this.parent = null;
        setValue(value);
        //Treenin rootu olustu....
    }

    public Node(Node parent, int value,int childSize) {
        this.childSize=childSize;
    	children = new Node[childSize];
        this.parent = parent;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getChild(int index) {
        return children[index];
    }
   

    public void addChild(int index,int value,int childSize){
        
    	children[index]=new Node(this, value,childSize);
    }
    public int getChildSize() {
    	return childSize;
    }
    /*
    public void addChild(int value){
        children.add(new Node(this, value));
    }*/

    public void setValue(int value) {
        this.value = value;
    }
    /*
    public int getSize() {
        return children.size();
    }*/
    /*
    public boolean isEmpty() {
        return this.value == -1000;
    }*/
    public int numberOfChild() {
    	int num=0;
    	
    	for(int i=0;i<childSize;i++) {
    		
    		if(children[i]!=null)
    			num++;
    		
    	}
    	
    	return num;
    }
    
    /*
    public boolean isLeaf() {
        return children.isEmpty();
    }*/
    /*
    public void traverse() {
        System.out.println("Parent: " + parent + "\tChildCount: " + getSize() + "\tIsLeaf: " + isLeaf() + "\tValue: " + value);
        for(Node node : children)
            node.traverse();
    }*/
}