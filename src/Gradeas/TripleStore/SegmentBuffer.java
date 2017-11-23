package Gradeas.TripleStore;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

import Gradeas.Structures.DataStar;

public class SegmentBuffer extends LinkedBlockingQueue<DataStar> {
boolean noElementToadd=false;
boolean IsReady=true;

public SegmentBuffer(int i) {
	super(i);
}

public void setReady()
{
	IsReady=true;
}

public void setUnReady()
{
	IsReady=false;
}
public void noMoreElements()
{
	noElementToadd=true;
}

public boolean next()
{
	return !noElementToadd;
}
boolean isReady()
{
	if((this.remainingCapacity()>0)&&(IsReady)) return true;
	else return false;
}
public void addStar(DataStar d)
{
	super.add(d);
}
public static void main(String[] args) throws IOException, InterruptedException {
	

	final SegmentBuffer bf=new SegmentBuffer(20);        

	Runnable r = new Runnable() {
        public void run() {
        	DataStar d1=new DataStar();
        	bf.add(d1);
        	try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	DataStar d2=new DataStar();
        	bf.add(d2);
        	try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	DataStar d3=new DataStar();
        	bf.add(d3);
        	try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	DataStar d4=new DataStar();
        	bf.add(d4);
        	try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	DataStar d5=new DataStar();
        	bf.add(d5);
        	try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	bf.noMoreElements();
        	System.out.println("Test ok !");
        	
    		
    };
};
new Thread(r).start();
while(bf.next())
{
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(bf.remainingCapacity());
	System.out.println(bf.size());

	System.out.println(bf.poll());
}

}
}
