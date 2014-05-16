import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;


public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null){
            return null;
        }
        
        Queue<UndirectedGraphNode> q = new LinkedList<UndirectedGraphNode>();
        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        Hashtable<UndirectedGraphNode, UndirectedGraphNode> visited = new Hashtable<UndirectedGraphNode, UndirectedGraphNode>();
        
        visited.put(node, cloneNode);
        q.add(node);
        while(!q.isEmpty()){
            
            UndirectedGraphNode cur = q.remove();
            UndirectedGraphNode curClone = visited.get(cur);
            ArrayList<UndirectedGraphNode> neighbors = cur.neighbors;
            for(int i=0;i<neighbors.size();i++){
                UndirectedGraphNode neighbor = neighbors.get(i);
                if(visited.containsKey(neighbor)){
                    UndirectedGraphNode neighborClone = visited.get(neighbor);
                    curClone.neighbors.add(neighborClone);
                }else{
                    UndirectedGraphNode neighborClone = new UndirectedGraphNode(neighbor.label);
                    curClone.neighbors.add(neighborClone);
                    visited.put(neighbor,neighborClone);
                    q.add(neighbor);
                }
            }
        }
        
        return cloneNode;
    }
}
