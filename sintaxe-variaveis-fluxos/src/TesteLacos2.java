
public class TesteLacos2 {
	
	  public static void main(String[] args) {
	    for(int linha = 0; linha < 10; linha++){
	      for(int coluna = 0; coluna <= linha; coluna++){
	        System.out.print("*");
	      }

	      System.out.println();
	    }

	    for(int linha = 0; linha < 10; linha++){
	      int coluna = 0;
	      while(coluna <= linha) {
	        System.out.print("*");
	        coluna++;
	      }
	      System.out.println();
	    }

	    for(int linha = 0; linha < 10; linha++){
	      for(int coluna = 0; coluna < 10; coluna++){
	        if(coluna > linha){
	          break;
	        }

	        System.out.print("*");
	      }

	      System.out.println();
	    }

	    for(int linha = 0; linha < 10; linha++){
	      int coluna = 0;
	      while(coluna <= linha) {
	        System.out.print("*");
	        coluna++;
	      }
	      System.out.println();
	    }
	  }
	}


}
