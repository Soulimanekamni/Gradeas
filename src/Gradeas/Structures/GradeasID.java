package Gradeas.Structures;

import java.io.Serializable;

public class GradeasID implements Comparable,Cloneable,Serializable  {

	Object value;
	char type='l';
	int In_Sg;
	int out_Sg;
	
@Override
public String toString() {
	 return "GradeasID [id=" + value.toString() + "]";

}
public char get_Type_Value()
{
	return type;
}
public String getValue()
{
	return value.toString();
}
public float get_Float_Value()
{
	return ((Float) value).floatValue();
}
public int get_Int_Value()
{
	return ((Integer) value).intValue();
}
public long get_Long_Value()
{
	return ((Long) value).longValue();
}
public double get_Double_Value()
{
	return ((Double) value).doubleValue();
}
public short get_Short_Value()
{
	return ((Integer) value).shortValue();
}
public String  get_String_Value()
{
	return (String) value;
}
/*
public GradeasID(char type,String value)
{
	this.type=type;
	 switch (type) {
	 case 'l':lvalue=Long.valueOf(value);
	 case 'i':ivalue=Integer.parseInt(value);
	 case 'f':fvalue=Float.parseFloat(value);
	 case 'd':dvalue=Double.valueOf(value);
	 case 's':svalue=value;
	 case 'S':Svalue=Short.parseShort(value);
	 }
}*/
public GradeasID(long lvalue,int Sg_In,int Sg_Out)
{
	type='l';
	value=new Long(lvalue);
	this.In_Sg=Sg_In;
	this.out_Sg=Sg_Out;
}
public GradeasID(int ivalue,int Sg_In,int Sg_Out)
{
	type='i';
	value=new Integer(ivalue);
	this.In_Sg=Sg_In;
	this.out_Sg=Sg_Out;
}
public GradeasID(float fvalue,Integer Sg_In,Integer Sg_Out)
{
	type='f';
	value=new Float(fvalue);
	this.In_Sg=Sg_In;
	this.out_Sg=Sg_Out;
}
public GradeasID(double dvalue,Integer Sg_In,Integer Sg_Out)
{
	type='d';
	value=new Double(dvalue);
	this.In_Sg=Sg_In;
	this.out_Sg=Sg_Out;
}
public GradeasID(short svalue,Integer Sg_In,Integer Sg_Out)
{
	type='s';
	value=new Short(svalue);
	this.In_Sg=Sg_In;
	this.out_Sg=Sg_Out;
}

/*
public GradeasID(String ID,Integer SgOut,Integer SgIn)
{
	lvalue=Long.valueOf(ID);
	out_Sg=SgOut;
	In_Sg=SgIn;
}

public GradeasID(Long IDMachine)
{
	lvalue=IDMachine<<52;
}
*/
public void set_in_sg(int sg)
{
	In_Sg=sg;
}
public Integer get_in_sg()
{
	
	return In_Sg;
}

public Integer get_out_sg()
{
	
	return out_Sg;
}



@Override
public int compareTo(Object arg0) {
	 switch (type) {
	 case 'l':return ((Long)this.value).compareTo((Long)((GradeasID) arg0).value);
	 case 'i':return ((Integer) this.value).compareTo((Integer) ((GradeasID) arg0).value);
	 case 'f':return ((Float) this.value).compareTo((Float) ((GradeasID) arg0).value);
	 case 'd':return ((Double) this.value).compareTo((Double) ((GradeasID) arg0).value);
	 case 's':return ((String) this.value).compareTo((String) ((GradeasID) arg0).value);
	 case 'S':return ((Short) this.value).compareTo((Short) ((GradeasID) arg0).value);
	 }
	 return 0;
}
public Object clone() throws CloneNotSupportedException {
	GradeasID tmp=(GradeasID) super.clone();
	Object TmpId = null;
	switch (type) {
	 case 'l':TmpId= new Long(((Long)this.value).longValue());
	 case 'i':TmpId= new Integer(((Integer)this.value).intValue());
	 case 'f':TmpId= new Float(((Float)this.value).floatValue());
	 case 'd':TmpId= new Double(((Double)this.value).doubleValue());
	 case 's':TmpId= new String(((String)this.value));
	 case 'S':TmpId= new Short(((Short)this.value).shortValue());;
	 }
	tmp.value=TmpId;
	tmp.type=this.type;
    return tmp;
  }

public boolean satisfyinglessthen(String value) {
	 switch (type) {
	 case 'l':if((Long)this.value<Long.valueOf(value)) return true;break;
	 case 'i':if((Integer)this.value<Integer.parseInt(value)) return true;break;
	 case 'f':if((Float)this.value<Float.parseFloat(value)) return true;break;
	 case 'd':if((Double) this.value<Double.valueOf(value)) return true;break;
	 case 'S':if((Short)this.value<Short.parseShort(value)) return true;break;
	 }
	return false;
}
public boolean satisfyinglessorequalthen(String value) {
	 switch (type) {
	 case 'l':if((Long)this.value<=Long.valueOf(value)) return true;break;
	 case 'i':if((Integer)this.value<=Integer.parseInt(value)) return true;break;
	 case 'f':if((Float)this.value<=Float.parseFloat(value)) return true;break;
	 case 'd':if((Double) this.value<=Double.valueOf(value)) return true;break;
	 case 'S':if((Short)this.value<=Short.parseShort(value)) return true;break;
	 }
	return false;
}
public boolean satisfyinggreatthen(String value) {
	 switch (type) {
	 case 'l':if((Long)this.value>Long.valueOf(value)) return true;break;
	 case 'i':if((Integer)this.value>Integer.parseInt(value)) return true;break;
	 case 'f':if((Float)this.value>Float.parseFloat(value)) return true;break;
	 case 'd':if((Double) this.value>Double.valueOf(value)) return true;break;
	 case 'S':if((Short)this.value>Short.parseShort(value)) return true;break;
	 }
	return false;
}
public boolean satisfyinggreatorequalthen(String value) {
	 switch (type) {
	 case 'l':if((Long)this.value>=Long.valueOf(value)) return true;break;
	 case 'i':if((Integer)this.value>=Integer.parseInt(value)) return true;break;
	 case 'f':if((Float)this.value>=Float.parseFloat(value)) return true;break;
	 case 'd':if((Double) this.value>=Double.valueOf(value)) return true;break;
	 case 'S':if((Short)this.value>=Short.parseShort(value)) return true;break;
	 }
	return false;
}
public boolean satisfyinglessthenandgreatthen(String value1,String value2) {
	 switch (type) {
	 case 'l':if(((Long)this.value<Long.valueOf(value1))&&((Long)this.value>Long.valueOf(value2))) 
		 return true;break;
	 case 'i':if(((Integer)this.value<Integer.parseInt(value1))&&((Integer)this.value>Integer.parseInt(value2))) return true;break;
	 case 'f':if(((Float)this.value<Float.parseFloat(value1))&&((Float)this.value>Float.parseFloat(value1))) return true;break;
	 case 'd':if(((Double) this.value<Double.valueOf(value1))&&((Double) this.value>Double.valueOf(value1))) return true;break;
	 case 'S':if(((Short)this.value<Short.parseShort(value1))&&((Short)this.value>Short.parseShort(value1))) return true;break;
	 }
	return false;
}
public boolean satisfyinglessorequalthenandgreatthen(String value1,String value2) {
	 switch (type) {
	 case 'l':if(((Long)this.value<=Long.valueOf(value1))&&((Long)this.value>Long.valueOf(value2))) return true;break;
	 case 'i':if(((Integer)this.value<=Integer.parseInt(value1))&&((Integer)this.value>Integer.parseInt(value2))) return true;break;
	 case 'f':if(((Float)this.value<=Float.parseFloat(value1))&&((Float)this.value>Float.parseFloat(value1))) return true;break;
	 case 'd':if(((Double) this.value<=Double.valueOf(value1))&&((Double) this.value>Double.valueOf(value1))) return true;break;
	 case 'S':if(((Short)this.value<=Short.parseShort(value1))&&((Short)this.value>Short.parseShort(value1))) return true;break;
	 }
	return false;
}
public boolean satisfyinglessthenandgreatorequalthen(String value1,String value2) {
	 switch (type) {
	 case 'l':if(((Long)this.value<Long.valueOf(value1))&&((Long)this.value>=Long.valueOf(value2))) return true;break;
	 case 'i':if(((Integer)this.value<Integer.parseInt(value1))&&((Integer)this.value>=Integer.parseInt(value2))) return true;break;
	 case 'f':if(((Float)this.value<Float.parseFloat(value1))&&((Float)this.value>=Float.parseFloat(value1))) return true;break;
	 case 'd':if(((Double) this.value<Double.valueOf(value1))&&((Double) this.value>=Double.valueOf(value1))) return true;break;
	 case 'S':if(((Short)this.value<Short.parseShort(value1))&&((Short)this.value>=Short.parseShort(value1))) return true;break;
	 }
	return false;
}
public boolean satisfyinglessorequalthenandgreatorequalthen(String value1,String value2) {
	 switch (type) {
	 case 'l':if(((Long)this.value<=Long.valueOf(value1))&&((Long)this.value>=Long.valueOf(value2))) return true;break;
	 case 'i':if(((Integer)this.value<=Integer.parseInt(value1))&&((Integer)this.value>=Integer.parseInt(value2))) return true;break;
	 case 'f':if(((Float)this.value<=Float.parseFloat(value1))&&((Float)this.value>=Float.parseFloat(value1))) return true;break;
	 case 'd':if(((Double) this.value<=Double.valueOf(value1))&&((Double) this.value>=Double.valueOf(value1))) return true;break;
	 case 'S':if(((Short)this.value<=Short.parseShort(value1))&&((Short)this.value>=Short.parseShort(value1))) return true;break;
	 }
	return false;
}

}
	/*
	public GradeasID()
	{
		super(64);
		
	}
	public GradeasID(long l)
	{
		    int index = 0;
		    while (l != 0L) {
		      if (l % 2L != 0) {
		        this.set(index);
		      }
		      ++index;
		      l = l >>> 1;
		    }
	}
	public GradeasID generate_Next()
	{
		
		
		return null;
	}
	
	public int get_IDmachine()
	{
		int bitInteger = 0;
	    for(int i = 53 ; i < 64; i++)
	        if(this.get(i))
	            bitInteger |= (1 << (i-53));
	    return bitInteger;	
	}
	public Integer get_IDObject()
	{
		
		return null;
		
	}
	public long to_long()
	{
		 long value = 0L;
		    for (int i = 0; i < this.length()-1; ++i) {
		      value += this.get(i) ? (1L << i) : 0L;
		    }
		    return value;
	}

	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}*/