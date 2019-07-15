import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * AdjMatrixGraph
 *     int V; //vertexs number
 *     int E; // Edges number
 *     int adj[][]; 
 *     AdjMatrixGraph(int V);
 *     addEdge(int src, int dest);
 *     contains(int src, int dest);
 */
public class AdjMatrixGraph
{
	private final int V;
	private int E;
	private boolean adj[][];
	public AdjMatrixGraph(int V)
	{
		this.V = V;
		this.E = 0;
		this.adj = new boolean[V][V];
	}
	
	public void addEdge(int src, int dest)
	{
		if (! adj[src][dest])
		{
			E++;
		}
		adj[src][dest] = true;
		adj[dest][src] = true;
	}
	
	public void removeEdge(int src, int dest)
	{
		if (adj[src][dest])
		{
			E--;
		}
		adj[src][dest] = false;
		adj[dest][src] = false;
	}
	
	public boolean contains(int src, int dest)
	{
		return adj[src][dest];
	}
	
	/*
	public void printGraph()
	{
		for (int i = 0; i < V; i++)
		{
			System.out.println("vertex " + i + " list: ");
			System.out.print("head");
			for (int j = 0; j < V; j++)
			{
				if (adj[i][j])
				{
					System.out.print("->" + j + " ");
				}
			}
			System.out.println();
		}
	}
	*/
	
	public void printGraphMatrix()
	{
		for (int i = 0; i < V; i++)
		{
			for (int j = 0; j < V; j++)
			{
				System.out.print(adj[i][j] ? 1 : 0);
				
			}
			System.out.println();
		}
		System.out.println();
		return;
	}
	
	
	public static void main(String[] args)
	{
		AdjMatrixGraph graph = new AdjMatrixGraph(5);
		graph.addEdge(0, 1); 
		graph.addEdge(0, 4); 
		graph.addEdge(1, 2); 
		graph.addEdge(1, 3); 
		graph.addEdge(1, 4); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 4);
		graph.printGraphMatrix();
		graph.removeEdge(0, 1);
		graph.printGraphMatrix();
		return;
	}
}