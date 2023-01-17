package Deadlock;

public class FirstThread {
	ResourceA obj;
	   ResourceB bobj;

	   public FirstThread(ResourceA obj,ResourceB bobj)
	   {
	       this.obj=obj;
	       this.bobj=bobj;
	   }

	    public void run()
	    {

	         synchronized(obj)
	         {
	             obj.printMessage(bobj);
	             synchronized(bobj)
	             {
	                 bobj.printMessage(obj);
	             }
	         }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
