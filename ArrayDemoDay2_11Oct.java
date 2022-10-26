package capgTraining;

public class ArrayDemoDay2_11Oct {
	public static void main(String args[]) {
//		One Dimensional Array
//		Case 1----Initializing while declaration
		String[] friends = {"sagar","sourabh","Himanshu"};
		System.out.println(friends[2]); //Himanshu
	
//		for loop
		for(int i=0;i<friends.length;i++) {
			System.out.print(friends[i]+", "); //sagar, sourabh,Himanshu
		}
		System.out.println();
		
//		for-each loop
		
		for(String friend: friends) {
		System.out.println(friend);
			
		}
		
//		while
		int i =0;
		while(i<friends.length) {
			System.out.println(friends[i]);
			i++;
		}
		
//		Case2---Intializing after declaration
		int[] life = new int[5];
		life[0] = 30;
		life[1] = 15;
		life[2] = 7;
		life[3] = 90;
		
		System.out.println();
		for(int hacked : life)
		{
			System.out.print(hacked+ " ");
		}
		
		System.out.println();
		
		char[] charArr = new char[] {'n','a','n','d','i','n','i'};
		for(char meri: charArr)
		{
			System.out.print(meri);
		}
		
//		update
		
		charArr[0] ='N';
		
		System.out.println();
		for(int i1=0;i1<charArr.length;i1++)
		{
			System.out.print(charArr[i1]);
		}
		
		System.out.println();
		
//		Multidimentional Array
		int[][] intArr = {{15,30},{18,90},{16,80}};
		System.out.println(intArr[0][1]); //30
		System.out.println(intArr[1][1]); //90
		System.out.println(intArr[2][1]); //80
		
		for(int j=0;j<intArr.length;j++)
		{
			for(int k=0;k<intArr[j].length;k++)
			{
				System.out.print(intArr[j][k]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
//	  Update
		intArr[2][0]=190;
		System.out.println(intArr[2][0]);


//	Case2
	String[][] jeevan = new String[3][3];
	jeevan[0][0]="family";
	jeevan[0][1]="dost";
	jeevan[0][2]="trips";
	
	
	jeevan[1][0]="mandir";
	jeevan[1][1]="party";
	jeevan[1][2]="Pahad";
	
	jeevan[2][0]="darshan";
	jeevan[2][1]="masti";
	jeevan[2][2]="yaadein";
	
	System.out.println();
	
	for(int j=0;j<jeevan.length;j++)
	{
		for(int k=0;k<jeevan[j].length;k++)
		{
			System.out.print(jeevan[j][k]+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
//	OR WE CAN PRINT LIKE THIS
	
	for(String[] chakra:jeevan) {
		for(String pahiya:chakra) {
			 System.out.print(pahiya+" ");
		}
		System.out.println();
	}
	
	
//	Jagged Arrays
	int[][] jaggedArr = new int[4][];
	jaggedArr[0]= new int[1];
	jaggedArr[1]= new int[2];
	jaggedArr[2]=new int [3];
	jaggedArr[3]=new int[4];
	
//	Inserting value in Jagged Array
	for(int l=0;l<jaggedArr.length;l++)
	{
		for(int s=0;s<jaggedArr[l].length;s++)
		{
			jaggedArr[l][s]=15;
		}
		System.out.println();
	}
	
//	reading values in jagged array
	for(int l=0;l<jaggedArr.length;l++)
	{
		for(int s=0;s<jaggedArr[l].length;s++)
		{
			System.out.print(jaggedArr[l][s]+" ");
		}
		System.out.println();
	}
}
}