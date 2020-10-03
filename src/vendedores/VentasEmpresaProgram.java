package vendedores;

public class VentasEmpresaProgram 
{
	public static void main (String [] args) 
	{
		VentasEmpresaArbol ventasEmpresaArbol = new VentasEmpresaArbol();
		ventasEmpresaArbol.afiliacioncuotainicial = 1000;
		ventasEmpresaArbol.porcentajedescuentoafiliacion = 10;
		ventasEmpresaArbol.porcentajecomision = 25;
		
		ListaVendedores listaVendedores = new ListaVendedores();
		NodoVendedor nodoVendedor = new NodoVendedor();
		Vendedor v1 = new Vendedor();
		v1.nombre = "Jose";
		Vendedor v2 = new Vendedor();
		v2.nombre = "Pedro";
		Vendedor v3 = new Vendedor();
		v3.nombre = "Carlos";
		Vendedor v4 = new Vendedor();
		v4.nombre = "Lucas";
		Vendedor v5 = new Vendedor();
		v5.nombre = "Luisa";
		Vendedor v6 = new Vendedor();
		v6.nombre = "Maria";
		Vendedor v7 = new Vendedor();
		v7.nombre = "Daniel";
		Vendedor v8 = new Vendedor();
		v8.nombre = "Betty";
		Vendedor v9 = new Vendedor();
		v9.nombre = "Juan";
		Vendedor v10 = new Vendedor();
		v10.nombre = "Manuela";
		listaVendedores.add(v1);
		listaVendedores.add(v2);
		listaVendedores.add(v3);
		listaVendedores.add(v4);
		listaVendedores.add(v5);
		listaVendedores.add(v6);
		listaVendedores.add(v7);
		listaVendedores.add(v8);
		listaVendedores.add(v9);
		listaVendedores.add(v10);
		NodoVendedor jose = new NodoVendedor();
		NodoVendedor pedro = new NodoVendedor();
		NodoVendedor carlos = new NodoVendedor();
		NodoVendedor lucas = new NodoVendedor();
		NodoVendedor luisa = new NodoVendedor();
		NodoVendedor maria = new NodoVendedor();
		NodoVendedor daniel = new NodoVendedor();
		NodoVendedor betty = new NodoVendedor();
		NodoVendedor juan = new NodoVendedor();
		NodoVendedor manuela = new NodoVendedor();
		jose.left = pedro;
		jose.right = carlos;
		pedro.left = lucas;
		pedro.right = luisa;
		carlos.right = maria;
		lucas.left = daniel;
		lucas.right = betty;
		maria.left = juan;
		maria.right = manuela;
		
		
		ventasEmpresaArbol.root = jose;
		
		float balance = ventasEmpresaArbol.balance(pedro);
		System.out.print("Balance Pedro = " + balance + " " );
		float balanceTotal = ventasEmpresaArbol.BalanceTotalEmpresa(jose); 
		System.out.print("Balance total = " + balanceTotal + " ");
		float balanceMin = ventasEmpresaArbol.balanceMenor(jose);
		System.out.print("Balance minimo = " + balanceMin + " ");
		float balanceMax = ventasEmpresaArbol.balanceMayor(jose);
		System.out.print("Balance maximo = " + balanceMax);
		
	}

}
