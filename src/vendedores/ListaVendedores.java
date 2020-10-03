package vendedores;

public class ListaVendedores 
{
	NodoVendedor head;
	NodoVendedor left;
	NodoVendedor right;
	
	
	void add(Vendedor v){
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = v;
		
		//La lista está vacía
		if(head == null){
			head = nuevoNodo;
		}
		else { //La lista no está vacía
			NodoVendedor ultimo = head;
			while(ultimo.next != null) {
				ultimo = ultimo.next;			
			}
			
			ultimo.next = nuevoNodo;
		}
	}

}
