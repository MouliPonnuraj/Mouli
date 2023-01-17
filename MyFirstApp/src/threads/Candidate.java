package threads;

public class Candidate {
    public void checkmarks(int mark) throws Exception{
    	if(mark<30){
    		throw new Exception("marks invalid");
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
    	  Candidate obj=new Candidate();
    	  obj.checkmarks(10);
      }
      catch(Exception e){
    	  System.out.println(e.getMessage());
    	  e.printStackTrace();
      }
	}

}
