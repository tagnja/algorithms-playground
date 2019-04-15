package com.taogen.ds;

import java.util.LinkedList;

/**
 * Graph
 *     int V;
 *     LinkedList adjListArray[];
 *     Graph(V);
 *     addEdge(int src, int dest);
 *     removeEdge(int src, int dest);
 *     printGraph();
 */
public class Graph 
{
	int V;
	LinkedList<Integer> adjListArray[];
	
	@SuppressWarnings("unchecked")
	public Graph(int V) 
	{
		this.V = V;
		adjListArray = new LinkedList[V];
		
		for (int i = 0; i < adjListArray.length; i++)
		{
			adjListArray[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int src, int dest)
	{
		if (src > V - 1 || src < 0 || dest > V-1 || dest <0)
		{
			System.out.println("Failed to add edge of graph! Cause by invalid parameter.");
		}
		else
		{
			adjListArray[src].add(dest);
			adjListArray[dest].add(src);
		}
	}
	
	void removeEdge(int src, int dest)
	{
		if (src > V - 1 || src < 0 || dest > V-1 || dest <0)
		{
			System.out.println("Failed to add edge of graph! Cause by invalid parameter.");
		} 
		else
		{
			adjListArray[src].remove(Integer.valueOf(dest));
			adjListArray[dest].remove(Integer.valueOf(src));
		}
	}
	
	void printGraph()
	{
		for (int v = 0; v < this.V; v++)
		{
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer i : adjListArray[v])
			{
				System.out.print("->" + i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Graph graph = new Graph(5);
		graph.addEdge(0, 1); 
		graph.addEdge(0, 4); 
		graph.addEdge(1, 2); 
		graph.addEdge(1, 3); 
		graph.addEdge(1, 4); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 4);
		graph.printGraph();
		
		graph.removeEdge(0, 1);
		graph.printGraph();
	}
}
