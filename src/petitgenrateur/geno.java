package petitgenrateur;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class geno {
	static int nb_nodes=10000;
	static int sg=5;
	static int sg_in=10;
	static int sg_out=150;
	static char head_type='F';
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		ArrayList<Integer> objects=new ArrayList<Integer>();
		objects.add(5000);
		objects.add(5001);
		objects.add(5002);
		ArrayList<Integer> predicates=new ArrayList<Integer>();
		predicates.add(1);
		predicates.add(2);
		predicates.add(3);
		PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
		int j=(nb_nodes/2)*-1;
		int flag=1;
		for(int i=0;i<nb_nodes;i++)
		{
			String s="";
			switch (head_type){
				case 'I':s=Integer.toString(j);
				break;
				case 'L':s=Long.toString(5000000000L*flag+i);
				break;
				case 'F':s="0."+Integer.toString(i);
				break;
			}
			if(flag<0)
			{
			writer.println(s+" "+sg+" "+predicates.get(0)+" "+objects.get(0)+" "+sg_in+" "+sg_out);
			writer.println(s+" "+sg+" "+predicates.get(1)+" -"+objects.get(1)+" "+sg_in+" "+sg_out);
			writer.println(s+" "+sg+" "+predicates.get(2)+" 0."+objects.get(2)+" "+sg_in+" "+sg_out);
			}
			else
			{
				writer.println("-"+s+" "+sg+" "+predicates.get(0)+" "+objects.get(0)+" "+sg_in+" "+sg_out);
				writer.println("-"+s+" "+sg+" "+predicates.get(1)+" -"+objects.get(1)+" "+sg_in+" "+sg_out);
				writer.println("-"+s+" "+sg+" "+predicates.get(2)+" 0."+objects.get(2)+" "+sg_in+" "+sg_out);
			}
		j++;
		flag=flag*(-1);
		}
		
		writer.close();
	}

}
