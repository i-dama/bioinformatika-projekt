package hr.fer.zesoi.bioinfo.models;

import java.util.HashMap;
import java.util.List;

public class OverlapGraph {
		
	/**
	 * Holds non-contained reads that are may or may not be interconnected with each other
	 * Key - Read id
	 * Value - Read
	 */
	private HashMap<Integer, Read> readsInGraph;
	/**
	 * Holds the reads that are contained by some other read in the graph
	 * Key - Read id
	 * Value Read
	 */
	private HashMap<Integer, Read> containedReads;
	/**
	 * Holds the containment information..
	 * Key - id of the read that contains others
	 * Value - list of edges that represent that containment
	 */
	private HashMap<Integer, List<Edge>> containmentInfo;
	/**
	 * List of reads that are not connected in the input ovelap graph
	 */
	
	private HashMap<Integer, Chunk> chunksInGraph;
	
	public OverlapGraph(HashMap<Integer, Read> readsInGraph,
			HashMap<Integer, Read> containedReads,
			HashMap<Integer, List<Edge>> containmentInfo) {
		super();
		this.readsInGraph = readsInGraph;
		this.containedReads = containedReads;
		this.containmentInfo = containmentInfo;
	}

	public HashMap<Integer, Read> getReadsInGraph() {
		return readsInGraph;
	}

	public HashMap<Integer, Read> getContainedReads() {
		return containedReads;
	}

	public HashMap<Integer, List<Edge>> getContainmentInfo() {
		return containmentInfo;
	}

	public HashMap<Integer, Chunk> getChunksInGraph() {
		return chunksInGraph;
	}

	public void setChunksInGraph(HashMap<Integer, Chunk> chunksInGraph) {
		this.chunksInGraph = chunksInGraph;
	}
	
	
	
	
	
}
