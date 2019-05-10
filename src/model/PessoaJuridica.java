package model;

public class PessoaJuridica extends Pessoa {
	private long cnpj;
	private long im;
	private long ie;
	private String razao;
	

	public long getIm() {
		return im;
	}

	public void setIm(long im) {
		this.im = im;
	}

	public long getIe() {
		return ie;
	}

	public void setIe(long ie) {
		this.ie = ie;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void falar() {
		System.out.println("Pessoa juridica Falando");
		
	}
}
