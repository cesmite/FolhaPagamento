package br.com.ecommerce.modelo;

public class Produto {

    private int codigo;
    private String descricao;
    private int qtde;
    private float valorVenda;
    private float valorCompra;
 
    
    //modificador retorno nomeDoMetodo (tipoParametro nomeParametre){}
    
    //metodo retornarTotalCompra 
    public float retornarTotalCompra() {
    	return totalcompra * valorCompra;
    }
    
    //metodo retornarValor a Vista 10% de desconto
    public float retornarValorVista() {
    	return valorVista *0.9f;
    }
    
    //metodo retornarParcela
    public float retornarParcela(int pQtdeParcelas) {
    	return valorVenda / pQtdeParcelas;
    }    
 
    //metodo atualizar valor
    public void atualizarValores(float pPorcentagem) {
    	valorVenda = valorVenda  + valorVenda  * (pPorcentagem/100);
    	valorCompra = valorCompra + valorCompra * (pPorcentagem/100);
    }    
  
       
    //metodo retornar valor a vista    
    public float retornarValorVista(float pPorcentagem) {
    	return valorVenda - valorVenda * (pPorcentagem/100);
    } 
     
    
    public float retornarTotalVenda() {    
    	return quatidade * valorVenda;
    }
    	
    	
    public int retornarCodigo() {
    	return codigo;
    }
    
    public void preencherCodigo(int pCodigo) {
     	if(pCodigo>0) {
    		codigo = pCodigo;
    		
    	}
    }

    public void preencherDescricao(int pqdescricao) {
    	if (pdescricao > 0) {
    		descricao = pdescricao;    
    	}
    }
    
    public void preencherQuantidade(int pquantidade) {
    	if (pquantidade > 0) {
    		quantidade = pquantidade;
    	}
    }
    
    	public float retornarValorVenda() {
    		return valorVenda = valorVenda;
    	}

        public float retornarValorCompra() {
         	return valorCompra = valorCompra;
		
        	}
    	
    	public void preencherValorVenda(float pvalorVenda) {
    		valorVenda = pValorVenda;
    	}
    	
    	public void preencherValorCompra(float pvalorCompra) {
    		valorCompra = pValorCompra;    		
    	}	
}
