package decorator;

// Cliente
public class MainCafeteria {
    public static void main(String[] args) {
    	
        // Café simples com leite e chantilly
        Cafe meuCafe1 = new Mocha();      
        meuCafe1 = new Leite(meuCafe1);
        meuCafe1 = new Chantilly(meuCafe1);
        
        System.out.println(meuCafe1.getDescricao() + " - R$" + meuCafe1.getCusto());
        System.exit(0);
        
        System.out.println(meuCafe1.getDescricao() + " - R$" + meuCafe1.getCusto());
        // Saída: Café simples (4.00) , com leite (1.50) , com chantilly (3.00) - R$8.50

        // Café expresso com caramelo e leite
        Cafe meuCafe2 = new CafeExpresso();
        meuCafe2 = new Caramelo(meuCafe2);
        meuCafe2 = new Leite(meuCafe2);
        
        System.out.println(meuCafe2.getDescricao() + " - R$" + meuCafe2.getCusto());
        // Saída: Café expresso, com caramelo, com leite - R$7.0
    }
}
