package java_session2Assingment3;

public class printabpattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				if((i+j)==2)
					System.out.print("a");
				else if((i+j)==4&&((j%2==1)&&(i%2==1)))
					System.out.print("a");
				else if((i+j)==6&&((i%2==0&&j%2==0)||(i%2==1&&j%2==1)))
						System.out.print("a");
				else if((i+j)==3&&((i==j+1)||(j==i+1)))
						System.out.print("b");
				else if((i+j)==5&&((i==j+1)||(j==i+1)))
					System.out.print("b");
				else if(i==j&&i+j==4)
					System.out.print("c");
				else
					System.out.print(" ");
  			}
               System.out.print("\n");
		// TODO Auto-generated method stub

	}

}
}

