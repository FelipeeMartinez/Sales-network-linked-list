package vendedores;

public class VentasEmpresaArbol
{
	public float porcentajedescuentoafiliacion;
	public float porcentajecomision;
	public float afiliacioncuotainicial;
	
	NodoVendedor root;
	
	public float balance (NodoVendedor nodo) 
	{
		if (nodo == null) 
		{
			return 0;
		}
		float balanceLeft = balance(nodo.left);
		balanceLeft = balanceLeft * (porcentajecomision/100);
		
		float balanceRight = balance(nodo.right);
		balanceRight = balanceRight * (porcentajecomision/100);
		
		return afiliacioncuotainicial - (afiliacioncuotainicial * porcentajedescuentoafiliacion/100) 
				+ balanceRight + balanceLeft;
	}
	
	public float BalanceTotalEmpresa(NodoVendedor nodo) 
	{
		return balance(root) + balance(root.left) + balance(root.right);
	}
	
	public float balanceMenor(NodoVendedor nodo) 
	{
		if(root.left != null) 
		{
			if(root.right != null) 
			{
				return Math.min(balance(root), Math.min(balance(root.left), balance(root.right)));
			}
		}
		else 
		{
			if(root.right != null) 
			{
				return Math.min(balance(root), balance(root.right));
			}
		}
		return balance(root);
	}
	
	public float balanceMayor(NodoVendedor nodo) 
	{
		if(root.left != null) 
		{
			if(root.right != null) 
			{
				return Math.max(balance(root), Math.max(balance(root.left), balance(root.right)));
			}
		}
		else 
		{
			if(root.right != null) 
			{
				return Math.max(balance(root), balance(root.right));
			}
		}
		return balance(root);
	}

}
