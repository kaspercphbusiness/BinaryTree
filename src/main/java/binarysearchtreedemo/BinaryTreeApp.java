package binarysearchtreedemo;


public class BinaryTreeApp {

	/**
	 * @param args - string of useless arguments
         * More stuff
	 */
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
                bt.insert(2);
                bt.insert(1);
                bt.insert(3);
		
		boolean res = bt.lookup(2);                
		System.out.println(res);
                
                //int min = bt.sum();
		//System.out.println(min);
                
                res = bt.lookup(4); 
                System.out.println(res);

		

	}

}
