package view;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
 public static void main(String[]args) {

	 PessoaFisica pf=new PessoaFisica();
	 PessoaJuridica pj=new PessoaJuridica();
	 pf.setBairro("guaianases");
	 pf.setEstado("SP");
	 pf.setCpf(353246418);
	 pf.setEndereco("estrada do lajeado velho");
	 pf.setCidade("Sao Paulo");
	 pf.setTelefone(33054402);
	 pf.setCep(11111111);
	 pf.setNome("Leonardo");
	 pf.setRg(4266626);
	 pf.setSexo("masc");
	 
	
	 pj.setBairro("Jd triangulo");
	 pj.setEstado("SP");
	 pj.setCnpj(334865212);
	 pj.setEndereco("estrada do lajeado velho");
	 pj.setCidade("Ferraz de Vasconcellos");
	 pj.setTelefone(33054402);
	 pj.setCep(222222222);
	 pj.setIe(22522235);
	 pj.setIm(33546558);
	 pj.setRazao("MagnosInformatica");
	 
	 
	 System.out.println("Pessoa Fisica\n"+"\nCpf: "+pf.getCpf()+"\nNome: "+pf.getNome()+"\nRg: "+pf.getRg()+"\nSexo"+pf.getSexo()+
			 "\ntelefone: "+pf.getTelefone()+"\nendereco: "+pf.getEndereco()+"\nbairro: "+pf.getBairro()+
			 "\nCep:"+pf.getCep()+"\ncidade: "+pf.getCidade()+"\nEstado: "+pf.getEstado());
	 pf.falar();
	 
	 System.out.println("\nPessoa juridica\n"+"\nCnpj: "+pj.getCnpj()+"\nRazão: "+pj.getRazao()+"\nIM: "+pj.getIm()+"\nIE: "+
	 pj.getIe()+"\ntelefone: "+pj.getTelefone()+"\nendereco: "+pj.getEndereco()+"\nbairro: "+pj.getBairro()+"\nCep:"+pj.getCep()+
	 "\ncidade: "+pj.getCidade()+"\nEstado: "+pj.getEstado());
	 pj.falar();
	 
 }
}
