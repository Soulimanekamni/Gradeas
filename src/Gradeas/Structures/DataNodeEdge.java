package Gradeas.Structures;

public class DataNodeEdge {
	
	//private int id;
	private int edgeLabel;
	private int nodeLabel;
	
	/**
	 * Constructors
	 */
	public DataNodeEdge(){
		
	}
	public DataNodeEdge(int edge, int node) {
		//this.id=id;
		edgeLabel=edge;
		nodeLabel=node;
	}
	
	/**
	 * Methods
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataNodeEdge other = (DataNodeEdge) obj;
		if (edgeLabel == 0) {
			if (other.edgeLabel != 0)
				return false;
		} else if (edgeLabel!=other.edgeLabel)
			return false;

		if (nodeLabel == 0) {
			if (other.nodeLabel != 0)
				return false;
		} else if (nodeLabel!=other.nodeLabel)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "NodeEdge [ edgeLabel=" + edgeLabel
				+ ", nodeLabel=" + nodeLabel + "]";
	}
	/**
	 * Getters and Setters
	 */
	/*public int getId() {
		return id;
	}*/
	public int getEdgeLabel() {
		return edgeLabel;
	}
	public int getNodeLabel() {
		return nodeLabel;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public void setEdgeLabel(int edgeLabel) {
		this.edgeLabel = edgeLabel;
	}
	public void setNodeLabel(int nodeLabel) {
		this.nodeLabel = nodeLabel;
	}
	
	

}
