package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author falvojr
 */
@Entity
public class Endereco implements SingletonInterface{

	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	

	public void setCep(String cep) {
		this.cep = cep;
	}

	

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	

	public void setUf(String uf) {
		this.uf = uf;
	}

	

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	

	public void setGia(String gia) {
		this.gia = gia;
	}

	

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

}
