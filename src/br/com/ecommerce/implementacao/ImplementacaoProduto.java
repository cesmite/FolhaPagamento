package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class ImplementacaoProduto {

	public static void main(String[] args) {

		Produto objeto = new Produto();
        
		
		objeto.preencherCodigo(Interger.parseInt(JOptionPane.showInputDialog("Digite um c�digo")));
        objeto.preencherDescicao(JPotionPane.showInputDialog("Descricao: "));
        objeto.preencherValorQuantidade(Float.parseFloat(JOptionPane.showInputDialog("Quantidade")));
        objeto.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor de Compra")));
        objeto.preencherValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda")));        
       
        
        JOptionPane.showMessagemDialog(null,
        		"C�digo......:" +objeto.retornarCodigo() + "\n"+
        		"Descri��o...:" +objeto.retornarDescricao() + "\n"+
        		"Quantidade..:" +objeto.retornarQuantidade() + "\n"+
         		"Valor Venda.:" +objeto.retornarValorVenda()
        		);
        
        System.out.println("Total Venda: " + objeto.retornarTotalVenda());
        System.out.println("Total Compra: " + objeto.retornarTotalCompra());
        System.out.println("O valor a vista � de: %.2f", + objeto.retornarValorVista());
        System.out.println("Valor da parcela: " + objeto.retornarParcela(3));
        objeto.atualizarValores (10);
        System.out.println("Novo valor Venda: " + objeto.retornarValorVenda());
        System.out.println("Novo valor Compra: " + objeto.retornarValorCompra());
        System.out.println("Valor Vista Minha porcentagem: " + objeto.retornarValorVista(20));
        
	}

}
