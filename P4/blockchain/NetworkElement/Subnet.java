package blockchain.NetworkElement;

import java.util.HashSet;

/**
 * La clase Subnet representa una subred dentro de la red de blockchain, la cual puede contener múltiples nodos.
 * Esta estructura permite agrupar nodos para organizar mejor la red y potencialmente optimizar su funcionamiento.
 * 
 * @author Carlos García Santa y Joaquín Abad Díaz
 */
public class Subnet implements NetworkElement {
    private static int idcounter = 0; // Contador estático para asignar un ID único a cada subred creada.
    private int id; // ID único de la subred.
    private HashSet<Node> nodes; // Conjunto de nodos que pertenecen a esta subred.

    /**
     * Construye una nueva subred y opcionalmente inicializa con un conjunto de nodos.
     * 
     * @param nodes Nodos iniciales para incluir en la subred.
     */
    public Subnet(Node... nodes) {
        this.id = idcounter++; // Asigna el ID y luego incrementa el contador para la próxima subred.
        this.nodes = new HashSet<>();
        for (Node node : nodes) {
            this.nodes.add(node);
        }
    }

    /**
     * Añade un nodo a la subred.
     * 
     * @param node El nodo a añadir.
     */
    public void addNode(Node node) {
        this.nodes.add(node);
    }
    
    /**
     * Elimina un nodo de la subred.
     * 
     * @param node El nodo a eliminar.
     */
    public void removeNode(Node node) {
        this.nodes.remove(node);
    }

    /**
     * Proporciona una representación en cadena de la subred, incluyendo la cantidad de nodos
     * que contiene y una lista de estos nodos.
     * 
     * @return Una representación en cadena de la subred y sus nodos.
     */
    @Override
    public String toString() {
        String nodeList = "";
        for (Node node : nodes) {
            nodeList += "[" + node.toString() + "]";
        }
        return "Node network of " + nodes.size() + " nodes: " + nodeList;
    }
}
