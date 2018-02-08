package Gradeas.Structures;

import java.util.TreeMap;
import java.util.TreeSet;

public class DataStar implements Comparable<DataStar> {
	public GradeasID head;
	public TreeMap<Integer, TreeSet<GradeasID>> arcs;

	public GradeasID getHead() {
		return head;
	}
	public void setHead(GradeasID newhead)
	{
		head=newhead;
	}

	public void setHeadLong(long value,int sg) {
		GradeasID id=new GradeasID(value,sg,0);
		this.head = id;
	}
	public void setHeadFloat(float value,int sg) {
		GradeasID id=new GradeasID(value,sg,0);
		this.head = id;
	}
	public void setHeadInt(int value,int sg) {
		GradeasID id=new GradeasID(value,sg,0);
		this.head = id;//
	}
	public void setHeadShort(short value,int sg) {
		GradeasID id=new GradeasID(value,sg,0);
		this.head = id;
	}
	public void setHeadDouble(double value,int sg) {
		//System.out.println("Call Set Head Double");
		GradeasID id=new GradeasID(value,sg,0);
		this.head = id;
	}


	public DataStar(){
		arcs= new TreeMap<Integer, TreeSet<GradeasID>> ();

	}
// override compareTo methode of the coparable interface
	@Override
	public int compareTo(DataStar o) {
		if(this.head==o.head){
			return 0;
		}
		return head.compareTo(o.head);

	}

	@Override
	public String toString() {
		return "DataStar [head=" + head + ", arcs=" + arcs + "]";
	}

	public void addArcLong(int p, long V2,int Sg_in, int Sg_out) {
		//System.out.println("Call Add Arc Long");
		GradeasID id=new GradeasID(V2,Sg_in,Sg_out);
		if(arcs.containsKey(p)) arcs.get(p).add(id);
		else
		{
			TreeSet<GradeasID> neighbors=new TreeSet<GradeasID>();
			neighbors.add(id);
			arcs.put(p,neighbors);
		}
	}
	public void addArcInt(int p, int V2,int Sg_in, int Sg_out) {
		GradeasID id=new GradeasID(V2,Sg_in,Sg_out);
		if(arcs.containsKey(p)) arcs.get(p).add(id);
		else
		{
			TreeSet<GradeasID> neighbors=new TreeSet<GradeasID>();
			neighbors.add(id);
			arcs.put(p,neighbors);
		}
	}
	public void addArcFloat(int p, float V2,int Sg_in, int Sg_out) {
		GradeasID id=new GradeasID(V2,Sg_in,Sg_out);
		if(arcs.containsKey(p)) arcs.get(p).add(id);
		else
		{
			TreeSet<GradeasID> neighbors=new TreeSet<GradeasID>();
			neighbors.add(id);
			arcs.put(p,neighbors);
		}
	}
	public void addArcDouble(int p, double V2,int Sg_in, int Sg_out) {
		GradeasID id=new GradeasID(V2,Sg_in,Sg_out);
		if(arcs.containsKey(p)) arcs.get(p).add(id);
		else
		{
			TreeSet<GradeasID> neighbors=new TreeSet<GradeasID>();
			neighbors.add(id);
			arcs.put(p,neighbors);
		}
	}
	public void addArcShort(int p, short V2,int Sg_in, int Sg_out) {
		GradeasID id=new GradeasID(V2,Sg_in,Sg_out);
		if(arcs.containsKey(p)) arcs.get(p).add(id);
		else
		{
			TreeSet<GradeasID> neighbors=new TreeSet<GradeasID>();
			neighbors.add(id);
			arcs.put(p,neighbors);
		}
	}

}
