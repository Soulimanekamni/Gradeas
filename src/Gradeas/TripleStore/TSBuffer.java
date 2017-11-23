package Gradeas.TripleStore;

import java.io.IOException;
import java.util.TreeMap;

import Gradeas.Structures.DataStar;
import Gradeas.Structures.GradeasID;
import Gradeas.Structures.Pair;


/*
 * GrdeasID, DataStar
 */
public class TSBuffer extends TreeMap<GradeasID,DataStar> {
	Integer limit=0;
	float partProcess=0.7f;
	float MaxAllocation=1.0f;
	int size=0;
	
	public TSBuffer(int limit)
	{
	this.limit=limit;
	}
	
	Boolean is_Full()
	{
		if(size>=limit) 
			return true;
		else return false;
	}
	/*
	 *  1 add done
	 * -1 TS buffer is full
	 */
	public int add(GradeasID key,DataStar value)
	{
		if(size<(limit*MaxAllocation)) 
		{
			this.put(key, value);
			size++;	
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	/*
	 *  1 add done
	 * -1 TS buffer is full
	 */
	public int add(DataStar value)
	{
		return add(value.head,value);
	}
	
	public Boolean can_Add()
	{
		if(size<(limit*MaxAllocation)) return true;
		else 
		{
			return false;
		}
	}
	public Boolean is_Processable()
	{
		float part=((float) this.size)/((float)limit);
		if(part>=partProcess) return true;
		else return false;
	}
	/*
	 * return the first element from the buffer
	 */
	
	public Pair<GradeasID,DataStar> poll()
	{
		if(this.size()>0)
		{
			Pair<GradeasID,DataStar> p=new Pair<>(this.firstEntry().getKey(),this.firstEntry().getValue());
			this.remove(p.getT());
			size--;
			return p;	 
		}
		else return null;
	}
}
