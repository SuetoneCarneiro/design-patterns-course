package decorator;

//Concrete Decorators: definem os comportamentos adicionais
// que podem ser acrescentados aos componentes dinamicamentes.
public class Leite extends AdicionalDecorator {
	 
	public Leite(Cafe cafe) {
	     super(cafe);
	 }
	
	 @Override
	 public String getDescricao() {
	     return cafeDecorado.getDescricao() + ", com leite";
	 }
	
	 @Override
	 public double getCusto() {
	     return cafeDecorado.getCusto() + 1.0;
	 }
}