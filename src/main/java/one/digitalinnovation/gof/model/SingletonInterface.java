package one.digitalinnovation.gof.model;

public interface SingletonInterface{
  
  public String cep;
	public String logradouro;
	public String complemento;
	public String bairro;
	public String localidade;
	public String uf;
	public String ibge;
	public String gia;
	public String ddd;
	public String siafi;

  
  public static String getCep() {
		return cep;
	}

   public static String getLogradouro() {
		return logradouro;
	}

  public static String getComplemento() {
		return complemento;
	}
  public static String getBairro() {
		return bairro;
	}

  public static String getLocalidade() {
		return localidade;
	}
  public static String getUf() {
		return uf;
	}
  public static String getIbge() {
		return ibge;
	}

  public static String getGia() {
		return gia;
	}
  public static String getDdd() {
		return ddd;
	}
  public static String getSiafi() {
		return siafi;
	}
}
