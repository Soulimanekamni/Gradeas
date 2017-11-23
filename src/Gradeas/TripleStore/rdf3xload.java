package Gradeas.TripleStore;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import Gradeas.Structures.DataStar;
import Gradeas.Structures.GradeasID;

public class rdf3xload {
	
	static {
	      System.loadLibrary("loader"); 
	   }
	static PredicatesSet preds=new PredicatesSet();

	native static void loadSegment(String dataPath,String schemaPath,String storagePath);
	/*--  Equality operators --*/
	native static DataStar getDataStar(String dbname,TSBuffer bfr,GradeasID id, PredicatesSet preds);
	
	/*--  Inf operators  --*/
	//native static DataStar get_Inf(String dbname,TSBuffer bfr,GradeasID id, PredicatesSet preds);
	
	native static int get_Inf_Long(String dbname,TSBuffer br,long id,PredicatesSet preds);
	
	native static void get_Inf_Int(String dbname,TSBuffer br,int id,PredicatesSet preds);
	native static void get_Inf_Float(String dbname,TSBuffer br,float id,PredicatesSet preds);
	native static void get_Inf_Double(String dbname,TSBuffer br,double id,PredicatesSet preds);
	native static void get_Inf_Short(String dbname,TSBuffer br, short id,PredicatesSet preds);
	/*--  Inf or equal operators  --*/
	native static void get_Inf_Equal_Long(String dbname,long id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Int(String dbname,int id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Float(String dbname,float id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Double(String dbname,double id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Short(String dbname,short id,SegmentBuffer br,PredicatesSet preds);
    /*-- Sup ---*/
	native static void get_Sup_Long(String dbname,long id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Int(String dbname,int id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Short(String dbname,short id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Double(String dbname,double id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Float(String dbname,float id,SegmentBuffer br,PredicatesSet preds);
	 /*-- Sup or equal ---*/
	native static void get_Sup_Equal_Long(String dbname,long id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Equal_Int(String dbname,int id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Equal_Short(String dbname,short id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Equal_Double(String dbname,double id,SegmentBuffer br,PredicatesSet preds);
	native static void get_Sup_Equal_Float(String dbname,float id,SegmentBuffer br,PredicatesSet preds);
	 /*-- Inf and Sup  ---*/
	native static void get_Inf_Sup_Long(String dbname,long min,long max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Int(String dbname,int min,int max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Short(String dbname,short min,short max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Float(String dbname,float min,float max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Double(String dbname,double min,double max,SegmentBuffer br,PredicatesSet preds);
	 /*-- Inf equal and Sup  ---*/
	native static void get_Inf_Equal_Sup_Long(String dbname,long min,long max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Int(String dbname,int min,int max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Short(String dbname,short min,short max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Float(String dbname,float min,float max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Double(String dbname,double min,double max,SegmentBuffer br,PredicatesSet preds);
	 /*-- Inf and Sup or equal  ---*/
	native static void get_Inf_Sup_Equal_Long(String dbname,long min,long max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Equal_Int(String dbname,int min,int max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Equal_Short(String dbname,short min,short max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Equal_Float(String dbname,float min,float max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Sup_Equal_Double(String dbname,double min,double max,SegmentBuffer br,PredicatesSet preds);
	 /*-- Inf and Sup or equal  ---*/
	native static void get_Inf_Equal_Sup_Equal_Long(String dbname,long min,long max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Equal_Int(String dbname,int min,int max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Equal_Short(String dbname,short min,short max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Equal_Float(String dbname,float min,float max,SegmentBuffer br,PredicatesSet preds);
	native static void get_Inf_Equal_Sup_Equal_Double(String dbname,double min,double max,SegmentBuffer br,PredicatesSet preds);
    /*-- Tab get ---*/
	native static void get_table_Long(String string, GradeasID[] ids,SegmentBuffer bfr, PredicatesSet preds);
	native static void get_table_Int(String string, GradeasID[] ids,SegmentBuffer bfr,PredicatesSet preds);
	native static void get_table_Short(String string, GradeasID[] ids,SegmentBuffer bfr,PredicatesSet preds);
	native static void get_table_Float(String string, GradeasID[] ids,SegmentBuffer bfr,PredicatesSet preds);
	native static void get_table_Double(String string, GradeasID[] ids,SegmentBuffer bfr,PredicatesSet preds);



	static String storageFolder;

	public static void deleteFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String sgFolder=args[0];
		storageFolder=args[1];
		preds.add(1);
		preds.add(2);
		preds.add(3);
		Path path=Paths.get(storageFolder);
		if(Files.exists(path))
			deleteFolder(path.toFile());
		while(Files.exists(path))
			Thread.sleep(10);
		Files.createDirectory(path);
		
		FileInputStream fis = new FileInputStream(sgFolder+"/affectation");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		while ((line = br.readLine()) != null) {
			String dataPath=sgFolder+"/"+line+".data";
			String schemaPath=sgFolder+"/"+line+".schema";
			String storagePath=storageFolder+"/"+line;
			loadSegment(dataPath,schemaPath,storagePath);
		}
	 
		br.close();
		final PredicatesSet preds=new PredicatesSet();
		preds.add(1);
		preds.add(2);
		preds.add(3);
		TSBuffer bfr=new TSBuffer(15);
		TSBuffer bfr2=new TSBuffer(15);
		
		GradeasID headStar=new GradeasID(1L,0,0);
		getDataStar(storageFolder+"/1",bfr,headStar,preds);
		System.out.println(bfr);
		/*
		GradeasID headStarf=new GradeasID(0.5f,0,0);
		getDataStar(storageFolder+"/2",bfr2,headStarf,preds);
		System.out.println(bfr2);
		*/
		TSBuffer bfr3=new TSBuffer(15);
		System.out.println(get_Inf_Long(storageFolder+"/1",bfr3,-5000009990L,preds));
		System.out.println(bfr3);
		
		
		
		/*
		// Equality Stars
		 */
		//Test_Float(args[2].charAt(0));
		
		/*Test_Float('d');
		Test_Float('i');
		Test_Float('l');
		Test_Float('s');
		
		
		System.out.println("==================================================");
	    DataStar dd=getDoubleStar(storageFolder+"/2",-0.2,preds);
		if(dd!=null) System.out.println(dd);
		System.out.println("==================================================");
		DataStar di=getIntStar(storageFolder+"/3",-499999,preds);
		if(di!=null) System.out.println(di);
		System.out.println("==================================================");
		DataStar dl=getLongStar(storageFolder+"/4",5000000002L,preds);
		if(dl!=null) System.out.println(dl);
		System.out.println("==================================================");
		DataStar ds=getShortStar(storageFolder+"/5",(short)3L,preds);
		if(ds!=null) System.out.println(ds);
		System.out.println("==================================================");

		*/
		
		
		

		//System.out.println(ids[0].get_Double_Value());
		//System.out.println(ids[1].get_Double_Value());
		/*
		get_table_Int(storageFolder+"/3",ids,bf,preds);
	
		while(bf.next()||!bf.isEmpty())
		{
			DataStar d=bf.poll();
			if(d!=null) System.out.println(d);
		}
		*/
		
		
		
		
		
	}
	/*
	private static void Test_Float(final char f) throws InterruptedException {
	
		System.out.println("=============================get Equal =====================");	
		DataStar df=getShortStar(storageFolder+"/5",(short)1,preds);
		if(df!=null) System.out.println(df); else System.out.println("null");
	

		//get_Inf_Long(storageFolder+"/4",97L,bf);
		//1:float 2:double 3:int 4:long 5:short
		final SegmentBuffer bf1=new SegmentBuffer(40);
		System.out.println("===============get_Inf====================================================================");
		Runnable r1 = new Runnable() {
	        public void run() {
	        	if(f=='f')
		        get_Inf_Float(storageFolder+"/1",0.1F,bf1,preds);
	        	if(f=='d')
			    get_Inf_Double(storageFolder+"/2",-0.20,bf1,preds);
	        	if(f=='i')
	        	get_Inf_Int(storageFolder+"/3",-499999,bf1,preds);
	        	if(f=='l')
		        get_Inf_Long(storageFolder+"/4",5000000000L,bf1,preds);
	        	if(f=='s')
		        get_Inf_Short(storageFolder+"/5",(short)8,bf1,preds);  		        	
	        };
		};
		new Thread(r1).start();
		while(bf1.next()||!bf1.isEmpty())
		{
			DataStar d=bf1.poll();
			if(d!=null) System.out.println(d);
		}
		final SegmentBuffer bf2=new SegmentBuffer(40);
		System.out.println("============== get_Sup====================================================================");
		Runnable r2 = new Runnable() {
	        public void run() {
	    	    if(f=='f')
	        	   get_Sup_Float(storageFolder+"/1",0.1F,bf2,preds);
	        	if(f=='d')
		        	get_Sup_Double(storageFolder+"/2",-0.20,bf2,preds);
	        	if(f=='i')
		        	get_Sup_Int(storageFolder+"/3",-499999,bf2,preds);
	        	if(f=='l')
		        	get_Sup_Long(storageFolder+"/4",5000000000L,bf2,preds);
	        	if(f=='s')
		        	get_Sup_Short(storageFolder+"/5",(short)241,bf2,preds);
	        		        	
	        };
		};
		
		new Thread(r2).start();
		while(bf2.next()||!bf2.isEmpty())
		{
			DataStar d=bf2.poll();
			if(d!=null) System.out.println(d);
		}
		
		final SegmentBuffer bf3=new SegmentBuffer(40);
		System.out.println("=============== get_Inf_Equal====================================================================");
		Runnable r3 = new Runnable() {
	        public void run() {
	        	 if(f=='f')
 	        	 get_Inf_Equal_Float(storageFolder+"/1",0.1F,bf3,preds);
	        	if(f=='d')
		        	get_Inf_Equal_Double(storageFolder+"/2",-0.20,bf3,preds);
	        	if(f=='i')
		        	get_Inf_Equal_Int(storageFolder+"/3",-499999,bf3,preds);
	        	if(f=='l')
		        	get_Inf_Equal_Long(storageFolder+"/4",5000000000L,bf3,preds);
	        	if(f=='s')
		        	get_Inf_Equal_Short(storageFolder+"/5",(short)241,bf3,preds);
	        		        	
	        };
		};
		new Thread(r3).start();
		while(bf3.next()||!bf3.isEmpty())
		{
			DataStar d=bf3.poll();
			if(d!=null) System.out.println(d);
		}
		

		final SegmentBuffer bf4=new SegmentBuffer(40);
		System.out.println("=============== get_Sup_Equal====================================================================");
		Runnable r4 = new Runnable() {
	        public void run() {
	        	 if(f=='f')
	 	        	 get_Sup_Equal_Float(storageFolder+"/1",0.1F,bf4,preds);
		        	if(f=='d')
			        	get_Sup_Equal_Double(storageFolder+"/2",-0.20,bf4,preds);
		        	if(f=='i')
			        	get_Sup_Equal_Int(storageFolder+"/3",-499999,bf4,preds);
		        	if(f=='l')
			        	get_Sup_Equal_Long(storageFolder+"/4",5000000000L,bf4,preds);
		        	if(f=='s')
			        	get_Sup_Equal_Short(storageFolder+"/5",(short)241,bf4,preds);
	        		        	
	        };
		};
		new Thread(r4).start();
		while(bf4.next()||!bf4.isEmpty())
		{
			DataStar d=bf4.poll();
			if(d!=null) System.out.println(d);
		}
		
		
		final SegmentBuffer bf5=new SegmentBuffer(40);
		System.out.println("===============get_Inf_Sup====================================================================");
		Runnable r5 = new Runnable() {
	        public void run() {
	        	 if(f=='f')
	        		 get_Inf_Sup_Float(storageFolder+"/1",0.1F,0.4F,bf5,preds);
		        	if(f=='d')
		        		get_Inf_Sup_Double(storageFolder+"/2",-0.40,-0.20,bf5,preds);
		        	if(f=='i')
		        		get_Inf_Sup_Int(storageFolder+"/3",-499999,10000,bf5,preds);
		        	if(f=='l')
		        		get_Inf_Sup_Long(storageFolder+"/4",5000000000L,5000100000L,bf5,preds);
		        	if(f=='s')
		        		get_Inf_Sup_Short(storageFolder+"/5",(short)50,(short)241,bf5,preds);
	        	
		        	
        		        	
	        };
		};
		
		
		new Thread(r5).start();
		while(bf5.next()||!bf5.isEmpty())
		{
			DataStar d=bf5.poll();
			if(d!=null) System.out.println(d);
		}
		
		System.out.println("===============get_Inf_Equal_Sup====================================================================");
		final SegmentBuffer bf6=new SegmentBuffer(40);
		Runnable r6 = new Runnable() {
	        public void run() {
	        	    if(f=='f')
	        		 get_Inf_Equal_Sup_Float(storageFolder+"/1",0.1F,0.4F,bf6,preds);
		        	if(f=='d')
		        		get_Inf_Equal_Sup_Double(storageFolder+"/2",-0.40,-0.20,bf6,preds);
		        	if(f=='i')
		        		get_Inf_Equal_Sup_Int(storageFolder+"/3",-499999,10000,bf6,preds);
		        	if(f=='l')
		        		get_Inf_Equal_Sup_Long(storageFolder+"/4",5000000000L,5000100000L,bf6,preds);
		        	if(f=='s')
		        		get_Inf_Equal_Sup_Short(storageFolder+"/5",(short)50,(short)241,bf6,preds);
	        	
	        		        	
	        };
		};
		

		new Thread(r6).start();
		while(bf6.next()||!bf6.isEmpty())
		{
			DataStar d=bf6.poll();
			if(d!=null) System.out.println(d);
		}
		
		System.out.println("===============get_Inf_Sup_Equal====================================================================");
		final SegmentBuffer bf7=new SegmentBuffer(40);
		Runnable r7 = new Runnable() {
	        public void run() {
	        	if(f=='f')
	        		get_Inf_Sup_Equal_Float(storageFolder+"/1",0.1F,0.4F,bf7,preds);
		        	if(f=='d')
		        		get_Inf_Sup_Equal_Double(storageFolder+"/2",-0.40,-0.20,bf7,preds);
		        	if(f=='i')
		        		get_Inf_Sup_Equal_Int(storageFolder+"/3",-499999,10000,bf7,preds);
		        	if(f=='l')
		        		get_Inf_Sup_Equal_Long(storageFolder+"/4",5000000000L,5000100000L,bf7,preds);
		        	if(f=='s')
		        		get_Inf_Sup_Equal_Short(storageFolder+"/5",(short)50,(short)241,bf7,preds);
	        	
	        		        	
	        };
		};
		
		
		new Thread(r7).start();
		while(bf7.next()||!bf7.isEmpty())
		{
			DataStar d=bf7.poll();
			if(d!=null) System.out.println(d);
		}
		System.out.println("===============get_Inf_Equal_Sup_Equal====================================================================");
		final SegmentBuffer bf8=new SegmentBuffer(40);
		Runnable r8 = new Runnable() {
	        public void run() {
	        	if(f=='f')
	        		get_Inf_Equal_Sup_Equal_Float(storageFolder+"/1",0.1F,0.4F,bf8,preds);
		        	if(f=='d')
		        		get_Inf_Equal_Sup_Equal_Double(storageFolder+"/2",-0.40,-0.20,bf8,preds);
		        	if(f=='i')
		        		get_Inf_Equal_Sup_Equal_Int(storageFolder+"/3",-499999,10000,bf8,preds);
		        	if(f=='l')
		        		get_Inf_Equal_Sup_Equal_Long(storageFolder+"/4",5000000000L,5000100000L,bf8,preds);
		        	if(f=='s')
		        		get_Inf_Equal_Sup_Equal_Short(storageFolder+"/5",(short)50,(short)241,bf8,preds);
	        		        		        	
	        };
		};
		
		
		new Thread(r8).start();
		while(bf8.next()||!bf8.isEmpty())
		{
			DataStar d=bf8.poll();
			if(d!=null) System.out.println(d);
		}
		
		//TreeMap<GradeasID,ArrayList<HyperEdge>> tmpResults=new TreeMap<GradeasID,ArrayList<HyperEdge>>();
		
		GradeasID id1 = null;
		if(f=='f')
			id1=new GradeasID(-0.999998F,1,1);
	    if(f=='d')
			id1=new GradeasID(-0.999998,1,1);
	    if(f=='i')
			id1=new GradeasID(-500000,1,1);
	    if(f=='l')
			id1=new GradeasID(-4999999999L,1,1);
	    if(f=='s')
		id1=new GradeasID(0,1,1);
		GradeasID id2= null;
		if(f=='f')
			id2=new GradeasID(-0.999994F,1,1);
		 if(f=='d')
			 id2=new GradeasID(-0.999994,1,1);
		 if(f=='i')
			 id2=new GradeasID(-499997,1,1);
		 if(f=='l')
			 id2=new GradeasID(-4999790587L,1,1);
		 if(f=='s')
			 id2=new GradeasID(1,1,1);
		GradeasID id3= null;
		if(f=='f')
			id3=new GradeasID(-0.999988F,1,1);	
		 if(f=='d')
			id3=new GradeasID(-0.999988,1,1);	
		 if(f=='i')
			 id3=new GradeasID(-499990,1,1);
		 if(f=='l')
			 id3=new GradeasID(-4999790435L,1,1);
		 if(f=='s')
			 id3=new GradeasID(2,1,1);
		GradeasID id4= null;
		if(f=='f')
			id4=new GradeasID(-0.999986F,1,1);	
		 if(f=='d')
		   id4=new GradeasID(-0.999986,1,1);	
		 if(f=='i')
			 id4=new GradeasID(-271759,1,1);
		 if(f=='l')
			 id4=new GradeasID(-4999789975L,1,1);
		 if(f=='s')
			 id4=new GradeasID(10,1,1);
		GradeasID id5= null;
		if(f=='f')
			id5=new GradeasID(-0.888222F,1,1);	
		 if(f=='d')
			id5=new GradeasID(-0.888222,1,1);	
		 if(f=='i')
		    id5=new GradeasID(-261171,1,1);
		 if(f=='l')
			 id5=new GradeasID(-4999789371L,1,1);
		 if(f=='s')
			 id5=new GradeasID(55,1,1);
		GradeasID id6= null;
		if(f=='f')
			id6=new GradeasID(-0.888220F,1,1);	
		 if(f=='d')
		    id6=new GradeasID(-0.888220,1,1);	
		 if(f=='i')
		    id6=new GradeasID(16466,1,1);
		 if(f=='l')
			 id6=new GradeasID(-4999687059L,1,1);
		 if(f=='s')
			 id6=new GradeasID(56,1,1);
		GradeasID id7= null;
		if(f=='f')
			id7=new GradeasID(0.236469F,1,1);	
		 if(f=='d')
			 id7=new GradeasID(0.236469,1,1);
		 if(f=='i')
			 id7=new GradeasID(16475,1,1);
		 if(f=='l')
			 id7=new GradeasID(-4999686087L,1,1);
		 if(f=='s')
			 id7=new GradeasID(65,1,1);
		GradeasID id8= null;
		if(f=='f')
			id8=new GradeasID(0.236473F,1,1);
		 if(f=='d')
			 id8=new GradeasID(0.236473,1,1);
		 if(f=='i')
			 id8=new GradeasID(34119,1,1);
		 if(f=='l')
			 id8=new GradeasID(-4999556463L,1,1);
		 if(f=='s')
			 id8=new GradeasID(80,1,1);
		GradeasID id9= null;
		if(f=='f')
			id9=new GradeasID(0.236479F,1,1);	
		 if(f=='d')
			 id9=new GradeasID(0.236479,1,1);
		 if(f=='i')
			 id9=new GradeasID(34124,1,1);
		 if(f=='l')
			 id9=new GradeasID(-4999555745L,1,1);
		 if(f=='s')
			 id9=new GradeasID(81,1,1);
		GradeasID id10= null;
		if(f=='f')
			id10=new GradeasID(0.236481F,1,1);	
		 if(f=='d')
			 id10=new GradeasID(0.236481,1,1);	
		 if(f=='i')
			 id10=new GradeasID(34369,1,1);
		 if(f=='l')
			 id10=new GradeasID(5000149410L,1,1);
		 if(f=='s')
			 id10=new GradeasID(120,1,1);

		GradeasID id11= null;
		if(f=='f')
			id11=new GradeasID(0.368237F,1,1);	
		 if(f=='d')
			 id11=new GradeasID(0.368237,1,1);	
		 if(f=='i')
			 id11=new GradeasID(101175,1,1);
		 if(f=='l')
			 id11=new GradeasID(5000149420L,1,1);
		 if(f=='s')
			 id11=new GradeasID(121,1,1);
		GradeasID id12= null;
		if(f=='f')
			id12=new GradeasID(0.444705F,1,1);	
		 if(f=='d')
			 id12=new GradeasID(0.444705,1,1);
		 if(f=='i')
			 id12=new GradeasID(118824,1,1);
		 if(f=='l')
			 id12=new GradeasID(5000590588L,1,1);
		 if(f=='s')
			 id12=new GradeasID(170,1,1);
		GradeasID id13= null;
		if(f=='f')
			id13=new GradeasID(0.444711F,1,1);	
		 if(f=='d')
			 id13=new GradeasID(0.444711,1,1);
		 if(f=='i')
		     id13=new GradeasID(191765,1,1);
		 if(f=='l')
			 id13=new GradeasID(5000590590L,1,1);
		 if(f=='s')
			 id13=new GradeasID(200,1,1);

		GradeasID id14= null;
		if(f=='f')
			id14=new GradeasID(0.512943F,1,1);	
		 if(f=='d')
			 id14=new GradeasID(0.512943,1,1);	
		 if(f=='i')
			 id14=new GradeasID(223532,1,1);
	    if(f=='l')
	    	 id14=new GradeasID(5000749410L,1,1);
	    if(f=='s')
	    	 id14=new GradeasID(202,1,1);

		GradeasID id15= null;
		if(f=='f')
			id15=new GradeasID(0.579997F,1,1);	
		 if(f=='d')
			 id15=new GradeasID(0.579997,1,1);	
		 if(f=='i')
			 id15=new GradeasID(298824,1,1);	
		 if(f=='l')
			 id15=new GradeasID(5000857644L,1,1);
		 if(f=='s')
			 id15=new GradeasID(220,1,1);

		GradeasID id16= null;
		if(f=='f')
			id16=new GradeasID(0.580001F,1,1);
		 if(f=='d')
			 id16=new GradeasID(0.580001,1,1);
		 if(f=='i')
			 id16=new GradeasID(347059,1,1);
		 if(f=='l')
			 id16=new GradeasID(5000857664L,1,1);
		 if(f=='s')
			 id16=new GradeasID(221,1,1);
			 */
/*
		tmpResults.put(id1, null);
		tmpResults.put(id2, null);
		tmpResults.put(id3, null);
		tmpResults.put(id4, null);
		tmpResults.put(id5, null);
		tmpResults.put(id6, null);
		tmpResults.put(id7, null);
		tmpResults.put(id8, null);
		tmpResults.put(id9, null);
		tmpResults.put(id10, null);
		tmpResults.put(id11, null);
		tmpResults.put(id12, null);
		tmpResults.put(id13, null);
		tmpResults.put(id14, null);
		tmpResults.put(id15, null);
		tmpResults.put(id16, null);
		System.out.println("===============Tab ====================================================================");
		final GradeasID[] ids=tmpResults.keySet().toArray(new GradeasID[0]);
		final SegmentBuffer bf9=new SegmentBuffer(5);
		Runnable r9 = new Runnable() {
	    public void run() {
	    if(f=='f')
		get_table_Float(storageFolder+"/1",ids,bf9,preds);
	    if(f=='d')
			get_table_Double(storageFolder+"/2",ids,bf9,preds);
	    if(f=='i')
			get_table_Int(storageFolder+"/3",ids,bf9,preds);
	    if(f=='l')
			get_table_Long(storageFolder+"/4",ids,bf9,preds);
	    if(f=='s')
			get_table_Short(storageFolder+"/5",ids,bf9,preds);
	    
	    };
	    };
	     	
	     		
	    new Thread(r9).start();
		while(bf9.next()||!bf9.isEmpty())
		{
			Thread.sleep(1L);
			DataStar d=bf9.poll();
			if(d!=null) System.out.println(d);
		}
	}
	*/

}
